import java.io.IOException;
import java.util.Scanner;

public class CalculatorTest {

    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        Calculator calc;
        do {
            calc = new Calculator();
            System.out.println("Edit first number : ");
            while (calc.setNum1(scan.nextInt()) < 0) ;
            System.out.println("Edit the operation: ");
            while (calc.setMove(scan.next().charAt(0)) == '\0') ;
            System.out.println("Edit second number : ");
            while (calc.setNum2(scan.nextInt()) < 0);
            System.out.println("Result: " + calc.getRes());
            System.out.println("Do u,r want to continue? Say yes or no...");
        }
        while (scan.nextLine().equals("yes"));
    }
}