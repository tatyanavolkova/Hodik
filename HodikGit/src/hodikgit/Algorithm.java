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
    Algorithm(String p)
    {
        path=p;
        String[] a = path.split("/");
        String[] temp=(a[a.length-1]).split("\\.");
        name=temp[0];
    }
    Algorithm(String n, String p)
    {
        name=n;
        path=p;
    }
    public void changeName(String newname)
    {
        name=newname;
    }
}
