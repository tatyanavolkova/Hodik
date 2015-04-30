/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hodikgit;
import javax.swing.*;
/**
 *
 * @author user
 */

public class GameWindow extends javax.swing.JFrame { 
    Integrator integr;
    String robotName;
    Canvas c;
    GameWindow(int windowWidth, int windowHeight, Integrator i, String robotName){ 
        super("Hodik"); 
        integr=i;
        this.robotName = robotName;
        setDefaultCloseOperation(EXIT_ON_CLOSE); 
        setSize(windowWidth, windowHeight); 
        //c = new Canvas(integr.field.w,integr.field.h,50,50,50, integr, robotName);
        this.getContentPane().add(c);
    }

    /**
     * @return the c
     */
    public Canvas getC() {
        return c;
    }
}
