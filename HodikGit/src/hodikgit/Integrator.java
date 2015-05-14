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
import XMLParser.*;
import interpretator.*;


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
    loadLevel load;
    String levelname;
    Interpretator interp;
    
    
    
    Integrator() throws Exception{

       fields = new Vector<Field>();
       units = new Vector<Unit>();
       load = new loadLevel();
       
       if (true) //выбрать имеющегося робота
       {
           Scanner sc = new Scanner(System.in);
           levelname = sc.nextLine();
           int height=10;
           int width=10;
           Info i = new Info();
           i=load.getInfo();
           int level=i.levelNumber;
           int x=i.getX();
           int y=i.getY();
           int hp=i.getHP();
           Coordinate c=new Coordinate(x, y);
           Direction d=Direction.UP;
                
                load.getDocument(levelname);
              
           Field F=new Field(level, width, height);     
           units.elementAt(0).add_robot(F, this, interp, c, d, hp);
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
