import java.util.Scanner;

public class CalculatorTest {

    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        Calculator calc1 = new Calculator();
        String yes = "yes";
        String no = "no";

        while (true) {
            calc1.setNum1(calc1.numFirst());
            calc1.setMove(calc1.operation());
            calc1.setNum2(calc1.numSecond());
            calc1.setRes(calc1.calc(calc1.getNum1(), calc1.getMove(), calc1.getNum2()));
            System.out.println("Result: " + calc1.getRes());
            System.out.println("Do u,r want to continue? Say yes or no...");
            if (t.nextLine().equals(no)) {
                break;
            }
            while (true) {
                if (t.equals(yes)) {
                    System.out.println("Go!");
                    break;
                }
               else if (t.equals(no)) {
                    System.out.println("Bye");
                    break;
                }
            }
        }
    }
}