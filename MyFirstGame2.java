public class MyFirstGame2 {
    public static void main(String[] args) {
        int start = 0;
        int nummax = 100;
        int numcomp = 53;
        int numuser = 55;
        System.out.println("Edit number from " + start + " to " + nummax);
        while (true) {
            if (numcomp == numuser) {
                System.out.println("U,r wish!!!Lesson done!");
                break;
            } else if (numuser > numcomp) {
                System.out.println("U,r number is bigger then mine");
            } else if (numuser < 0 && numuser > 100) {
                System.out.println("U,r number is not at game");
            } else {
                System.out.println("U,r number is smaller then mine");
            }
        }
    }
}
