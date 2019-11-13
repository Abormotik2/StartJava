import java.util.Scanner;

public class Calculator {
    static Scanner s = new Scanner(System.in);
    private int num1;
    private char move;
    private int res;
    private int num2;

    public int getNum1() {

        return num1;
    }

    public void setNum1(int num1) {

        this.num1 = num1;
    }

    public char getMove() {

        return move;
    }

    public void setMove(char move) {

        this.move = move;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {

        this.num2 = num2;
    }

    public int getRes() {

        return res;
    }

    public void setRes(int res) {

        this.res = res;
    }

    public int numFirst() {
        System.out.println("Edit first number : ");
        int num4;
        if (s.hasNextInt() && (num4 = s.nextInt()) > 0) {
            return num4;
        } else {
            System.out.println("It's not positive number, or not number yet!");
            return numFirst();
        }
    }

    public char operation() {
        System.out.println("Edit the operation: ");
        char op;
        if (s.hasNext()) {
            op = s.next().charAt(0);
            return op;
        } else {
            System.out.println("Try again!");
            return operation();
        }
    }

    public int calc(int num1, char move, int num2) {
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
                res = calc(num1, operation(), num2);
        }
        return res;
    }

    public int numSecond() {
        System.out.println("Edit second number: ");
        int num5;
        if (s.hasNextInt() && (num5 = s.nextInt()) > 0) {
            return num5;
        } else {
            System.out.println("It's not positive number, or not number yet!");
            s.next();
            return numSecond();
        }
    }
}