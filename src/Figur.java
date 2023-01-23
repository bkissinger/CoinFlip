public class Figur {
    private Flip[] flips, flipsCheater;
    private Integer[] res, resCheater;

    public Figur (int größe) {
        this.flips = new Coinflip[größe];
        this.flipsCheater = new Cheatflip[größe/3];
        this.res = new Integer[größe];
        this.resCheater = new Integer[größe/3];

        for (int i = 0 ; i < größe ; i++) {
            this.flips[i] = new Coinflip();
        }

        for (int i = 0 ; i < größe/3 ; i++) {
            this.flipsCheater[i] = new Cheatflip();
        }
        this.saveRes();
    }

    /**
     * 0 ==> Head
     * 1 ==> Tail
     */
    public void saveRes() {
        for (int i = 0 ; i < this.flips.length ; i++) {
            this.res[i] = this.flips[i].getRes();
        }

        for (int i = 0 ; i < this.flipsCheater.length ; i++) {
            this.resCheater[i] = this.flipsCheater[i].getRes();
        }
    }

    public Integer[] getRes() {
        return this.res;
    }

    public Integer[] getResCheater() {
        return this.resCheater;
    }

    /**
     * Gibt das Verhaeltnis zw Head und Tail der normalen Figur als String aus
     * @return Text
     */
    public String verhaeltnisRes() {
        double t0=0, t1=0, t0rel, t1rel;

        for (int i = 0 ; i < this.res.length ; i++) {
            if (this.res[i] == 0) {
                t0++;
            } else {
                t1++;
            }
        }

        t0rel = (t0/this.res.length)*100;
        t1rel = (t1/this.res.length)*100;

        return "Von " + this.res.length + " normalen Würfen gab es " + t0 + "(" + t0rel + "%) Heads und " + t1 + "(" + t1rel + "%) Tails.";
    }

    /**
     * Gibt das Verhaeltnis zw Head und Tail der Cheat Figur als String aus
     * @return
     */
    public String verhaeltnisResCheater() {
        double t0=0, t1=0, t0rel, t1rel;

        for (int i = 0 ; i < this.resCheater.length ; i++) {
            if (this.resCheater[i] == 0) {
                t0++;
            } else {
                t1++;
            }
        }

        t0rel = (t0/this.resCheater.length)*100;
        t1rel = (t1/this.resCheater.length)*100;

        return "Von " + this.resCheater.length + " Cheat-Würfen gab es " + t0 + "(" + t0rel + "%) Heads und " + t1 + "(" + t1rel + "%) Tails";

    }




    /**
     * Gibt aus, wv Heads und Tails die normalen und Cheater haben
     * @return Text
     */
    public String toString() {
        return this.verhaeltnisRes() + "\n" + this.verhaeltnisResCheater();
    }
}
