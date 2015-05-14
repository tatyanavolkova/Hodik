/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package robots;

import XMLParser.Info;
import hodikgit.Algorithm;
import hodikgit.Coordinate;
import hodikgit.Direction;
import hodikgit.Field;
import hodikgit.Integrator;
import interpretator.Interpretator;
import java.io.File;
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
    good_robot getAvatar(Field a)
    {
        for (good_robot i : robots)
        {
            if (i.getField()==a)
                return i;
        }
        return null;
    }
    
    void add_robot(Field a, Integrator i, Interpretator in, Coordinate coord, Direction d,  int hp){
        good_robot r=new good_robot(a, i, in, coord, hp, d, this);
        robots.add(r);
    }
    boolean check_if_prog_exists(String path)
    {
        File f = new File(path);
        return f.exists() && !f.isDirectory();
    }
    boolean add_prog(String p)
    {
        if (check_if_prog_exists(p))
        {
            Algorithm a = new Algorithm(p);
            progs.put(a.getname(), a);
            return true;
        }
        else 
            return false;
    }
    boolean add_prog(String n, String p)
    {
        if (check_if_prog_exists(p))
        {
            Algorithm a = new Algorithm(n, p);
            progs.put(n, a);
            System.out.println("Algorithm added: "+ a.out());
            return true;
        }
        else 
            return false;
    }    
    void launch_prog(String n, int rob)
    {
        System.out.println("Launching program '"+ n+"'...");
        Algorithm alg=progs.get(n);
        good_robot cur=robots.get(rob);
        Interpretator in=cur.getInterpr();
        in.translate(alg.getPath(), cur);
    }  
    void del_prog(String n)
    {
        progs.remove(n);
        System.out.println("Program '"+n+"' deleted");
    }
    public ArrayList<Info> save()
    {
        ArrayList<Info> info=new ArrayList();
        for (good_robot i : robots)
        {
            Info temp=new Info(name, i.getLevel(), i.getCoord(), i.HP);
            temp.loadMobs(i.getField());
            info.add(temp);
        }
        return info;
    }
}
