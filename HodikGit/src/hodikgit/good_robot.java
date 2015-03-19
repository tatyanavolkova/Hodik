/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hodikgit;

import static java.lang.Integer.parseInt;

/**
 *
 * @author jbenua
 */
public class good_robot extends Field_object{
    String name;
    int xp;
    int act_type;
    good_robot(Coordinate coord, String t, String[] args)
    {
        super(coord, t);
        name=args[0];
        xp=parseInt(args[1]);
        act_type=parseInt(args[2]);
    }

    @Override
    public void show_info()
    {
        super.show_info();
        System.out.println("Name: "+ name);
        System.out.println("XP: " + xp);
    }
    
    
    public void rotate(){
        
    }
    

}
