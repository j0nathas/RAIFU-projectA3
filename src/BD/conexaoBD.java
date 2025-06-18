/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author 825126061
 */
public class conexaoBD { 
   private static String USERNAME = "root";
   private static String PASSWORD = "Projeto@A3USJT";
   private static String DRIVER = "com.mysql.cj.jdbc.Driver";
   private static String URL = "jdbc:mysql://localhost:3306/projetoa3?useSSL=false&serverTimezone=UTC";
   

public Connection getConnection(){
 try {
        Class.forName(DRIVER);
        return DriverManager.getConnection(URL,USERNAME,PASSWORD);
    }
    catch(SQLException e){
        throw new RuntimeException (e);
    }
    catch(ClassNotFoundException ex){
        throw new RuntimeException (ex);
    }

}
}


