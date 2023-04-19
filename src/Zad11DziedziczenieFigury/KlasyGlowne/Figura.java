package Zad11DziedziczenieFigury.KlasyGlowne;

public class Figura {
    protected int[] boki;

    public Figura(int[] boki) {
        this.boki = boki;
    }

    public double obliczObwod() {
        int obwod = 0;
        for (int bok : boki) {
            obwod = obwod + bok;
        }
        return obwod;
    }


    public double obliczPole() {

        return 0;
    }
}

