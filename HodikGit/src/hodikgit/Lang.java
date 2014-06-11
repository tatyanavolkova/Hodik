/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package hodikgit;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/**
 * @author lenovo
 */
public class Lang {
   public String[] vals;
    
     public  Lang () {
       
         System.out.print("Started reading");
        BufferedReader in;
        try {
            in = new BufferedReader(new InputStreamReader(new FileInputStream("C:\\Users\\Lenovo\\Documents\\Univer\\Epifanov\\JAVA\\HDKfiles\\prog.txt")));
           System.out.println();
            while (in.ready()) {
                String str = in.readLine();
                vals=str.split("\n");
		if(vals!=null) {
                    for (String val : vals) {
                        System.out.println(val);
                    }
            }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    
}


