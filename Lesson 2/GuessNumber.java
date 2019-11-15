public class GuessNumber {
    private int pcNum = (int) (Math.random() * 100);
    private boolean p1Right = false;
    private boolean p2Right = false;

    public int getPcNum() {
        return pcNum;
    }

    public boolean getP1Right() {
        return p1Right;
    }

    public void setP1Right(boolean p1Right) {
        this.p1Right = p1Right;
    }

    public boolean getP2Right() {
        return p2Right;
    }

    public void setP2Right(boolean p2Right) {
        this.p2Right = p2Right;
    }
}