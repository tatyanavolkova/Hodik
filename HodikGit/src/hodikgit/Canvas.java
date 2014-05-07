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
    int fieldSizeX;
    int fieldSizeY;
    int fieldCellSize;
    int fieldLeftTopX;
    int fieldLeftTopY;
    
    Canvas(int fieldSizeX, int fieldSizeY, int fieldCellSize, int fieldLeftTopX, int fieldLeftTopY) {
        this.fieldSizeX = fieldSizeX;
        this.fieldSizeY = fieldSizeY;
        this.fieldCellSize = fieldCellSize;
        this.fieldLeftTopX = fieldLeftTopX;
        this.fieldLeftTopY = fieldLeftTopY;
    }
    public void paint(Graphics g) {
    super.paint(g);
    g.setColor(Color.black);
    for(int i=0;i<=fieldSizeY;i++)
        g.drawLine(fieldLeftTopX, fieldLeftTopY+fieldCellSize*i, 
                fieldLeftTopX+fieldCellSize*fieldSizeX, fieldLeftTopY + fieldCellSize*i);
    for(int i=0;i<=fieldSizeX;i++)
        g.drawLine(fieldLeftTopX+fieldCellSize*i, fieldLeftTopY, 
                fieldLeftTopX+fieldCellSize*i, fieldLeftTopY+fieldCellSize*fieldSizeY);
  }
}
