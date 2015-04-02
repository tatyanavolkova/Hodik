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
public class bad_robot extends Field_object{
    int xp;
    int damage;
    bad_robot(Field f, Integrator i, Interpretator in, Coordinate coord, int x, int d)
    {
        super(f, i, in, coord);
        xp=x;
        damage=d;
    }
    
    @Override
    public void show_info()
    {
        super.show_info();
        System.out.println("XP: " + xp);
        System.out.println("damage: " + damage);
    }
}
