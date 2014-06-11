/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package hodikgit;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
/**
 *
 * @author Саша
 */
public class Field {
    int h, w;
    Coordinate start;
    ArrayList<Coordinate> obstacles;
    
    public Field(int a, int b){
        this.h = a;
        this.w = b;
/*        obstacles.add(new Coordinate(2,2,0));
        obstacles.add(new Coordinate(3,5,0));*/
    }
    File fld_create(File F)
    {
        System.out.println("Здесь создается поле из файла");
        return F;
    }
    
}
