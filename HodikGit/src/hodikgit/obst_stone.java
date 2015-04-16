/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hodikgit;

/**
 *
 * @author Lenus1k
 */
public class obst_stone extends Field_object {
    
    int damage;
    public obst_stone(Field a, Integrator i, Interpretator in, Coordinate coord, int dmg)
    {
        super (a,i,in,coord);
        this.damage=dmg;
    };
    
    public void damageRobot(good_robot gr)
    {
        gr.xp-=damage;
    }
    
    @Override
    public void show_info()
    {
        super.show_info();
    }
}
