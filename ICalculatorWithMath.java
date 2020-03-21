package Calculator;

public class ICalculatorWithMath implements InterfaceCalc{
private double a,b;
    private int c;

    public double  Iplus (double  a, double  b){
        return a + b;

    }
    public double  Imulti (double  a, double  b){
        return a * b;

    }
    public double  Idivide (double  a, double  b) {
        return a / b;

    }
    public double Ipower(double a, int c){
        return Math.pow(a,c);
    }




}
