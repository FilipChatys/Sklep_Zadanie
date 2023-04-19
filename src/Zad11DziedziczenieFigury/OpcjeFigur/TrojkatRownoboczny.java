package Zad11DziedziczenieFigury.OpcjeFigur;

import Zad11DziedziczenieFigury.KlasyGlowne.Figura;


public class TrojkatRownoboczny extends Figura {

        public TrojkatRownoboczny(int[] boki) {
            super(boki);
        }

        @Override
        public double obliczPole() {
            int a = boki[0];
            int b = boki[1];
            int c = boki[2];

            double pole = 0;

            if (a == b && b == c) {

                pole = Math.sqrt(3) / 4 * a * a;
            }

            return pole;
        }

        //@Override
        //public String toString() {
        //    return "Trójkąt Równoboczny";
        }


