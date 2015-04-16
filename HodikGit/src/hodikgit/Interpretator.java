/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hodikgit;

import hodikgit.Coordinate;
import java.io.File;

/**
 *
 * @author user
 */
public class Interpretator {
    Coordinate c;
    Lang rl;

    public Interpretator(){
        c = new Coordinate();
        rl = new Lang();
    }
    public Interpretator (Coordinate C){
        this.c=C;
        rl = new Lang();
        
    }
    
    /*public boolean Run (int i){
          if (rl.vals[i].equals("Step")) {this.Step(); System.out.println("Step");};
          if (rl.vals[i].equals("Rotate")) {this.Rotate();System.out.println("Rotate");};
          if (rl.vals[i].equals("End")) return true;
          return false;

    }
   
    public void Step(){
       if(this.c.p==0) this.c.x=this.c.x+1;
       if(this.c.p==1) this.c.y=this.c.y+1;
       if(this.c.p==2) this.c.x=this.c.x-1;
       if(this.c.p==3) this.c.y=this.c.y-1;
    }
    
    public void Rotate(){
        this.c.p=(this.c.p+1)%4;        
    }*/
   
   
}
