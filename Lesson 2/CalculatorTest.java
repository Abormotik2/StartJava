import java.util.Scanner;

public class CalculatorTest {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Calculator calc;
        label: do {
            calc = new Calculator();
            System.out.println("Edit first number : ");
            while (calc.setNum1(scan.nextInt()) < 0) ;
            System.out.println("Edit the operation: ");
            while (calc.setMove(scan.next().charAt(0)) == '\0') ;
            System.out.println("Edit second number : ");
            while (calc.setNum2(scan.nextInt()) < 0);
            System.out.println("Result: " + calc.getRes());
            while (true) {
                System.out.println("Do u want to continue? Say yes or no...");
                String answer = scan.nextLine();
                if (answer.equals("no")) {
                    System.out.println("Bye");
                    break label;
                } else if (answer.equals("yes")) {
                    break;
                }
            }
        }while (true);
    }
}