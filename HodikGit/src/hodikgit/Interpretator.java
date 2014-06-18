/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hodikgit;

import java.io.File;

/**
 *
 * @author user
 */
public class Interpretator {
    Coordinate c = new Coordinate();
    Lang rl;

    public Interpretator(){
        c.x=1;
        c.y=1;
        c.p=0;
        rl = new Lang();
    }
    public Interpretator (Coordinate C){
        this.c=C;
        rl = new Lang();
        
    }
    
    public void Run (File f){
        
        rl.readFromFile(f);
       
       int i=0;
        do
        {
          if (rl.vals[i].equals("Step")) this.Step();
          if (rl.vals[i].equals("Rotate")) this.Rotate();
          i++;
        }
        while(rl.vals[i].equals("End")==false);
               

    }
   
    public void Step(){
       if(this.c.p==0) this.c.x=this.c.x+1;
       if(this.c.p==1) this.c.y=this.c.y+1;
       if(this.c.p==2) this.c.x=this.c.x-1;
       if(this.c.p==3) this.c.y=this.c.y-1;
    }
    
    public void Rotate(){
        this.c.p=(this.c.p+1)%4;        
    }
   
   
}
