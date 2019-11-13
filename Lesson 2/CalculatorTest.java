import java.util.Scanner;

public class CalculatorTest {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Calculator calc = new Calculator();
        boolean flag = true;
        do {
            calc.setNum1(calc.numFirst());
            calc.setMove(calc.operation());
            calc.setNum2(calc.numSecond());
            calc.setRes(calc.calc(calc.getNum1(), calc.getMove(), calc.getNum2()));
            System.out.println("Result: " + calc.getRes());
            while (flag) {
                System.out.println("Do u,r want to continue? Say yes or no...");
                String answer = scan.nextLine();
                if (answer.equals("no")) {
                    System.out.println("Bye!");
                    flag = false;
                } else if (answer.equals("yes")) {
                    System.out.println("Go!");
                    break;
                }
            }
        }
        while (flag);
    }
}