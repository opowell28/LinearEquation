/**
 * A class that defines a linear equation of the form y = mx + b, and provides a method for computing intercepts
 * of two linear equations.
 * Definition:
 * LinearEquation l = new LinearEquation(m, b);
 * Where m is slope and b is y-intercept.
 * @author Owen Powell
 */

public class LinearEquation {
    private double m, b;

    /**
     * Constructor for a LinearEquation object
     * @param m1 slope of the line
     * @param b1 y-intercept of the line
     */
    public LinearEquation(double m1, double b1) {
        m = m1;
        b = b1;
    }

    // getters and setters
    public double getM() {
        return m;
    }

    public double getB() {
        return b;
    }

    public void setM(double m) {
        this.m = m;
    }

    public void setB(double b) {
        this.b = b;
    }

    public void computeIntercept(LinearEquation linearEquation2) {
        /* Math here comes from the simplified algebraic steps for computing intercepts.
           The lone variables come from the LE object the function is called on.
           Getters return the slope/intercept values for the LE object which is the parameter.
         */
        double xInt = (linearEquation2.getB() - b) / (m - linearEquation2.getM());
        double yInt = (m * xInt) + b;

        System.out.println("The intercept of the equations is " + "(" + xInt + ", " + yInt + ")");
    }
}
