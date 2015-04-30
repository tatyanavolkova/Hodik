package XMLParser;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import hodikgit.Coordinate;
import hodikgit.Field;
import java.util.ArrayList;
import java.util.List;
//
/**
 *
 * @author yunna_u
 */
public class Info 
{
    String robotName;
    int levelNumber;
    int x;
    int y;  
    int HP;
    List<mobInfo> mob = new ArrayList();
    
    public Info(String name, int ln, Coordinate c, int h)
    {
        robotName=name;
        levelNumber=ln;
        x=c.getX();
        y=c.getY();
        HP=h;
    }
    public void loadMobs(Field a)
    {
        
    }
}
