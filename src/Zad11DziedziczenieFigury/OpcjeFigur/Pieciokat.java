package Zad11DziedziczenieFigury.OpcjeFigur;

import Zad11DziedziczenieFigury.KlasyGlowne.Figura;

public class Pieciokat extends Figura {

    public Pieciokat(int[] boki) {
        super(boki);
    }

    @Override
    public double obliczPole() {
        int a = boki[0];
        int b = boki[1];
        int c = boki[2];
        int d = boki[3];
        int e = boki[4];

        //System.out.println("Nie mozna obliczyc pola");
        return 0;
    }

    @Override
    public String toString() {
        return "Pieciokat";
    }

}
