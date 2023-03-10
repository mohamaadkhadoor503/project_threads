/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DB.dao;

import DB.vo.UsersVo;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author LENOVO
 */
public class UsersDao extends Dao implements DaoList<UsersVo>{

    private static UsersDao usersDao;
    private UsersDao(){
        
    }
    public static UsersDao getInstance(){
        if(usersDao==null){
            usersDao=new UsersDao();
        }
        return usersDao;
    }
      
    @Override
    public List<UsersVo> getDataByFlag() throws Exception {
        Connection con=null;
        ResultSet rs=null;
          PreparedStatement pst=null;
        UsersVo usersVo;
        List<UsersVo>UsersVos=new ArrayList<>();
        try{
          con=getConnection();
          String sql="select  id,user_name,password,flag from users where flag=1";
pst=con.prepareStatement(sql);
  rs=pst.executeQuery(); 
  while(rs.next()){
      usersVo=new UsersVo();
      usersVo.setId(rs.getInt("id"));
            usersVo.setUsername(rs.getString("user_name"));
      usersVo.setPassword(rs.getString("password"));
      usersVo.setFlag(rs.getInt("flag"));
UsersVos.add(usersVo);
  }
        }catch(Exception e){
            
        }finally{
            rs.close();
            pst.close();
            colseConnection(con);
        }
        return UsersVos;
    }

    @Override
    public int update(UsersVo uservo) throws Exception {

  Connection con=null;
        
          PreparedStatement pst=null;
        int count=0;
        try{
          con=getConnection();
          String sql="update users set flag=0 where id=?";
pst=con.prepareStatement(sql);
  pst.setInt(1, uservo.getId());
  count=pst.executeUpdate();
  
  
        }catch(Exception e){
            
        }finally{
            pst.close();
            colseConnection(con);
        }
        return count  ;
    }
    }
    

