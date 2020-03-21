package Calculator;

     public class MainCalcCount {
            public static void main(String[] args) {
                CalculaterWithCounter Сalculator3 = new CalculaterWithCounter();
                double  total3 = Сalculator3.plus3(Сalculator3.plus3(4.1, Сalculator3.multi3( 15, 7 )),
                        Сalculator3.power3(Сalculator3.divide3(28,5),2));
                System.out.println(total3);
                System.out.println(Сalculator3.getCounter());
    }
}
