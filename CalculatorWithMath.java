package Calculator;

public class CalculatorWithMath {
private double a,b;
    private int c;
    public double  plus2 (double  a, double  b){
        return a + b;

    }
    public double  minus2 (double  a, double  b){
        return a - b;

    }
    public double  multi2 (double  a, double  b){
        return a * b;

    }
    public double  divide2 (double  a, double  b) {
        return a / b;

    }
    public double power2(double a, int c){
        return Math.pow(a,c);
    }

    public double abs2 (double a){
        return Math.abs(a);
    }

    public double sqrt2 (int s){
        return Math.sqrt(s);
    }




}
