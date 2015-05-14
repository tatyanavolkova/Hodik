/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hodikgit;
import interpretator.Interpretator;
/**
 *
 * @author jbenua
 */
public abstract class Field_object {
    protected Coordinate c;
    protected Field field;
    protected Integrator integr;
    protected Interpretator interp;
    /*
    aргументы:
    good_robot(поле, интегратор, интерпретатор, координата, 100, robot), где 100 - xp, robot - объект класса Unit
    bad_robot(поле, интегратор, интерпретатор, координата, "act_type")
    */
    public Coordinate getCoord()
    {
        return c;
    }
    abstract public String getType();
    public void setCoord(Coordinate coord)
    {
        c.x=coord.x;
        c.y=coord.y;
    }
    public Field getField()
    {
        return field;
    }
    public int getLevel()
    {
        return field.level;
    }
    public Interpretator getInterpr()
    {
        return interp;
    }
    public Field_object(Field a, Integrator i, Interpretator in, Coordinate coord)
    {
        interp=in;
        field=a;
        integr=i;
        c=coord;
    };
    
    public void show_info()
    {
        System.out.println("Hey! I'm on the field! Coords: " + c);
    }
    abstract public String getActtype();
    abstract public int getDamage();
}
