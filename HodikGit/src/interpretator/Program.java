/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interpretator;

import interpretator.cmd.CMD;
import java.util.ArrayList;

/**
 *
 * @author micen
 */
public class Program {
    String name;
    ArrayList<CMD> cmdList;
    public Program(String s, ArrayList<CMD> list)
    {
        name=s;
        cmdList=list;
    }
    public String name()
    {
        return name;
    }
}
