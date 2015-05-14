/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interpretator;

import hodikgit.Coordinate;
import interpretator.cmd.CMD;
import hodikgit.Direction;
import interpretator.cmd.Rotate;
import interpretator.cmd.Step;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import robots.good_robot;

/**
 *
 * @author micen
 */
public class Parser {

    Coordinate c=new Coordinate(2,3);
    Direction d;
    private static final Logger log = Logger.getLogger(Parser.class.getName());
    good_robot currRobot;
    ArrayList<String> alphabet = new ArrayList();
    ArrayList<String> readedText = new ArrayList();
    ArrayList<CMD> cmdList = new ArrayList();

    public Parser(String Url, good_robot robot) {
        currRobot=robot;
        this.d = Direction.UP;
        alphabet.add("Step");
        alphabet.add("Rotate");
        alphabet.add("Left");
        alphabet.add("Right");
//        alphabet.add("Forward");
//        alphabet.add("Back");
        openFile(Url);
        read();
        Parse();
    }
    BufferedReader br = null;
    File file = null;

    public ArrayList<CMD> getList(){
        return cmdList;
    }
    
    final void openFile(String filePath) {
        try {
            file = new File(filePath);
            try {
                br = new BufferedReader(
                        new InputStreamReader(
                                new FileInputStream(file), "UTF-8"
                        )
                );
            } catch (UnsupportedEncodingException ex) {
                Logger.getLogger(Parser.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (FileNotFoundException ex) {
            log.log(Level.SEVERE, "{0}" + " " + "File Not Found", filePath);
        }
    }

    void read() {
        while (true) {
            String line = null;
            try {
                if ((line = br.readLine()) != null) {
                    log.log(Level.FINE, "readed:", line);
                    readedText.add(line);
                } else {
                    break;
                }
            } catch (IOException ex) {
                Logger.getLogger(Parser.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
    }
   ArrayList<String> prepare() {
        ArrayList<String> buffer = new ArrayList();
        for (String readedText1 : readedText) {
            String[] split = readedText1.split(" ");
            for (String split1 : split) {
                if (!split1.equals("")) {
                    buffer.add(split1);
                }
            }
        }
        return buffer;
    }
    void Parse() {
        ArrayList<String> buffer=prepare();
        for (int i = 0; i < buffer.size(); i++) {
            CMD result = null;
            if (alphabet.contains(buffer.get(i))) {
                if (buffer.get(i).equals("Step")) {
                result = new Step(currRobot);
                    cmdList.add(result);
                    continue;
                }
                if (buffer.get(i).equals("Rotate")) {
                    String tag = buffer.get(i + 1);
                    if (tag.toLowerCase().equals("left")) {
                        result = new Rotate("left",currRobot);
                        cmdList.add(result);
                        i++;
                        continue;
                    }
                    if (tag.toLowerCase().equals("right")) {
                         result = new Rotate("right",currRobot);
                        cmdList.add(result);
                        i++;
                        //continue;
                    }
//                    if (tag.toLowerCase().equals("forward")) {
//                         result = new Rotate("up",currRobot);
//                        cmdList.add(result);
//                        i++;
//                        continue;
//                    }
//                    if (tag.toLowerCase().equals("back")) {
//                         result = new Rotate("down",currRobot);
//                        cmdList.add(result);
//                        i++;
//                    }
                }
            } else {
                log.log(Level.SEVERE, "no such command:", buffer.get(i));
            }
        }
    }
}
