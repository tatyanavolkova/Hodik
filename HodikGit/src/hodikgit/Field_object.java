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
    /*
    aргументы:
    good_robot(координата, "good_robot", "имя", 100, 1), где 100 - xp, 1 - тип поведения
    bad_robot(координата, "bad_robot", 10, 1, 5), где 10 - xp, 1 - тип поведения, 5 - урон
    */
    
    
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
