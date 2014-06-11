/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package hodikgit;
import java.io.File;
import java.util.ArrayList;
/**
 *
 * @author Саша
 */
public class Field {
    int h, w;
    Coordinate start;
    ArrayList<Coordinate> obstacle;
    
    public Field(int a, int b){
        this.h = a;
        this.w = b;
    }
    File fld_create(File F)
    {
        System.out.println("Здесь создается поле из файла");
        return F;
    }
}
