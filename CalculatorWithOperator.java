package Calculator;

public class CalculatorWithOperator {
    public double a, b;
    public int c;


    public double plus(double a, double b) {
        return a + b;

    }

    public double minus(double a, double b) {
        return a - b;

    }

    public double multi(double a, double b) {
        return a * b;

    }

    public double divide(double a, double b) {
        return a / b;

    }

    public double power(double a, int c) {
        for (int i = 2; i <= c; i++) {
            a = a * a;
        }
        return a;
    }
}
