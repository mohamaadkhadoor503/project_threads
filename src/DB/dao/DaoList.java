 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package DB.dao;

import java.util.List;

/**
 *
 * @author LENOVO
 */
public interface DaoList<T> {
   public List<T> getDataByFlag()throws Exception;
   public int update(T t)throws Exception;
}
