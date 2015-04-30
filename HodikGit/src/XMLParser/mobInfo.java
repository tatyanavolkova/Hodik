/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package XMLParser;

import hodikgit.Coordinate;

/**
 *
 * @author yunna_u
 */
public class mobInfo 
{
    String name;            //act-type
    String type;            //type: bad robot "1" or obstacle "2"
    int x;
    int y;
    int hp;
    public mobInfo() 
    {      
        this.name = new String();
        this.type = new String();
    }
    public void setCoords(Coordinate c) 
    {      
        x=c.getX();
        y=c.getY();
    }
}
