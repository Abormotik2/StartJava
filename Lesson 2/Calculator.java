public class Calculator {
    private int num1 = -1;
    private int num2 = -1;
    private char move = '\0';

    public int getNum1() {

        return num1;
    }

    public int setNum1(int num1) {
        if (num1 >= 0) {
            this.num1 = num1;
        } else {
            System.out.println("It's not positive number, or not number yet!");
        }
        return getNum1();
    }

    public char getMove() {

        return move;
    }

    public char setMove(char move) {
        switch (move) {
            case '+':
            case '-':
            case '*':
            case '/':
            case '^':
            case '%':
                this.move = move;
                break;
            default:
                System.out.println("Don't support type!");
        }
        return getMove();
    }

    public int getNum2() {
        return num2;
    }

    public int setNum2(int num2) {
        if (num2 >= 0) {
            this.num2 = num2;
        } else {
            System.out.println("It's not positive number, or not number yet!");
        }
        return getNum2();
    }

    public int getRes() {
        switch (move) {
            case '+':
                return num1 + num2;
            case '-':
                return num1 - num2;
            case '*':
                return num1 * num2;
            case '/':
                return num1 / num2;
            case '^':
                return (int) Math.pow(num1, num2);
            case '%':
                return num1 % num2;
        }
        throw new IllegalArgumentException("Calc Error!");
    }
}