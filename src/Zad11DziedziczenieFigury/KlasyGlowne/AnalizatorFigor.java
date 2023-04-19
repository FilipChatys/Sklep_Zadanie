package Zad11DziedziczenieFigury.KlasyGlowne;

import Zad11DziedziczenieFigury.OpcjeFigur.TrojkatRownoboczny;

public class AnalizatorFigor extends Figura {



    public AnalizatorFigor(int[] boki) {
        super(boki);
        int n = boki.length;

        if (n == 3) {
            analizujTrojkat();
        } else if (n == 4) {
            analizujCzworokat();
        } else if (n == 5) {
            analizujPieciokat();
        } else if (n == 6) {
            analizujSzesciokat();
        } else {
            System.out.println("Nieznany rodzaj figury.");
        }
    }

    private void analizujTrojkat() {
        int a = boki[0];
        int b = boki[1];
        int c = boki[2];

        if (a == b && b == c) {
            System.out.println("Trójkąt równoboczny.");
            System.out.println(obliczObwod());
            System.out.println(obliczPole());
        } else if (a == b || b == c || a == c) {
            System.out.println("Trójkąt równoramienny.");
            System.out.println(obliczObwod());
            System.out.println(obliczPole());
        } else {
            System.out.println("Trójkąt różnoboczny.");
            System.out.println(obliczObwod());
            System.out.println(obliczPole());
        }
    }



    private void analizujCzworokat() {
        int a = boki[0];
        int b = boki[1];
        int c = boki[2];
        int d = boki[3];

        if (a == b && b == c && c == d) {
            System.out.println("Kwadrat.");
            System.out.println(obliczObwod());
            System.out.println(obliczPole());
        } else if ((a == b && c == d) || (a == d && b == c) || (a == c && b == d)) {
            System.out.println("Prostokąt.");
            System.out.println(obliczObwod());
            System.out.println(obliczPole());
        } else {
            System.out.println("Czworokąt nieforemny.");
            System.out.println(obliczObwod());
            System.out.println(obliczPole());
        }
    }

    private void analizujPieciokat() {
        int a = boki[0];
        int b = boki[1];
        int c = boki[2];
        int d = boki[3];
        int e = boki[4];

        if (a == b && b == c && c == d && d == e) {
            System.out.println("Pięciokąt foremny.");
            System.out.println(obliczObwod());
            System.out.println(obliczPole());
        } else {
            System.out.println("Pięciokąt nieforemny.");
            System.out.println(obliczObwod());
            System.out.println(obliczPole());
        }
    }

    private void analizujSzesciokat() {
        int a = boki[0];
        int b = boki[1];
        int c = boki[2];
        int d = boki[3];
        int e = boki[4];
        int f = boki[5];

        if (a == b && b == c && c == d && d == e && e == f) {
            System.out.println("Sześciokąt foremny.");
            System.out.println(obliczObwod());
            System.out.println(obliczPole());
        } else {
            System.out.println("Sześciokąt nieforemny.");
            System.out.println(obliczObwod());
            System.out.println(obliczPole());
        }
    }
}
