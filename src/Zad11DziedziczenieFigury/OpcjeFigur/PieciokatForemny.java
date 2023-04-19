package Zad11DziedziczenieFigury.OpcjeFigur;

import Zad11DziedziczenieFigury.KlasyGlowne.Figura;

public class PieciokatForemny extends Figura {

    public PieciokatForemny(int[] boki) {
        super(boki);
    }

    @Override
    public double obliczPole() {
        int a = boki[0];

        return (Math.pow(a, 2))/4 * Math.sqrt(25+10*Math.sqrt(5));
    }

    @Override
    public String toString() {
        return "Pieciokat";
    }

}


