/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hodikgit;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.*;
import java.io.*;
import java.util.Map;
import javax.imageio.*;
import javax.swing.*;
import java.util.ArrayList;

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
    Integrator integr;
    BufferedImage imgObstacle, imgRobot;
    ArrayList<Coordinate> obstacles;
    
    Canvas(int fieldSizeX, int fieldSizeY, int fieldCellSize, 
            int fieldLeftTopX, int fieldLeftTopY, Integrator in) {
        this.fieldSizeX = fieldSizeX;
        this.fieldSizeY = fieldSizeY;
        this.fieldCellSize = fieldCellSize;
        this.fieldLeftTopX = fieldLeftTopX;
        this.fieldLeftTopY = fieldLeftTopY;
        integr=in;
        try {
            imgObstacle=ImageIO.read(new File("icons/obstacle.jpg"));
        } catch (IOException e) {
        }
        try {
            imgRobot=ImageIO.read(new File("icons/hodik.jpg"));
        } catch (IOException e) {
        }
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

       /* for(Map.Entry<String, Robot> e: integr.rMap.entrySet()){  
            //drawRobot(g,e.getValue().curr.coords.x,e.getValue().curr.coords.y);
        drawRobot(g,3,3);
        //}
       /* for(int i=0;i<obstacles.size();i++){  
            drawObstacle(g, obstacles.get(i).x, obstacles.get(i).x);
        }*/
    }
    void drawObstacle(Graphics g, int cellX, int cellY)
    {
        g.drawImage(imgObstacle,this.fieldLeftTopX+this.fieldCellSize*(cellX-1),
                fieldLeftTopY+fieldCellSize*(cellY-1),
                fieldCellSize,fieldCellSize,null);
    }
    void drawRobot(Graphics g, int cellX, int cellY)
    {
        g.drawImage(imgRobot,this.fieldLeftTopX+this.fieldCellSize*(cellX-1),
                fieldLeftTopY+fieldCellSize*(cellY-1),
                fieldCellSize,fieldCellSize,null);
    }
}
