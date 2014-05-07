/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hodikgit;
import java.awt.*;
import javax.swing.*;
/**
 *
 * @author user
 */
public class Canvas extends JPanel {
    
    public void paint(Graphics g) {
    super.paint(g);
    g.setColor(Color.black);
    int Width = getSize().width;
    int Height = getSize().height;
    int initX = 50;
    int initY = 50;
    int size = 50;
    for(int i=0;i<10;i++)
        g.drawLine(initX, initY+size*i, size*10, initY + size*i);
    for(int i=0;i<10;i++)
        g.drawLine(initX+size*i, initY, initX+size*i, size*10);
  }
}
