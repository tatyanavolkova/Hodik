/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hodikgit;

/**
 *
 * @author jbenua
 */
public abstract class Field_object {
    String type; //"good_robot", "bad_robot", "obstacle" etc.
    Coordinate c;
    Field_object(Coordinate coord, String t)
    {
        c=coord;
        type=t;
    };
    
    public void show_info()
    {
        System.out.println("Type: " + type);
        System.out.println("Coords: " + c);
    }
}
