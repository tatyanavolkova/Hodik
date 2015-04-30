/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interpretator;

import interpretator.cmd.CMD;
import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author micen
 */
public final class Interpretator {

    /**
     * @param args the command line arguments
     */
    Parser parser;
    Boolean debugMode = false;
    ArrayList<CMD> cmdList;
    Iterator<CMD> iterator = cmdList.iterator();

    String runNextCMD() {
        return iterator.next().Run();
    }

    void run() {
        if (debugMode) {
            //NTD
        } else {
            while (iterator.hasNext()) {
                System.out.println(runNextCMD());
            }
        }
    }

    public Interpretator()
    {
        parser=new Parser("cmd.txt");
        cmdList=parser.getList();
        iterator= cmdList.iterator();
        run();
    }
    
}
