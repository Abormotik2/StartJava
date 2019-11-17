import java.util.Scanner;

public class GuessNumber {
    private Scanner scan = new Scanner(System.in);
    private int pcNum = (int) (Math.random() * 100);
    private boolean p1Right = false;
    private boolean p2Right = false;
    private String answer;


    public void startGame() {
        System.out.println("Call the first player: ");
        Player p1 = new Player(scan.nextLine());
        System.out.println("Call the second player: ");
        Player p2 = new Player(scan.nextLine());
        System.out.println("And now, lets start " + p1 + " and " + p2);
        do {
            System.out.println(p1 + " input ur number pls: ");
            p1.setNumber(scan.nextInt());
            System.out.println(p2 + " input ur number pls: ");
            p2.setNumber(scan.nextInt());
            if (p1.getNumber() == pcNum) {
                p1Right = true;
            } else if (p1.getNumber() > pcNum) {
                System.out.println(p1 + "'s" + " num is bigger then mine");
            } else {
                System.out.println(p1 + "'s" + " num is smaller then mine");
            }
            if (p2.getNumber() == pcNum) {
                p2Right = true;
            } else if (p2.getNumber() > pcNum) {
                System.out.println(p2 + "'s" + " num is bigger then mine");
            } else {
                System.out.println(p2 + "'s" + " num is smaller then mine");
            }
            if (p1Right || p2Right) {
                System.out.println("Great we have a champion!");
                System.out.println(p1 + " guess? " + p1Right);
                System.out.println(p2 + " guess? " + p2Right);
                System.out.println("This game is end!");
                p1Right = false;
                p2Right = false;
                while (true) {
                    System.out.println("Do u want to continue? Say yes or no...");
                    answer = scan.nextLine();
                    if (answer.equals("no")) {
                        System.out.println("Bye");
                        break;
                    } else if (answer.equals("yes")) {
                        break;
                    }
                }
            } else {
                System.out.println("Try again guys!");
            }
        } while (true);
    }
}