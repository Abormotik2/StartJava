public class WolfTest {

    public static void main(String[] args) {
        Wolf wolf = new Wolf();
        wolf.isMan = true;
        System.out.println(wolf.isMan);
        wolf.name = "Шрам";
        System.out.println(wolf.name);
        wolf.weight = 30.5f;
        System.out.println(wolf.weight);
        wolf.age = 10;
        System.out.println(wolf.age);
        wolf.color = 'w';//white
        System.out.println(wolf.color);
        
        wolf.walk();
        wolf.sit();
        wolf.run();
        wolf.howl();
        wolf.hunt();
    }
}