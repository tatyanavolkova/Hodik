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
public class healthBonus extends Field_object {
    int value;
    healthBonus (Coordinate coord, String t, int value)
    {
        super(coord, t);
        this.value = value;
    }
    
    public void addHealth (good_robot gr)
    {
        gr.xp+=value;
    }
    
    @Override
    public void show_info()
    {
        super.show_info();
        System.out.println("Health bonus: +" + this.value +" hp");
    }
}
