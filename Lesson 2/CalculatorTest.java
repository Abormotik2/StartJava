public class CalculatorTest {

    public static void main(String[] args) {
        Calculator calc1 = new Calculator();
        Calculator.calc(calc1.getNum1(), calc1.getMove(), calc1.getNum2());
        System.out.println("Result: " + calc1.getRes());
    }
}
