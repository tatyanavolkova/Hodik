/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interpretator;

import interpretator.cmd.CMD;
import java.util.ArrayList;
import java.util.HashMap;
import robots.good_robot;

/**
 *
 * @author micen
 */
//TEST
public class ProgramDB {

    HashMap<good_robot, ArrayList<Program>> test;
    Parser parser;

    public ArrayList<CMD> find(good_robot robot, String programName) {
        ArrayList<Program> get = test.get(robot);
        for (Program get1 : get) {
            if (get1.name.equals(programName)) {
                return get1.List();
            }
        }
        return null;
    }

    /**
     *
     * @param name
     * @param url
     * @param robot
     */
    public void translate(String name, String url, good_robot robot) {
        if (test.get(robot) != null) {
            parser = new Parser(url, robot);
            ArrayList<CMD> list = parser.getList();
            test.get(robot).add(new Program(name, list));
        } else {
            parser = new Parser(url, robot);
            ArrayList<CMD> list = parser.getList();
            ArrayList<Program> buf = new ArrayList<>();
            buf.add(new Program(name, list));
            test.put(robot, buf);
        }
    }
}
