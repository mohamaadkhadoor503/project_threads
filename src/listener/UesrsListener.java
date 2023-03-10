/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package listener;

import DB.dao.UsersDao;
import static DB.dao.UsersDao.getInstance;
import DB.vo.UsersVo;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import thread.UsersThreads;

/**
 *
 * @author LENOVO
 */
public class UesrsListener implements Runnable{

    @Override
    public void run() {
        try {
           List<UsersVo> usersvo=UsersDao.getInstance().getDataByFlag();
       for(UsersVo u:usersvo){
           UsersThreads userthread=new UsersThreads(u);
          userthread.writeData();
           UsersDao.getInstance().update(u);
                Thread.sleep(1000);
                        }
        } catch (Exception ex) {
            Logger.getLogger(UesrsListener.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
