/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import BD.conexaoBD;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author jonat
 */
public class ConexaoFuncionario {
    private final Connection conexao;
    
    public ConexaoFuncionario() {
this.conexao = new conexaoBD().getConnection();
}
    
    
    public boolean login(String login, String senha) {
        String sql = "SELECT * FROM funcionario WHERE Login = ? " +
                "AND Senha = ?";
        try{
        PreparedStatement ps = conexao.prepareStatement(sql);
        ps.setString(1, login);
        ps.setString(2, senha);
        ResultSet rs = ps.executeQuery();
        if(rs.next()){
        return true;
        }
        else {
        return false;
        }
        }
        catch(SQLException e) {
            throw new RuntimeException(e);
        }
    }
    
}
