import java.util.Scanner;

public class GuessNumberTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Player p1 = new Player();
        Player p2 = new Player();
        GuessNumber game = new GuessNumber();
        System.out.println("Call the first player: ");
        p1.setName(scan.nextLine());
        System.out.println("Call the second player: ");
        p2.setName(scan.nextLine());
        System.out.println("And now, lets start " + p1.getName() + " and " + p2.getName());
        label:
        do {
            System.out.println(p1.getName() + " input ur number pls: ");
            p1.setNumber(scan.nextInt());
            System.out.println(p2.getName() + " input ur number pls: ");
            p2.setNumber(scan.nextInt());
            if (p1.getNumber() == game.getPcNum()) {
                game.setP1Right(true);
            } else if (p1.getNumber() > game.getPcNum()) {
                System.out.println(p1.getName() + "'s" + " num is bigger then mine");
            } else {
                System.out.println(p1.getName() + "'s" + " num is smaller then mine");
            }
            if (p2.getNumber() == game.getPcNum()) {
                game.setP2Right(true);
            } else if (p2.getNumber() > game.getPcNum()) {
                System.out.println(p2.getName() + "'s" + " num is bigger then mine");
            } else {
                System.out.println(p2.getName() + "'s" + " num is smaller then mine");
            }
            if (game.getP1Right() || game.getP2Right()) {
                System.out.println("Great we have a champion!");
                System.out.println(p1.getName() + " guess? " + game.getP1Right());
                System.out.println(p2.getName() + " guess? " + game.getP2Right());
                System.out.println("This game is end!");
                game.setP1Right(false);
                game.setP2Right(false);
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
            } else {
                System.out.println("Try again guys!");
            }

        } while (true);
    }
}