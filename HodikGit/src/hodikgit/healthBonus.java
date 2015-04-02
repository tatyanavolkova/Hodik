/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hodikgit;

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
        gr.xp+=hp;
    }
    
    @Override
    public void show_info()
    {
        super.show_info();
        System.out.println("Health bonus: +" + this.hp +" hp");
    }
}
