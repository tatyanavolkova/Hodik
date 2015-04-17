/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interpretator.cmd;

import hodikgit.Direction;

/**
 *
 * @author micen
 */
public class Rotate implements CMD 
{
    Direction dir= null;
    String direction;
    public Rotate(String d, Direction DIR)
    {
        dir=DIR;
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
                dir=Direction.UP;
                break;
            case "left":
                dir=Direction.LEFT;
                break;
            case "right":
                dir=Direction.RIGHT;
                break;
            case "down":
                dir=Direction.DOWN; 
                break;
        }
        return "newOrientation "+dir.name();
    }
}
   


