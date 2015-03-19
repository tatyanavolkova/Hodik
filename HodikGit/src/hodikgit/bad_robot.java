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
public class bad_robot extends Field_object{
    int xp;
    int damage;
    int act_type;
    bad_robot(Coordinate coord, String t, String[] args)
    {
        super(coord, t);
        xp=parseInt(args[0]);
        act_type=parseInt(args[1]);
        damage=parseInt(args[2]);
    }
    
    @Override
    public void show_info()
    {
        super.show_info();
        System.out.println("XP: " + xp);
        System.out.println("damage: " + damage);
    }
    
    public void move()
    {
        switch (act_type){
            case 1:
                //up-down
            case 2:
                //left-right
        }
        
    }
}
