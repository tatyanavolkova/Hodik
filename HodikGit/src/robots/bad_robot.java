/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package robots;

import hodikgit.Coordinate;
import hodikgit.Field;
import hodikgit.Field_object;
import hodikgit.Integrator;
import interpretator.Interpretator;

/**
 *
 * @author jbenua
 */
public class bad_robot extends Field_object{
    String act_type;
    int damage;
    bad_robot(Field f, Integrator i, Interpretator in, Coordinate coord, String type)
    {
        super(f, i, in, coord);
        act_type=type;
        this.setDamage();
    }
    private void setDamage()
    {
        //
        //switch(act_type)...
    }
    
    
    @Override
    public void show_info()
    {
        super.show_info();
        System.out.println("damage: " + damage);
    }
}
