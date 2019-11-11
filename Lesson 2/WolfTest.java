public class WolfTest {

    public static void main(String[] args) {
        Wolf wolf = new Wolf();
        wolf.isMan = true;
        wolf.name = "Scar";
        wolf.weight = 30.5f;
        wolf.age = 10;
        wolf.color = 'w';//white
        System.out.println("Wolf isMan sex: " + wolf.isMan);
        System.out.println("Wolf name is: " + wolf.name);
        System.out.println("Wolw weight: " + wolf.weight);
        System.out.println("Wolf age: " + wolf.age);
        System.out.println("Wolf color: " + wolf.color);
        wolf.walk();
        wolf.sit();
        wolf.run();
        wolf.howl();
        wolf.hunt();
    }
}