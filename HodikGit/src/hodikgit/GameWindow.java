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
    private Canvas c = new Canvas(7,10,50,50,50);
    GameWindow(int windowWidth, int windowHeight){ 
        super("Hodik"); 
        setDefaultCloseOperation(EXIT_ON_CLOSE); 
        setSize(windowWidth, windowHeight); 
        this.getContentPane().add(c);
    }
}
