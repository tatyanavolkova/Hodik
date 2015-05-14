package XMLParser;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import hodikgit.Coordinate;
import hodikgit.Field;
import hodikgit.Field_object;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
//
/**
 *
 * @author yunna_u
 */
public class Info 
{
    String robotName;
    public int levelNumber;
    public int x;
    public int y;  
    public int HP;
    List<mobInfo> mob = new ArrayList();
    public Info(){};
    public Info(String name, int ln, Coordinate c, int h)
    {
        robotName=name;
        levelNumber=ln;
        x=c.getX();
        y=c.getY();
        HP=h;
    }
    
    public int getLevel()
    {
        return levelNumber;
    }
    
    public int getX()
    {
        return x;
    }
    
    public int getY()
    {
        return y;
    }
    
    public int getHP()
    {
        return HP;
    }
    
    public void loadMobs(Field a)
    {
        HashMap<Coordinate, Field_object> objects=a.getHex();
        for (Coordinate key : objects.keySet()) {
            Field_object item=objects.get(key);
            mobInfo info=new mobInfo();
            info.type=item.getType();
            if (!"obstacle".equals(info.type))
            {
                info.name=item.getActtype();
                info.hp=item.getDamage();
            }
            info.setCoords(item.getCoord());
            mob.add(info);
        }
    }
}
