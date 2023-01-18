public class Simulation {
    private Coinflip[] flips;
    private Integer[] res;

    public Simulation(int größe) {
        this.flips = new Coinflip[größe];
        this.res = new Integer[größe];

        for (int i = 0 ; i < größe ; i++) {
            this.flips[i] = new Coinflip();
        }
    }

    public void saveRes() {
        for (int i = 0 ; i < this.flips.length ; i++) {
            this.res[i] = this.flips[i].getRes();
        }
    }

    public String toString() {
        this.saveRes();
        String txt = "";
        double t0=0, t1=0, t0rel, t1rel;
        int größe = this.res.length;

        for (int i = 0 ; i < größe ; i++) {
            if (this.res[i] == 0) {
                t0++;
            } else {
                t1++;
            }
        }

        t0rel = (t0/größe)*100;
        t1rel = (t1/größe)*100;

        return "Von " + größe + " Würfen gab es " + t0 + "(" + t0rel + "%) Heads und " + t1 + "(" + t1rel + "%) Tails.";
    }


}
