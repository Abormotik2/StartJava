public class Cycle {
    public static void main(String[] args) {
        for (int i = 0; i <= 20; i++) {
            System.out.println(i);
        }

        System.out.println(" ");
        int counter = 6;
        while (counter >= -6) {
            System.out.println(counter);
            counter -= 2;
        }
        
        System.out.println(" ");
        int x = 10;
        int sumOdd = 0;
        do {
            if (x % 2 != 0) {
                sumOdd += x;
            }
        }
        while (x++ < 20);
        System.out.println(sumOdd);
    }
}
