/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package hodikgit;
import java.io.File;
import java.util.ArrayList;
/**
 *
 * @author Lenovo
 */
public class Robot {
    String rb_name;
    int FreqVal;
    Interpretator_old curr;
    ArrayList<File> languages;
    
    
    
    public Robot(String name, int val){
        this.rb_name = name;
        this.FreqVal = val;
        languages=new <File>ArrayList();
        curr = new Interpretator_old();
    }
    /*
    void rb_show_info (){
        System.out.println("Robot's name: "+this.rb_name);
        System.out.println("Frequency: "+this.FreqVal);

    }
    Interpretator rb_create_interp()
    {
        Interpretator a = new Interpretator();
        return a;
    }
    void rb_launch_prog(ArrayList<File> languages, int i)
    {
        System.out.println("Здесь выбирается программа из списка программ");
        //return languages.get(i);
    }
    void rb_add_prog(ArrayList<File> languages, int n)
        //можно переделать под ввод с клавиатуры или считывать из файла
    {
        System.out.println("Здесь создаётся новая программа и добавляется в список программ");
      //  languages.add(new_prog);
    }
    void rb_del_prog(ArrayList<File> languages, int i)
    {
        System.out.println("Здесь удаляется программа из списка программ");
        //languages.remove(i);
    }*/
    
    
    
    
    
}
