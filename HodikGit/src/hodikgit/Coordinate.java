/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package hodikgit;

/**
 *
 * @author NS
 */
public class Coordinate
{
    public int x;
    public int y;
    
    public Coordinate (int cordx, int cordy)
    {
        this.x = cordx;
        this.y = cordy;
    }
    public int getX()
    {return x;}
    public int getY()
    {return y;}
    
    public int setX(int newx)
    {
        this.x = newx;
        return x;
    }
    public int setY(int newy)
    {
        this.y = newy;
        return y;
    }


@Override
public int hashCode() 
{
     return x + y;
}        
@Override
public boolean equals(Object obj)
{
    boolean result = false;
	if (obj instanceof Coordinate)
        {
            Coordinate another = (Coordinate)obj;
            if (this.getX() == another.getX() && this.getY() == another.getY())
            {
                result = true;
            }
	}
        return result;
}
}
