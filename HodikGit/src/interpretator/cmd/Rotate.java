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
//            case "up":
//                dir=Direction.UP;
//                break;
            case "left":
                if(currRobot.dir==Direction.DOWN){
                    currRobot.dir=Direction.RIGHT;
                }
                if(currRobot.dir==Direction.LEFT){
                    currRobot.dir=Direction.DOWN;
                }
                if(currRobot.dir==Direction.UP){
                    currRobot.dir=Direction.LEFT;
                }
                if(currRobot.dir==Direction.RIGHT){
                    currRobot.dir=Direction.UP;
                }
                break;
            case "right":
                if(currRobot.dir==Direction.DOWN){
                    currRobot.dir=Direction.LEFT;
                }
                if(currRobot.dir==Direction.LEFT){
                    currRobot.dir=Direction.UP;
                }
                if(currRobot.dir==Direction.UP){
                    currRobot.dir=Direction.RIGHT;
                }
                if(currRobot.dir==Direction.RIGHT){
                    currRobot.dir=Direction.DOWN;
                }
                break;
//            case "down":
//                dir=Direction.DOWN; 
//                break;
        }
        return "newOrientation "+currRobot.dir.name();
    }
}
   