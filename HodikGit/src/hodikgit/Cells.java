/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hodikgit;

import java.util.HashMap;

/**
 *
 * @author r545-6
 */
class Cells extends HashMap<Coordinate,Field_object>
{
        Field_object get(int x ,int y)
        {
            Coordinate pos = new Coordinate(x ,y);
            return this.get(pos);
        }
    public Cells newcell=new Cells();
    public Field_object[] getallCells()
    {
        return this.newcell.values().toArray(new Field_object[0]);
    }
}
