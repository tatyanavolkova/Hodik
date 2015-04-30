/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interpretator.cmd;

import hodikgit.Direction;
import robots.good_robot;

/**
 *
 * @author micen
 */
public class Rotate implements CMD 
{
    String direction;
    good_robot currRobot;
    
    public Rotate(String d, good_robot robot)
    {
        currRobot=robot;
        direction=d;
    }
    @Override
    public String toString()
    {
        return "";
    }
    @Override
    public String Run() {
        return Rotate();
    }
    
    public String Rotate()
    {
        switch(direction){
            case "up":
                currRobot.dir=Direction.UP;
                break;
            case "left":
                currRobot.dir=Direction.LEFT;
                break;
            case "right":
                currRobot.dir=Direction.RIGHT;
                break;
            case "down":
                currRobot.dir=Direction.DOWN; 
                break;
        }
        return "newOrientation "+currRobot.dir.name();
    }
}
   


