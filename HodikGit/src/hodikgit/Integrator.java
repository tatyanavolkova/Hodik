/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package hodikgit;
import java.util.*;
import javax.swing.*;
import java.io.*;
/**
 *
 * @author Оля
 */
public class Integrator {
    ArrayList<Robot> RobCollection;
    JFrame myfr; 
    JFrame logfr;
    ArrayList<File> languages;
    Integrator(){

       RobCollection = new <Robot>ArrayList();
       RobCollection.add(new Robot("nasa", 33));
       RobCollection.add(new Robot("saturn", 66));
       languages=new <File>ArrayList();
       // for(int i=0;i<this.RobCollection.size();i++)
       //     System.out.print(this.RobCollection.get(i).RName);
       //myfr = new MainFr(); 
       LoginFrm logfr = new LoginFrm(this);
       logfr.setVisible(true); 
       logfr.setLocationRelativeTo(null);
       
        
        
    }
    
    
}
