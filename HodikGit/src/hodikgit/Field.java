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
import java.util.Timer;
import java.util.HashMap;
/**
 *
 * @author NS
 */
public class Field
{
/*    int coordX = 0;
    int coordY = 0;
    Coordinate start;
    HashMap<Coordinate,Cell> hex = new HashMap<>();
    Coordinate myField;
  */  
    public int width;
    public int height;
    
    public boolean isFilled(Coordinate coord)
    {
        //check, if is filled - true;
        return false;
    }
    
    class Cell extends HashMap<Coordinate,Cell>
    {
        	Cell get(int x, int y) 
		{
			Coordinate pos = new Coordinate(x, y);
			return this.get(pos);
		}

		void set(Cell cell) 
                {
			this.put(cell.getCoordinate(), cell); //ill think it over and do it later
		}
}
    public Cell cells = new Cell();
    
    public Cell[] getallCell()
	{
            return this.cells.values().toArray(new Cell[0]);
        }
    public void setCell(Cell cell)
    {
        this.cells.set(cell);
    }
    public Cell getCell(int x ,int y)
    {
        return this.cells.get(x , y);
    }
    public Field(int width, int height) 
    {
		this.width = width;
		this.height = height;
    }
 
    public int getWidth()
    {
        return this.width;
    }
    public int getHeight()
    {
        return this.height;
    }
}

//////saved my old one just in case ///////////////
    /*public Field(Coordinate F)
    {
        myField = F;
        fieldheight = myField.getX();
        fieldwidth = myField.getY();
       // createField(fieldheight,fieldwidth);
    
    }
    void createField(int x,int y)
    {
       Coordinate coord = new Coordinate(x,y);
    }
   
*/

 ////////////////////check it later/was writed by old group////////////////////////////
  /*
File fld_create_obst(File F)
    {
        System.out.println("Здесь создается поле из файла");
        for(int i=0;i<h;i++)
            for(int j=0;j<w;j++)
            {
                obstacles.add(new Coordinate(i,j,0));
            }
        for(int i=0;i<obstacles.size();i++) obstacles<i>.toString();
        return F;
    }
    
    void fld_move_frame(int horizontal, int vertical)
    {
        this.coordX += horizontal;
        this.coordY += vertical;
    }
}*/  