package Zad11DziedziczenieFigury.OpcjeFigur;

import Zad11DziedziczenieFigury.KlasyGlowne.Figura;

public class Kwadrat extends Figura {

        public Kwadrat(int[] boki) {
            super(boki);
        }

        @Override
        public double obliczPole() {
            int a = boki[0];

            return a * a;
        }

        @Override
        public String toString() {
            return "Kwadrat";
        }
    }

