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
    private Canvas c = new Canvas();
    GameWindow(){ 
        super("Hodik"); 
        setDefaultCloseOperation(EXIT_ON_CLOSE); 
        setSize(800, 600); 
        this.getContentPane().add(c);
    }
}