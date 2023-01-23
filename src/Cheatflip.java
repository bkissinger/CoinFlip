public class Cheatflip implements Flip {
    private int res;

    public Cheatflip() {
        res = (int) (Math.random() * 4);
    }

    public int getRes() {
        if (this.res == 0) {
            return 1;
        }
        return 0;
    }

    /**
     * 75% Chance, dass man Head bekommt.
     * @return
     */
    public String toString() {
        if (res == 0) {
            return "Tail";
        } else {
            return "Head";
        }
    }
}
