/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package threadsystem;

import DB.dao.Dao;
import listener.UesrsListener;

/**
 *
 * @author LENOVO
 */
public class ThreadSystem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        // TODO code application logic here
UesrsListener ul=new UesrsListener();
Thread t1=new Thread(ul);
t1.start();
    }
    
}
