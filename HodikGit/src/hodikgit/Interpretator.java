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
    
    public void Run (){
        int i=0;
//        while (this.rl.vals!=null){
//            System.out.println(this.rl.vals[i]);
//            if (this.rl.vals[i].equals("Step")) this.Step();
//            if (this.rl.vals[i].equals("Rotate")) this.Rotate();
//            i++;
//        }
        this.Step();
        this.Rotate();
        

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
