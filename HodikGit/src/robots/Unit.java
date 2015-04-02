/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package robots;

import hodikgit.Algorithm;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author jbenua
 */
public class Unit {
    String name;
    Map<String, Algorithm> progs;
    ArrayList <good_robot> robots;
    Unit(String n)
    {
        name=n;
        robots=new ArrayList();
        progs=new HashMap<>();
    }
    void add_prog(String p)
    {
        Algorithm a = new Algorithm(p);
        progs.put(a.getname(), a);
    }
    
    void add_prog(String n, String p)
    {
        Algorithm a = new Algorithm(n, p);
        progs.put(n, a);
        System.out.println("Algorithm added: "+ a.out());
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
