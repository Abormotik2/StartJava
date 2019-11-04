import java.util.Scanner;

public class Unicode {
    static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
          for (char i = '\u0021'; i < '\u007e'; i++) {
          System.out.println(i);
        }
    }
}
