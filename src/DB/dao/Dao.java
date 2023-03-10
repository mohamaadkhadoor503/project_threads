/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DB.dao;


import java.sql.*;
import javax.swing.JOptionPane;
/**
 *
 * @author LENOVO
 */
public class Dao {
   public static Connection getConnection() throws Exception{
        Class.forName("com.mysql.cj.jdbc.Driver");
               Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3307/threads_system","root","");
       JOptionPane.showMessageDialog(null, "sucess");
       if(con!=null){
      return con;
   }
   return null;
   } 
   public void colseConnection(Connection con)throws SQLException{
   if(con!=null){
      con.close();
   }    
   }
}
