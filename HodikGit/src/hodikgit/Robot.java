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
    Vector<String> programs = new Vector<String>();
    
    
    
    
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
    String rb_launch_prog(Vector<String> programs, int i)
    {
        System.out.println("Здесь выбирается программа из списка программ");
        return programs.get(i);
    }
    void rb_add_prog(Vector<String> programs, String new_prog)
    //можно переделать под ввод с клавиатуры или считывать из файла
    {
        System.out.println("Здесь создаётся новая программа и добавляется в список программ");
        programs.add(new_prog);
    }
    void rb_del_prog(Vector<String> programs, int i)
    {
        System.out.println("Здесь удаляется программа из списка программ");
        programs.remove(i);
    }
    
    
    
}
