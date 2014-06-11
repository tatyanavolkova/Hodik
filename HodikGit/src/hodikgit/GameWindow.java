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

public class GameWindow extends JFrame { 
    Integrator integr;
   private Canvas c = new Canvas(7,10,50,50,50, integr);
    GameWindow(int windowWidth, int windowHeight, Integrator i){ 
        super("Hodik"); 
        integr=i;
        setDefaultCloseOperation(EXIT_ON_CLOSE); 
        setSize(windowWidth, windowHeight); 
        this.getContentPane().add(c);
    }

    /**
     * @return the c
     */
    public Canvas getC() {
        return c;
    }
}
