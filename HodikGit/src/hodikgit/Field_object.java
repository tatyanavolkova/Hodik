/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hodikgit;

/**
 *
 * @author jbenua
 */
public abstract class Field_object {
    Coordinate c;
    Field field;
    Integrator integr;
    Interpretator interp;
    /*
    aргументы:
    good_robot(поле, интегратор, интерпретатор, координата, 100, robot), где 100 - xp, robot - объект класса Unit
    bad_robot(поле, интегратор, интерпретатор, координата, 10, 5), где 10 - xp, 1 - тип поведения, 5 - урон
    */
    
    
    public Field_object(Field a, Integrator i, Interpretator in, Coordinate coord)
    {
        interp=in;
        field=a;
        integr=i;
        c=coord;
    };
    
    public void show_info()
    {
        System.out.println("Hey! I'm on the field "+ field);
        System.out.println("Coords: " + c);
    }
}
