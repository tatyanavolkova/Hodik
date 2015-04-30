/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package robots;

import hodikgit.Coordinate;
import hodikgit.Direction;
import hodikgit.Field;
import hodikgit.Field_object;
import hodikgit.Integrator;
import hodikgit.Interpretator;

/**
 *
 * @author jbenua
 */
public class good_robot extends Field_object{
    public int xp;
    Unit robot;
    Direction dir;
    
    good_robot(Field a, Integrator i, Interpretator in, Coordinate coord, int x, Direction d, Unit r)
    {
        super(a, i, in, coord);
        xp=x;
        dir=d;
        r.robots.add(this);
        robot=r;
    }

    @Override
    public void show_info()
    {
        super.show_info();
        System.out.println("Name: "+ robot.name);
        System.out.println("XP: " + xp);
    }
}