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
    int act_type;
    bad_robot(Interpretator i,Coordinate coord, String t, int x, int a, int d)
    {
        super(i, coord, t);
        xp=x;
        act_type=a;
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
