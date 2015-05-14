package XMLParser;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

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
    public int levelNumber;
    public int x;
    public int y;  
    public int HP;
    List<mobInfo> mob = new ArrayList();
    
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
    
}
