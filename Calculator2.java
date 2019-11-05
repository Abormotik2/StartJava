public class Calculator2 {
    public static void main(String[] args) {
        int num1 = 8;
        int num2 = 3;
        char symbol = '^';
        if (symbol == '+') {
            System.out.println(num1 + num2);
        } else if (symbol == '-') {
            System.out.println(num1 - num2);
        } else if (symbol == '*') {
            System.out.println(num1 * num2);
        } else if (symbol == '/') {
            System.out.println(num1 / num2);
        } else if (symbol == '%') {
            System.out.println(num1 % num2);
        } else if (symbol == '^') {
            int result = 1;
            for (int i = 0; i < num2; i++) {
                result *= num1;
            }
            System.out.println(result);
        } else {
            System.out.println("Operation not found");
        }
    }
}





