public class Wolf {
    private boolean isMan;
    private String name;
    private float weight;
    private int age;
    private char color;
    public boolean isMan() {
        return isMan;
    }

    public void setMan(boolean man) {
        this.isMan = man;
    }

    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }
    
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