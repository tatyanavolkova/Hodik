/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hodikgit;

/**
 *
 * @author user
 * апрапр
 */
public class HodikGit {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            Integrator i = new Integrator();
            LoginFrm logfr=new LoginFrm(i);
             logfr.setVisible(true); 
    }
}
