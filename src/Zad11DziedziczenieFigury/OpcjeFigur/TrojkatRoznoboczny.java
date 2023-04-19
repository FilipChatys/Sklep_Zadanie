package Zad11DziedziczenieFigury.OpcjeFigur;

import Zad11DziedziczenieFigury.KlasyGlowne.Figura;

public class TrojkatRoznoboczny extends Figura {
        public TrojkatRoznoboczny(int[] boki) {
            super(boki);
        }

        @Override
        public double obliczPole() {

            int a = boki[0];
            int b = boki[1];
            int c = boki[2];

            double p = (double) (a + b + c) / 2;

            return Math.sqrt(p * (p - a) * (p - b) * (p - c));
        }

        @Override
        public String toString() {
            return "Trójkąt Różnoboczny";
        }
    }


