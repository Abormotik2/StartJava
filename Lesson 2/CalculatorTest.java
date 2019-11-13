import java.util.Scanner;

public class CalculatorTest {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Calculator calc = new Calculator();
        do {
            calc.setNum1(calc.numFirst());
            calc.setMove(calc.operation());
            calc.setNum2(calc.numSecond());
            calc.setRes(calc.calc(calc.getNum1(), calc.getMove(), calc.getNum2()));
            System.out.println("Result: " + calc.getRes());
            while (!scan.equals("yes") || !scan.equals("no")) {
                System.out.println("Do u,r want to continue? Say yes or no...");
                if (scan.equals("no")) {
                    System.out.println("Bye!");
                    break;
                } else if (scan.nextLine().equals("yes")) {
                    System.out.println("Go!");
                    break;
                }
            }
        }
        while (scan.equals("yes"));
    }
}