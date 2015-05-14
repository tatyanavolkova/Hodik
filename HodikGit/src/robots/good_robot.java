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
import interpretator.Interpretator;

/**
 *
 * @author jbenua
 */
public class good_robot extends Field_object{
    public int HP;
    Unit robot;
    public Direction dir;
    
    good_robot(Field a, Integrator i, Interpretator in, Coordinate coord, int h, Direction d, Unit r)
    {
        super(a, i, in, coord);
        HP=h;
        dir=d;
        robot=r;
    }
    
    public void setCoords(Coordinate newC){
        c=newC;
    }
    
    @Override
    public void show_info()
    {
        super.show_info();
        System.out.println("Name: "+ robot.name);
        System.out.println("HP: " + HP);
    }

    @Override
    public String getType() {
        return "robot";
    }

    @Override
    public String getActtype() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getDamage() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
