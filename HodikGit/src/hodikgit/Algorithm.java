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
public class Algorithm {
    String name;
    String path;
    int state=0; // 0 - empty, 1 - file path, 2 - translated algorithm
    public Algorithm(String p)
    {
        path=p;
        String[] a = path.split("/");
        String[] temp=(a[a.length-1]).split("\\.");
        name=temp[0];
    }
    public Algorithm(String n, String p)
    {
        name=n;
        path=p;
    }
    public void changeName(String newname)
    {
        System.out.print("Algorithm name changed: " + name);
        name=newname;
        System.out.print(" -> " + name);
    }
    public String getname()
    {
        return name;
    }
    public String out()
    {
        return name + "(" + path + ")";
    }
}
