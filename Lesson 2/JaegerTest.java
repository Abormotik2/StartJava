public class JaegerTest {

    public static void main(String[] args) {
        Jaeger jaegerOne = new Jaeger("Gipsy Danger", "Mark-3", "USA");
        System.out.println(jaegerOne);
        Jaeger jaegerTwo = new Jaeger("Striker Eureka", "Mark-5", "USA", 76.2f, 1.850f);
        System.out.println(jaegerTwo);
        Jaeger jaegerThree = new Jaeger("Cayote Tango", "Mark-1", "USA", 5 ,7,4);
        System.out.println(jaegerThree);
        jaegerOne.drift();
        jaegerTwo.move();
        jaegerTwo.useVortexCannon();
        jaegerThree.scanKaiju();
    }
}