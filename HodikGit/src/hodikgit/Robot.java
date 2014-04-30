/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package hodikgit;

/**
 *
 * @author Lenovo
 */
public class Robot {
    String RName;
    int FreqVal;
    
    public Robot(String RName, int FreqVal){
    this.RName = RName;
    this.FreqVal = FreqVal;
    }
    
    public void show_robot (){
        System.out.println("Robot's name: "+this.RName);
        System.out.println("Frequency: "+this.FreqVal);

    }
    
    
    
}
