/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import BD.conexaoBD;
import Modelo.ContatoFormulario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author jonat
 */
public class ConexaoFormulario {
    private final Connection conexao;
    
    public ConexaoFormulario(){
        this.conexao = new conexaoBD().getConnection();
    }
    public void EnviarFormulario(Modelo.ContatoFormulario formulario){
    String sql = "INSERT INTO formularios (id, Nome, Idade, AreaInteresse, Descricao, Data, Status) VALUES (?, ?, ?, ?, ?, ?, ?)";
    try {
    PreparedStatement ps = conexao.prepareStatement(sql);
     ps.setInt(1, formulario.getId());
    ps.setString(2, formulario.getNome());
    ps.setString(3, formulario.getIdade());
    ps.setString(4, formulario.getAreaInteresse());
    ps.setString(5, formulario.getDescricao());
    ps.setDate(6, formulario.getData());
    ps.setString(7, formulario.getStatus());
    ps.execute();
    ps.close();
 }

    catch(SQLException e) {
        throw new RuntimeException(e);
    }
    
 }
    
   public List<ContatoFormulario> listaFormularios() {
    List<ContatoFormulario> listaDeFormularios = new ArrayList();
    String sql = "SELECT * FROM formularios";
    
    try {
        PreparedStatement ps = conexao.prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
        
        while (rs.next()) {
            ContatoFormulario pegaFormulario = new ContatoFormulario();
            pegaFormulario.setId(rs.getInt("id"));
            pegaFormulario.setNome(rs.getString("Nome"));
            pegaFormulario.setIdade(rs.getString("Idade"));
            pegaFormulario.setAreaInteresse(rs.getString("AreaInteresse"));
            pegaFormulario.setDescricao(rs.getString("Descricao"));
            pegaFormulario.setData(rs.getDate("Data"));
            pegaFormulario.setStatus(rs.getString("Status"));

            listaDeFormularios.add(pegaFormulario); 
        }

        return listaDeFormularios;
    } catch (SQLException e) {
        throw new RuntimeException(e);
    }  
}
   
public void deletarFormularioPorId(int id) {
    Connection conexao = new conexaoBD().getConnection();
    try {
        // Deleta os registros da tabela dependente
        String sql1 = "DELETE FROM formularios_usuario WHERE id_formulario = ?";
        PreparedStatement ps1 = conexao.prepareStatement(sql1);
        ps1.setInt(1, id);
        ps1.executeUpdate();

        // Agora deleta o formulário
        String sql2 = "DELETE FROM formularios WHERE id = ?";
        PreparedStatement ps2 = conexao.prepareStatement(sql2);
        ps2.setInt(1, id);
        ps2.executeUpdate();
        ps1.close();
        ps2.close();

    } catch (SQLException e) {
        throw new RuntimeException("Erro ao tentar deletar formulário: " + id, e);
    }
}


public ContatoFormulario getFormularioById(int id) {
       ContatoFormulario pegaFormulario = new ContatoFormulario();
        String sql = "SELECT * FROM formularios WHERE id = ?";
        try {
            PreparedStatement ps = conexao.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                 pegaFormulario.setId(rs.getInt("id"));
            pegaFormulario.setNome(rs.getString("Nome"));
            pegaFormulario.setIdade(rs.getString("Idade"));
            pegaFormulario.setAreaInteresse(rs.getString("AreaInteresse"));
            pegaFormulario.setDescricao(rs.getString("Descricao"));
            pegaFormulario.setData(rs.getDate("Data"));
            pegaFormulario.setStatus(rs.getString("Status"));
            }
            rs.close();
            ps.close();
            return pegaFormulario;
        }
        catch (SQLException e) {
            throw new RuntimeException("Erro ao tentar editar formulário: " + id, e);
        }
    }
    

    public void atualizarFormulario (ContatoFormulario contato){
         String sql = "UPDATE formularios SET Nome = ?, Idade = ?, AreaInteresse = ?, Descricao = ?, Data = ? WHERE id =?";
            try {
             PreparedStatement ps = conexao.prepareStatement(sql);
              ps.setString(1, contato.getNome());
              ps.setString(2, contato.getIdade());
              ps.setString(3, contato.getAreaInteresse());
              ps.setString(4, contato.getDescricao());
              ps.setDate(5, contato.getData());
              ps.setInt(6, contato.getId());
              ps.executeUpdate();
              ps.close();
          }

             catch(SQLException e) {
                 throw new RuntimeException(e);
             }
     }
    
        public List<ContatoFormulario> listarFormulariosSalvosPorUsuario(int idUsuario) {
        List<ContatoFormulario> lista = new ArrayList<>();
        String sql ="SELECT f.*\n" +
"        FROM formularios f\n" +
"        JOIN formularios_usuario fu ON f.id = fu.id_formulario\n" +
"        WHERE fu.id_usuario = ?";
    try {
        PreparedStatement ps = conexao.prepareStatement(sql);
        ps.setInt(1, idUsuario);
        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            ContatoFormulario formulario = new ContatoFormulario();
            formulario.setId(rs.getInt("id"));
            formulario.setNome(rs.getString("Nome"));
            formulario.setIdade(rs.getString("Idade"));
            formulario.setAreaInteresse(rs.getString("AreaInteresse"));
            formulario.setDescricao(rs.getString("Descricao"));
            formulario.setData(rs.getDate("Data"));
            formulario.setStatus(rs.getString("Status"));
            lista.add(formulario);
        }
        rs.close();
        ps.close();
    } catch (SQLException e) {
        throw new RuntimeException(e);
    }
    return lista;
}
        
    public boolean salvarFormularioParaUsuario(int idUsuario, int idFormulario) {
     String sqlVerifica = "SELECT * FROM formularios_usuario WHERE id_usuario = ? AND id_formulario = ?";
     String sqlInserir = "INSERT INTO formularios_usuario (id_usuario, id_formulario) VALUES (?, ?)";

     try {
         PreparedStatement psVerifica = conexao.prepareStatement(sqlVerifica);
         psVerifica.setInt(1, idUsuario);
         psVerifica.setInt(2, idFormulario);
         ResultSet rs = psVerifica.executeQuery();

         if (rs.next()) {
             return false; // Já existe
         }

         PreparedStatement psInserir = conexao.prepareStatement(sqlInserir);
         psInserir.setInt(1, idUsuario);
         psInserir.setInt(2, idFormulario);
         psInserir.executeUpdate();
         return true;

     } catch (SQLException e) {
         throw new RuntimeException(e);
     }
}
    
    public void atualizarStatus (ContatoFormulario contato){
         String sql = "UPDATE formularios SET Status = ? WHERE id =?";
            try {
             PreparedStatement ps = conexao.prepareStatement(sql);
              ps.setString(1, contato.getStatus());
              ps.setInt(2, contato.getId());
              ps.executeUpdate();
              ps.close();
          }

             catch(SQLException e) {
                 throw new RuntimeException(e);
             }
     }

    
}
  

    



