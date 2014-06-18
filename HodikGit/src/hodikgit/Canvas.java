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
    BufferedImage imgObstacle, imgRobot, imgRobotLeft, imgRobotRight;
    ArrayList<Coordinate> obstacles;
    String robotName;
    
    Canvas(int fieldSizeX, int fieldSizeY, int fieldCellSize, 
          int fieldLeftTopX, int fieldLeftTopY, Integrator in, String robotName) {
        this.fieldSizeX = fieldSizeX;
        this.fieldSizeY = fieldSizeY;
        this.fieldCellSize = fieldCellSize;
        this.fieldLeftTopX = fieldLeftTopX;
        this.fieldLeftTopY = fieldLeftTopY;
        this.robotName = robotName;
        integr=in;
        try {
            imgObstacle=ImageIO.read(new File("icons/obstacle.jpg"));
        } catch (IOException e) {
        }
        try {
            imgRobot=ImageIO.read(new File("icons/hodik.jpg"));
        } catch (IOException e) {
        }
        try {
            imgRobotLeft=ImageIO.read(new File("icons/hodik_leftdir.jpg"));
        } catch (IOException e) {
        }
        try {
            imgRobotRight=ImageIO.read(new File("icons/hodik_rightdir.jpg"));
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
        try {
           Robot robot = integr.rMap.get(robotName);
           drawRobot(g,robot.curr.c.x,robot.curr.c.y,robot.curr.c.p);
        } catch (Exception ex){
            //System.out.println(ex.getMessage());
        }
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
    void drawRobot(Graphics g, int cellX, int cellY, int dir)
    {
        switch (dir)
        { 
            case 0:
                g.drawImage(imgRobotRight,this.fieldLeftTopX+this.fieldCellSize*(cellX-1),
                    fieldLeftTopY+fieldCellSize*(cellY-1),
                    fieldCellSize,fieldCellSize,null);
                break;
            case 2:
                g.drawImage(imgRobotLeft,this.fieldLeftTopX+this.fieldCellSize*(cellX-1),
                    fieldLeftTopY+fieldCellSize*(cellY-1),
                    fieldCellSize,fieldCellSize,null);
                break;
            default:
                g.drawImage(imgRobot,this.fieldLeftTopX+this.fieldCellSize*(cellX-1),
                    fieldLeftTopY+fieldCellSize*(cellY-1),
                    fieldCellSize,fieldCellSize,null);
                break;
        }
    }
}
