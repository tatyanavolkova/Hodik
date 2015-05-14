/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package XMLParser;

/**
 *
 * @author yunna_u
 */
public class mobInfo 
{
    String name;            
    String type;            //type: bad robot or obstacle
    int x;
    int y;
    int hp;

    public mobInfo(String name, String type, int x, int y, int hp) 
    {      
        this.name = name;
        this.type = type;
        this.x=x;
        this.y=y;
        this.hp=hp;
    }


}
