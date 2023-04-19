package Zad11DziedziczenieFigury.OpcjeFigur;

import Zad11DziedziczenieFigury.KlasyGlowne.Figura;

public class Kolo extends Figura {

    public Kolo(int[] boki) {
        super(boki);
    }

    @Override
    public double obliczPole() {
        int a = boki[0];

        return Math.PI * a * a;
    }

    @Override
    public double obliczObwod(int[] boki) {
        double obwod = 0;
        for (int bok : boki) {
            obwod = (double) (2 * Math.PI * boki[0]);
        }
        return obwod;
    }

    @Override
    public String toString() {
        return "Kolo";
    }

}
