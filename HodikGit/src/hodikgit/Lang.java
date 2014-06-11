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

/**
 * @author lenovo
 */
public class Lang {
       Lang () {
         System.out.print("Started reading");
        BufferedReader in;
        try {
            in = new BufferedReader(new InputStreamReader(new FileInputStream("C:\\Users\\lenovo\\Documents\\prog.txt")));
           System.out.println();
            while (in.ready()) {
                String str = in.readLine();
                 String[] vals=str.split("\n");
		if(vals!=null) {
			for(int i=0; i<vals.length; i++) {
				System.out.println(vals[i]);
			}
            }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static void main(String[] args) {
        Lang  k = new Lang ();
    }
}


