/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hodikgit;

/**
 *
 * @author user
 */
public class Interpretator {
    Coordinate c = new Coordinate();

    public Interpretator(){
        c.x=0;
        c.y=0;
        c.p=0;
    }
    public Interpretator (Coordinate C){
        this.c=C;
    }
    
    public void Run (String[] Command){
        int i=0;
        while (Command[i]!=null){
            if (Command[i].equals("Step")) this.Step();
            if (Command[i].equals("Rotate")) this.Rotate();
            i++;
        }

    }
    
    public void Step(){
       if(this.c.p==0) this.c.y=this.c.y+1;
       if(this.c.p==1) this.c.x=this.c.x+1;
       if(this.c.p==2) this.c.y=this.c.y-1;
       if(this.c.p==3) this.c.x=this.c.x-1;
    }
    
    public void Rotate(){
        this.c.p=(this.c.p+1)%4;        
    }
   
   
}
