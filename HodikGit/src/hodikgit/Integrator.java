/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package hodikgit;
import java.util.*;
import javax.swing.*;
/**
 *
 * @author Оля
 */
public class Integrator {
     Map<String, Robot> rMap;
    //JFrame myfr; 
    //JFrame logfr;
    //java.util.Timer timer;
    Field field;
    JFrame frm;
    
    Integrator(){

        
       field = new Field(10,10);
       rMap = new HashMap<String, Robot>();
       rMap.put("nasa",new Robot("nasa", 33));
       rMap.put("saturn",new Robot("saturn", 66));
              
       // for(int i=0;i<this.RobCollection.size();i++)
       //     System.out.print(this.RobCollection.get(i).RName);
       //myfr = new MainFr(); 
       LoginFrm logfr = new LoginFrm(this);
       logfr.setVisible(true); 
       logfr.setLocationRelativeTo(null);
    }
    
    //передвинуть робота
    //{
    //проверить позицию
    //обратиться к полю и изменить координаты
    //прерисовать поле
    //}
    
    //проверить позицию робота
    
    //перерисовать поле
   
}
