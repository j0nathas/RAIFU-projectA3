/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import BD.conexaoBD;
import Interface.Usuario.Login.UsuarioLogado;
import Modelo.Contato;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author 825155650
 */
public class ContatoDAO {
    private final Connection conexao;


public ContatoDAO() {
this.conexao = new conexaoBD().getConnection();
}

public void adicionaContato(Contato contato) {
String sql = "INSERT INTO usuario " +
             "(id, Nome, Telefone, Email, CPF, Login, " +
             "Senha) VALUES (?, ?, ?, ?, ?, ?, ?)";
    try {
    PreparedStatement ps = conexao.prepareStatement(sql);
     ps.setInt(1, contato.getId());
    ps.setString(2, contato.getNome());
    ps.setString(3, contato.getTelefone());
    ps.setString(4, contato.getEmail());
    ps.setString(5, contato.getCPF());
    ps.setString(6, contato.getLogin());
    ps.setString(7, contato.getSenha());
    ps.execute();
    ps.close();
 }

    catch(SQLException e) {
        throw new RuntimeException(e);
    }
}

    public UsuarioLogado login(String login, String senha) {
    String sql = "SELECT id, nome FROM usuario WHERE login = ? AND senha = ?";
    try {
        PreparedStatement ps = conexao.prepareStatement(sql);
        ps.setString(1, login);
        ps.setString(2, senha);
        ResultSet rs = ps.executeQuery();
        if (rs.next()) {
            int id = rs.getInt("id");
            String nome = rs.getString("nome");
            return new UsuarioLogado(id, nome);
        } else {
            return null;
        }
    } catch (SQLException e) {
        throw new RuntimeException(e);
    }
}

    
    public List<Contato> listaContatos() {
    List<Contato> listaContatos = new ArrayList();
    String sql = "SELECT * FROM usuario";
    try{
    PreparedStatement ps = conexao.prepareStatement(sql);
    ResultSet rs = ps.executeQuery();
    while(rs.next()){
    Contato contato = new Contato();
    contato.setId(rs.getInt("id"));
    contato.setNome(rs.getString("Nome"));
    contato.setTelefone(rs.getString("Telefone"));
    contato.setEmail(rs.getString("Email"));
    contato.setCPF(rs.getString("CPF"));
    contato.setLogin(rs.getString("Login"));
    contato.setSenha(rs.getString("Senha"));
    listaContatos.add(contato);
      }
    return listaContatos;
    }
    catch(SQLException e){
        throw new RuntimeException(e);
    }}

     public Contato getContatoById(int id) {
        Contato contato = new Contato();
        String sql = "SELECT * FROM usuario WHERE id = ?";
        try {
            PreparedStatement ps = conexao.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                contato.setId(rs.getInt("id"));
                contato.setNome(rs.getString("Nome"));
                contato.setTelefone(rs.getString("Telefone"));
                contato.setEmail(rs.getString("Email"));
                contato.setCPF(rs.getString("CPF"));
                contato.setLogin(rs.getString("Login"));
                contato.setSenha(rs.getString("Senha"));
            }
            rs.close();
            ps.close();
            return contato;
        }
        catch (SQLException e) {
            throw new RuntimeException("Erro ao tentar pegar usuário: " + id, e);
        }
    }
     
    public void deletarUsuarioPorId(int id) {
        String sqlFilhos  = "DELETE FROM formularios_usuario WHERE id_usuario = ?";
        String sqlPai     = "DELETE FROM usuario            WHERE id = ?";
        try {
            try (PreparedStatement ps1 = conexao.prepareStatement(sqlFilhos)) {
                ps1.setInt(1, id);
                ps1.executeUpdate();
            }
            try (PreparedStatement ps2 = conexao.prepareStatement(sqlPai)) {
                ps2.setInt(1, id);
                int affected = ps2.executeUpdate();
                if (affected == 0) {
                    throw new RuntimeException("Nenhum usuário encontrado com id: " + id);
                }
            }
            if (!conexao.getAutoCommit()) {
                conexao.commit();
            }
        } catch (SQLException e) {
            e.printStackTrace();
            throw new RuntimeException("Erro ao tentar deletar usuário: " + id 
                                       + " — " + e.getMessage(), e);
        }
    }
    
    
     
     public void atualizarContato(Contato contato){
         String sql = "UPDATE usuario SET Nome = ?, Telefone = ?, Email = ?, CPF = ?, Login = ?, Senha = ? WHERE id =?";
            try {
             PreparedStatement ps = conexao.prepareStatement(sql);
              ps.setString(1, contato.getNome());
              ps.setString(2, contato.getTelefone());
              ps.setString(3, contato.getEmail());
              ps.setString(4, contato.getCPF());
              ps.setString(5, contato.getLogin());
              ps.setString(6, contato.getSenha());
              ps.setInt(7, contato.getId());
              ps.executeUpdate();
              ps.close();
          }

             catch(SQLException e) {
                 throw new RuntimeException(e);
             }
     }
     
     public boolean existeUsuario(String login, String email, String cpf) {
    String sql = "SELECT * FROM usuario WHERE Login = ? OR Email = ? OR CPF = ?";
    try {
        PreparedStatement ps = conexao.prepareStatement(sql);
        ps.setString(1, login);
        ps.setString(2, email);
        ps.setString(3, cpf);
        ResultSet rs = ps.executeQuery();

        // Se encontrou algum registro, então já existe
        return rs.next();
    } catch (SQLException e) {
        throw new RuntimeException(e);
    }
}
     

}      

