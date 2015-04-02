/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hodikgit;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author jbenua
 */
public class good_robot extends Field_object{
    String name;
    int xp;
    int act_type;
    Map<String, Algorithm> progs;
    
    good_robot(Integrator i,Coordinate coord, String t, String n, int x, int a)
    {
        super(i, coord, t);
        name=n;
        xp=x;
        act_type=a;
        progs=new HashMap<>();
    }

    @Override
    public void show_info()
    {
        super.show_info();
        System.out.println("Name: "+ name);
        System.out.println("XP: " + xp);
    }
    
    void add_prog(String p)
    {
        Algorithm a = new Algorithm(p);
        progs.put(a.name, a);
    }
    void add_prog(String n, String p)
    {
        Algorithm a = new Algorithm(n, p);
        progs.put(n, a);
        System.out.println("Algorithm added: "+ a.name + a.path);
    }
    
    void launch_prog(String n)
    {
        System.out.println("Launching program '"+ n+"'...");
        // some_function(progs.get(n);
    }
    void del_prog(String n)
    {
        progs.remove(n);
        System.out.println("Program '"+n+"' deleted");
    }
}