package Zad11DziedziczenieFigury.OpcjeFigur;

import Zad11DziedziczenieFigury.KlasyGlowne.Figura;

public class SzesciokatForemny extends Figura {

    public SzesciokatForemny(int[] boki) {
        super(boki);
    }

    @Override
    public double obliczPole() {

        int a = boki[0];


        return (3*(Math.pow(a, 2)*Math.sqrt(3)))/2;
    }

    @Override
    public String toString() {
        return "SzesciokatForemny";
    }

}
