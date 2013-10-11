/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pjv.lec3.funkce;

/**
 *
 * @author cuhellub
 */
public class LinFce {
    protected double a;
    protected double b;
    public static final LinFce IDENTITA = new LinFce(1, 0);

    public LinFce(double b) {
        this(0, b);
//        this.a = 0;
//        this.b = b;
    }

    public LinFce(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    double funValue(double x) {
        return this.a * x + this.b;
    }

    @Override
    public String toString() {
//        return String.format("xxxx", a,b);
        return String.format("a=" + a + ", b=" + b);
    }

    @Override
    public boolean equals(Object o) {
        if (o == null) {
            return false;
        }
        if (!(o instanceof LinFce)) {
            return false;
        }
        LinFce lf = (LinFce) o;
        return a == lf.getA() && b == lf.getB();
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 17 * hash + (int) (Double.doubleToLongBits(this.a) ^ (Double.doubleToLongBits(this.a) >>> 32));
        hash = 17 * hash + (int) (Double.doubleToLongBits(this.b) ^ (Double.doubleToLongBits(this.b) >>> 32));
        return hash;
    }
}
