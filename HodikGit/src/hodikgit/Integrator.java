/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package hodikgit;
import java.util.*;
import javax.swing.*;
import java.util.Vector;
import robots.Unit;
import robots.bad_robot;
/**
 *
 * @author Оля
 */
public class Integrator {
     Map<String, Robot> rMap;
    //JFrame myfr; 
    //JFrame logfr;
    //java.util.Timer timer;
    Vector<Field> fields; //коллекция полей
    Vector<Unit> units; //коллекция роботов
    JFrame frm;
    Field field;
    
    Integrator(){

       fields = new Vector<Field>();
       units = new Vector<Unit>();
       
       if (true) //выбрать имеющегося робота
       {
           //загрузить поле, поместить в вектор fields
           //загрузить робота, поместить в вектор units
       } else 
       { 
           //создать робота, поместить в вектор units
           //выбрать планету и подгрузить поле, поместить в вектор fields
       }
       
       
         
         /*Field field = new Field(10,10);
         rMap = new HashMap<String, Robot>();
         rMap.put("nasa",new Robot("nasa", 33));
         rMap.put("saturn",new Robot("saturn", 66));
         // for(int i=0;i<this.RobCollection.size();i++)
         //     System.out.print(this.RobCollection.get(i).RName);
         //myfr = new MainFr();
         LoginFrm logfr = new LoginFrm(this);
         logfr.setVisible(true);
         logfr.setLocationRelativeTo(null);*/
         
        
       /*Field field = new Field(10,10);
       rMap = new HashMap<String, Robot>();
       rMap.put("nasa",new Robot("nasa", 33));
       rMap.put("saturn",new Robot("saturn", 66));
              
       // for(int i=0;i<this.RobCollection.size();i++)
       //     System.out.print(this.RobCollection.get(i).RName);
       //myfr = new MainFr(); 
       LoginFrm logfr = new LoginFrm(this);
       logfr.setVisible(true); 
       logfr.setLocationRelativeTo(null);*/
    }
   
}
