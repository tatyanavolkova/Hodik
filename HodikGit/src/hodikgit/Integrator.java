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
    ArrayList<Robot> RobCollection;
    Map<String, Robot> rMap;
    JFrame myfr; 
    JFrame logfr;
   
    Integrator(){

       RobCollection = new <Robot>ArrayList();
       RobCollection.add(new Robot("nasa", 33));
       RobCollection.add(new Robot("saturn", 66));
       
       rMap = new HashMap<String, Robot>();
       rMap.put("nasa",RobCollection.get(0));
       rMap.put("saturn",RobCollection.get(1));
       
       
       
        
       // for(int i=0;i<this.RobCollection.size();i++)
       //     System.out.print(this.RobCollection.get(i).RName);
       //myfr = new MainFr(); 
       LoginFrm logfr = new LoginFrm(this);
       logfr.setVisible(true); 
       logfr.setLocationRelativeTo(null);
       
        
        
    }
    
   
}
