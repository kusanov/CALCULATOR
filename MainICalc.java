package Calculator;

public class MainICalc {
    public static void main(String[] args) {

        InterfaceCalc IСalc = new ICalculatorWithMath ();
        double  total4 = IСalc.Iplus(IСalc.Iplus(4.1, IСalc.Imulti( 15, 7 )),
                IСalc.Ipower(IСalc.Idivide(28,5),2));
        System.out.println(total4);
    }
}
