/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hodikgit;
import interpretator.Interpretator;
import robots.Unit;
import robots.good_robot;

//import robots.good_robot;

/**
 *
 * @author Lenus1k
 */
public class healthBonus extends Field_object {
    int hp;
    
    public healthBonus(Field a, Integrator i, Interpretator in, Coordinate coord, int hp)
    {
        super (a,i,in,coord);
        this.hp=hp;
    };
    
    public void healRobot (good_robot gr)
    {
        gr.HP+=hp;
    }
    
    @Override
    public void show_info()
    {
        super.show_info();
        System.out.println("Health bonus: +" + this.hp +" hp");
    }

    @Override
    public String getType() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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

class smallHealth extends healthBonus{
    public smallHealth (Field a, Integrator i, Interpretator in, Coordinate coord){
        super (a,i,in,coord,5);
    }
}

class mediumHealth extends healthBonus{
    public mediumHealth (Field a, Integrator i, Interpretator in, Coordinate coord){
        super (a,i,in,coord,15);
    }
}

class largeHealth extends healthBonus{
    public largeHealth (Field a, Integrator i, Interpretator in, Coordinate coord){
        super (a,i,in,coord,25);
    }
}
