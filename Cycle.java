public class Cycle{
    public static void main(String[] args) {
        for (int i = 0; i <= 20; i++) {
            System.out.println(i);

        }
        System.out.println(" ");
        int b = 6;
        while (b >= -6) {
            System.out.println(b);
            b = b - 2;

        }
        System.out.println(" ");

        int x = 10;
        int y = 0;
        do {
            if (x % 2 != 0) {
                y += x;
            }

        }
        while (x++ < 20);
        System.out.println(y);

    }
}
