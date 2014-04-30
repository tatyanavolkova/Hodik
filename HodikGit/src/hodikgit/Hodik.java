/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package hodikgit;

/**
 *
 * @author Lenovo
 */
public class Hodik {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            Integrator i = new Integrator();
            LoginFrm logfr=new LoginFrm(i);
             logfr.setVisible(true);
      
             }
    
}
