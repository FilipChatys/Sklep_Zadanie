package Zad11DziedziczenieFigury.OpcjeFigur;

import Zad11DziedziczenieFigury.KlasyGlowne.Figura;

public class TrojkatRownoramienny extends Figura {

        public TrojkatRownoramienny(int[] boki) {
            super(boki);
        }

        @Override
        public double obliczPole() {
            int a = boki[0];
            int b = boki[1];
            int c = boki[2];

            double pole = 0;

            double h;

            if (a == b){
                h = Math.sqrt(a*a - Math.pow(((double) 1/2 * c), 2));
                pole = c * (h/2);
            } else if (a == c){
                h = Math.sqrt(a*a - Math.pow(((double) 1/2 * b), 2));
                pole = b * (h/2);
            } else if (b == c){
                h = Math.sqrt(a*a - Math.pow(((double) 1/2 * a), 2));
                pole = a * (h/2);
            }

            return pole;
        }
}


