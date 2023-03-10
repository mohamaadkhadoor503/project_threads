/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package thread;

import DB.vo.UsersVo;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author LENOVO
 */
public class UsersThreads {
public UsersVo uservo;
  
    public UsersThreads(UsersVo uservo) {
        this.uservo = uservo;
    }
    public void writeData() throws IOException{
        File file=new File("files/file"+uservo.getId());
        FileWriter fw = null;
    try {
        fw = new FileWriter(file);
    } catch (IOException ex) {
        Logger.getLogger(UsersThreads.class.getName()).log(Level.SEVERE, null, ex);
    }
        fw.write(uservo.getUsername()+"\n");
        fw.write(uservo.getPassword()+"\n");
        fw.close();

    }
}
