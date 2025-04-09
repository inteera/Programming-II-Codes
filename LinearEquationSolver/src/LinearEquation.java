public class LinearEquation {
    private final double a, b, c, d, e, f;

    public LinearEquation(double a, double b, double c, double d, double e, double f) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
    }

    public LinearEquation(double x1, double y1, double x2, double y2, double x3, double y3, double x4, double y4) {
        a = y1 - y2;
        b = x2 - x1;
        e = a * x1 + b * y1;

        c = y3 - y4;
        d = x4 - x3;
        f = c * x3 + d * y3;
    }

    public boolean isSolvable(){
        if(a*d - b*c == 0){
            return false;
        }
        return true;
    }

    public String getX(){
        if(!isSolvable()){
            return "The equation has no solution.";
        }
        return "x is: " + (e*d-b*f)/(a*d-b*c);
    }

    public String getY(){
        if(!isSolvable()){
            return "The equation has no solution.";
        }
        return "y is: " + (a*f-e*c)/(a*d-b*c);
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public double getD() {
        return d;
    }

    public double getE() {
        return e;
    }

    public double getF() {
        return f;
    }

    @Override
    public String toString() {
        return "The system is: \n" +
                a + "*x " + (b < 0 ? ("- " + -b) : ("+ " + b)) + "*y = " + e + "\n" +
                c + "*x " + (d < 0 ? ("- " + -d) : ("+ " + d)) + "*y = " + f;
    }
}
