public class Wolf {
    private boolean isMan;

    public boolean isMan() {
        return isMan;
    }

    public void setMan(boolean man) {
        isMan = man;
    }

    private String name;
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private float weight;
    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    private int age;
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 8) {
            System.out.println("Incorrect age!");
        } else {
            this.age = age;
        }
    }

    private char color;
    public char getColor() {
        return color;
    }

    public void setColor(char color) {
        this.color = color;
    }


    public boolean walk() {
        return true;
    }

    public boolean sit() {
        return true;
    }

    public boolean run() {
        return true;
    }

    public void howl() {

    }

    public boolean hunt() {
        return true;
    }
}
