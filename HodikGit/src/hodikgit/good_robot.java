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
public class good_robot extends Field_object{
    String name;
    int xp;
    int act_type;
    
    good_robot(Coordinate coord, String t, String n, int x, int a)
    {
        super(coord, t);
        name=n;
        xp=x;
        act_type=a;
    }

    @Override
    public void show_info()
    {
        super.show_info();
        System.out.println("Name: "+ name);
        System.out.println("XP: " + xp);
    }
    
    
    public void rotate(){
        
    }
    

}
