public class Coinflip {
    private int res;

    public Coinflip() {
        res = (int) (Math.random() * 2);
    }

    public int getRes() {
        return res;
    }

    public String toString() {
        if (res == 0) {
            return "Heads";
        } else {
            return "Tails";
        }
    }
}
