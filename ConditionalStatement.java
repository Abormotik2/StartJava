public class ConditionalStatement {
    public static void main(String[] args) {
        int age = 28;
        if (age > 20) {
            System.out.println("U,r so old!");
        }

        boolean sex = true;
        if (sex = true) {
            System.out.println("U,r man!");
        } else {
            System.out.println("U,r women!");
        }

        float height = 1.92f;
        if (height > 1.80) {
            System.out.println("U,r so tall!");
        } else {
            System.out.println("U,r not tall");
        }

        char nameletter = 'V';
        if (nameletter == 'M') {
            System.out.println("Maybe u,r call Michel!?");
        } else if (nameletter == 'I') {
            System.out.println("Maybe u,r call Ilya!?");
        } else {
            System.out.println("U,r welcome Vladimir!");
        }
    }
}