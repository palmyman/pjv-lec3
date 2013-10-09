/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pjv.lec3.funkce;

/**
 *
 * @author cuhellub
 */
public class LinFceInt extends LinFce {   
    double max, min;
    
    public LinFceInt(double max, double min, double b) {
        super(b);
        this.max = max;
        this.min = min;
    }

    public LinFceInt(double max, double min, double a, double b) {
        super(a, b);
        this.max = max;
        this.min = min;
    }
//    @Override
//    double funValue(double x) {
//        //throw Exception
//        return this.a * x + this.b;
//    }
}
