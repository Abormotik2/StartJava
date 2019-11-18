import java.util.Scanner;

public class GuessNumber {
    private int pcNum;
    private Player p1;
    private Player p2;
    private Scanner scanner;

    public GuessNumber(Player player1, Player player2, Scanner scanner) {
        this.p1 = player1;
        this.p2 = player2;
        this.scanner = scanner;
    }

    public void startGame() {
        pcNum = (int) (Math.random() * 101);
        System.out.println("And now, lets start " + p1 + " and " + p2);
        Player currentPlayer = p1;
        do {
            System.out.println(currentPlayer.getName() + " play game ");
            int count = currentPlayer.askNumber();
            if (count == pcNum) {
                System.out.println("Great, " + currentPlayer.getName() + " win!");
                break;
            } else if (count > pcNum) {
                System.out.println(currentPlayer.getName() + "'s" + " num is bigger then mine");
            } else {
                System.out.println(currentPlayer.getName() + "'s" + " num is smaller then mine");
            }
            currentPlayer = currentPlayer == p1 ? p2 : p1;
        } while (true);
    }
}