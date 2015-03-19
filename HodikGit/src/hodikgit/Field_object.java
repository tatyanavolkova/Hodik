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
    Field_object me;
    Field_object(String[] args){};
    Field_object(String t, Coordinate coord, String[] args)
    {
        c=coord;
        switch (t){
            case "good_robot":
            {
                me = new good_robot(args);//string args: name, xp(number), act_type(number)
            }
            case "bad_robot":
            {
                 me = new bad_robot(args);//string args: xp(number), act_type(number)
            }
            case "obstacle":
            {
                //obstacle a=new obstacle(args);
            }
        }
    }
    
    public void show_info()
    {
        System.out.println("Type: " + type);
        System.out.println("Coords: " + c);
        System.out.println(me);
    }
}
