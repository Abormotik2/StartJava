public class JaegerTest {

    public static void main(String[] args) {
        Jaeger jaegerOne = new Jaeger();
        jaegerOne.setModelName("Gipsy Danger");
        jaegerOne.setMark("Mark-3");
        jaegerOne.setOrigin("USA");
        jaegerOne.setHeight(79.25f);
        jaegerOne.setWeight(1.980f);
        jaegerOne.setSpeed(7);
        jaegerOne.setStrength(8);
        jaegerOne.setArmor(6);
        allJaeger(jaegerOne);

        Jaeger jaegerTwo = new Jaeger();
        jaegerTwo.setModelName("Striker Eureka");
        jaegerTwo.setMark("Mark-5");
        jaegerTwo.setOrigin("USA");
        jaegerTwo.setHeight(76.2f);
        jaegerTwo.setWeight(1.850f);
        jaegerTwo.setSpeed(10);
        jaegerTwo.setStrength(10);
        jaegerTwo.setArmor(9);
        allJaeger(jaegerTwo);
    }

    private static void allJaeger(Jaeger jaegerTwo) {
        System.out.println(jaegerTwo.getModelName());
        System.out.println(jaegerTwo.getMark());
        System.out.println(jaegerTwo.getOrigin());
        System.out.println(jaegerTwo.getHeight());
        System.out.println(jaegerTwo.getWeight());
        System.out.println(jaegerTwo.getSpeed());
        System.out.println(jaegerTwo.getStrength());
        System.out.println(jaegerTwo.getArmor());
    }
}