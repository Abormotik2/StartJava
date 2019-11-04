import java.util.Scanner;

public class MyFirstGame {

    static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int ch;
        int chisla = 100;
        int num = (int) (Math.random() * chisla);
        System.out.println("Guess the number from 0 to " + chisla);
        while (true) {

            ch = s.nextInt();
            if (ch == num) {
                System.out.println("U,r wish!!!Lesson done!");
                break;
            } else if (ch > num) {
                System.out.println("U,r number is bigger then mine");
            } else {
                System.out.println("U,r number is smaller then mine");

            }
        }
        s.close();
    }
}
