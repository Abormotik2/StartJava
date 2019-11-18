import java.util.Scanner;

public class Player {
    private String name;
    private Scanner scanner;

    public Player(String name, Scanner scanner) {
        this.name = name;
        this.scanner = scanner;
    }

    public int askNumber() {
            System.out.println("Input number," + name);
            return scanner.nextInt();
    }
    public String getName(){
        return name;
    }

    @Override
    public String toString() {
        return name;
    }
}