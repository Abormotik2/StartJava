public class Player {
    private String name;
    private int number;

    public Player(String name) {
        this.name = name;
    }

    public String getName(){
        return name;
    }
    
    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return name;
    }
}