package Zad11DziedziczenieFigury.OpcjeFigur;

import Zad11DziedziczenieFigury.KlasyGlowne.Figura;

public class Prostokat extends Figura {

    public Prostokat(int[] boki) {
        super(boki);
    }

    @Override
    public double obliczPole() {
        int a = boki[0];
        int b = boki[1];

        return a*b;
    }

    @Override
    public String toString() {
        return "Prostokat";
    }
}
