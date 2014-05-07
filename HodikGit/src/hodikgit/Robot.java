/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package hodikgit;
import java.util.Vector;
/**
 *
 * @author Lenovo
 */
public class Robot {
    String rb_name;
    int FreqVal;
    ////////////////////
    Interpretator curr;
    Vector programs = new Vector();
    
    
    
    
    public Robot(String name, int val){
        this.rb_name = name;
        this.FreqVal = val;
    }
    
    void rb_show_info (){
        System.out.println("Robot's name: "+this.rb_name);
        System.out.println("Frequency: "+this.FreqVal);

    }
    Interpretator rb_create_interp()
    {
        Interpretator a = new Interpretator();
        return a;
    }
    void rb_launch_prog(Vector programs, int i)
    {
        System.out.println("Здесь выбирается программа из списка программ");
    }
    void rb_add_prog(Vector programs, int n)
    {
        System.out.println("Здесь создаётся новая программа и добавляется в список программ");
    }
    void rb_del_prog(Vector programs, int i)
    {
        System.out.println("Здесь удаляется программа из списка программ");
    }
    
    
    
}
