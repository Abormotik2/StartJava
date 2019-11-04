import java.util.Scanner;
public class Calculator {
        static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        int num1 = num();
        int num2 = num();
        char move = operation();
        int res = calc(num1, num2, move);
        System.out.println(res);
    }

    public static int num() {
        System.out.println("Edit number");
        int num4;
        if (s.hasNextInt() && (num4 = s.nextInt()) > 0) {
            return num4;
        } else {
            System.out.println("It's not positive number, or not number yet!");
            s.next();
            return num();
        }
    }

    public static char operation() {
        System.out.println("Edit operation");
        char move;
        if (s.hasNext()) {
            move = s.next().charAt(0);
            return move;
        } else {
            System.out.println("Not now");
            s.next();
            return operation();
        }
    }



    public static int calc(int num1, int num2, char move) {
        int res;
        switch (move) {
            case '+':
                res = num1 + num2;
                break;

            case '-':
                res = num1 - num2;
                break;

            case '*':
                res = num1 * num2;
                break;

            case '/':
                res = num1 / num2;
                break;
            case '^':
                res = (int) Math.pow(num1, num2);
                break;
            case '%':
                res = num1 % num2;
                break;
            default:
                System.out.println("Operation not found");
                res = calc(num1, num2, operation());
        }
        return res;
    }
}
