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
public class Field_object {
    String type; //"good_robot", "bad_robot", "obstacle" etc.
    Coordinate c;
    Field_object(String t, Coordinate coord, String args[])
    {
        switch (t){
            case "good_robot":
            {
                good_robot a=new good_robot(args);//args: name, xp, act_type
            }
            case "bad_robot":
            {
                bad_robot a=new bad_robot(args);//args: xp, act_type
            }
            case "obstacle":
            {
                //obstacle a=new obstacle(args);
            }
            c=coord;
        }
    }
}
