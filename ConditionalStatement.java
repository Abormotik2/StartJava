public class ConditionalStatement{
    public static void main(String[] args) {
        int age;
        float height;
        char nameletter;
        char sex;
        age = 28;
        sex = 'M';
        height = 1.92f;
        nameletter = 'V';
        if (age > 20) {
            System.out.println("U,r so old!");
        }
        if (sex == 'M') {
            System.out.println("U,r man!");
        }
        if (sex != 'M') {
            System.out.println("U,r women!");
        }

        if (height > 1.80) {
            System.out.println("U,r so tall!");
        } else {
            System.out.println("U,r not tall");

        }
        if (nameletter == 'M') {
            System.out.println("Maybe u,r call Michel!?");

        } else if (nameletter == 'I') {
            System.out.println("Maybe u,r call Ilisk!?");
        } else {
            System.out.println("U,r welcome Vladimir!");
        }
    }
}