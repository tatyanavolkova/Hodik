/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hodikgit;
import interpretator.Interpretator;
import robots.Unit;
import robots.good_robot;

/**
 *
 * @author Lenus1k
 */
public class Obstacles extends Field_object {
    
    int damage;
    public Obstacles(Field a, Integrator i, Interpretator in, Coordinate coord, int dmg)
    {
        super (a,i,in,coord);
        this.damage=dmg;
    };
    
    public void damageRobot(good_robot gr)
    {
        gr.HP-=damage;
    }
    
    @Override
    public void show_info()
    {
        super.show_info();
    }

    @Override
    public String getType() {
        return "obstacle";
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

//extensions for Obstacle class

class Stone extends Obstacles{
    public Stone (Field a, Integrator i, Interpretator in, Coordinate coord){
        super (a,i,in,coord,10);
    }
}

class Pit extends Obstacles{
    public Pit (Field a, Integrator i, Interpretator in, Coordinate coord){
        super (a,i,in,coord,25);
    }
}


class Liquid extends Obstacles{
    public Liquid (Field a, Integrator i, Interpretator in, Coordinate coord){
        //actually this thing should kill a robot instantly,
        //but it should appear less
        super (a,i,in,coord,100);   
    }
}