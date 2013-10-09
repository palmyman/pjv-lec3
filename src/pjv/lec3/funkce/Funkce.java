/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pjv.lec3.funkce;

/**
 *
 * @author cuhellub
 */
public class Funkce {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        LinFce f = new LinFce(1, 1);
        System.out.println(f.getA());
        System.out.println(f.getB());
        System.out.println(f.funValue(1000));
        System.out.println(f.funValue(1000));
        System.out.println(LinFce.IDENTITA.funValue(3));
        System.out.println(LinFce.IDENTITA);
        LinFce i = new LinFce(1, 0);
        System.out.println(i == LinFce.IDENTITA);

        System.out.println(i.equals(LinFce.IDENTITA));

    }
    
}
