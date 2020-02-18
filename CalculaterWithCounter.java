package Calculator;

public class CalculaterWithCounter extends CalculatorWithMath {
    private int counter;

    public double plus3(double a, double b) {
        this.counter++;
        return super.plus2(a, b);


    }

    public double multi3(double a, double b) {
        this.counter++;
        return super.multi2(a, b);
    }

    public double divide3(double a, double b) {
        this.counter++;
        return super.divide2(a, b);

    }

    public double power3(double a, int b) {
        this.counter++;
        return super.power2(a, b);
    }

    public int getCounter() {

        return counter;
    }
}

