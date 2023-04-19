package Zad11DziedziczenieFigury.KlasyGlowne;

import Zad11DziedziczenieFigury.OpcjeFigur.TrojkatRownoboczny;

public class AnalizatorFigor extends Figura {


    public AnalizatorFigor(Figura figura) {
        super(figura.boki);

        switch (figura.boki.length) {
            case 1:
                System.out.println("Firura to koło.");
                break;
            case 3:
                System.out.println("Figura to trójkąt.");
                //analizujTrojkat();
                break;
            case 4:
                System.out.println("Figura to czworokąt.");
                //analizujCzworokat();
                break;
            case 5:
                System.out.println("Figura to pieciokąt.");
                //analizujPieciokat();
                break;
            case 6:
                System.out.println("Figura to sześciokąt.");
                //analizujSzesciokat();
                break;
            default:
                System.out.println("Niezdefiniowana figura.");
        }
    }
    public AnalizatorFigor(int[] boki) {
        super(boki);
        int n = boki.length;

        if(n == 1){
            analizujKolo(boki);
        } else if (n == 3) {
            analizujTrojkat(boki);
        } else if (n == 4) {
            analizujCzworokat(boki);
        } else if (n == 5) {
            analizujPieciokat(boki);
        } else if (n == 6) {
            analizujSzesciokat(boki);
        } else {
            System.out.println("Nieznany rodzaj figury.");
        }
    }

    private void analizujKolo(int[] boki){
        int a = boki[0];

        if(a!=0) {
            System.out.println("Kolo.");
            Kolo kolo = new Kolo(boki);
            System.out.println("Obwód: ");
            System.out.println(kolo.obliczObwod(boki));
            System.out.println("Pole: ");
            System.out.println(kolo.obliczPole());
        } else {
            System.out.println("Promien nie moze byc rowny 0 !");
        }
    }

    private void analizujTrojkat(int[] boki) {
        int a = boki[0];
        int b = boki[1];
        int c = boki[2];

        if (a!= 0 && b!=0 && c!= 0 && (a == b && b == c)) {
            System.out.println("Trójkąt równoboczny.");
            System.out.println("Obwód: ");
            System.out.println(obliczObwod(boki));
            System.out.println("Pole: ");
            TrojkatRownoboczny trojkatRownoboczny = new TrojkatRownoboczny(boki);
            System.out.println(trojkatRownoboczny.obliczPole());
        } else if (a!= 0 && b!=0 && c!= 0 && (a == b || b == c || a == c)) {
            System.out.println("Trójkąt równoramienny.");
            System.out.println("Obwód: ");
            System.out.println(obliczObwod(boki));
            System.out.println("Pole: ");
            TrojkatRownoramienny trojkatRownoramienny = new TrojkatRownoramienny(boki);
            System.out.println(trojkatRownoramienny.obliczPole());
        } else if (a==0 || b==0 || c==0){
            System.out.println("Bok nie moze byc rowny 0 ! Chyba ze chciales zrobic prosta");
        } else {
            System.out.println("Trójkąt różnoboczny.");
            System.out.println("Obwód: ");
            System.out.println(obliczObwod(boki));
            System.out.println("Pole: ");
            TrojkatRoznoboczny trojkatRoznoboczny = new TrojkatRoznoboczny(boki);
            System.out.println(trojkatRoznoboczny.obliczPole());
        }
    }

    private void analizujCzworokat(int[] boki) {
        int a = boki[0];
        int b = boki[1];
        int c = boki[2];
        int d = boki[3];

        if (a!= 0 && b!=0 && c!=0 && d!=0 && (a == b && b == c && c == d)) {
            System.out.println("Kwadrat.");
            System.out.println("Obwód: ");
            System.out.println(obliczObwod(boki));
            System.out.println("Pole: ");
            Kwadrat kwadrat = new Kwadrat(boki);
            System.out.println(kwadrat.obliczPole());
        } else if (a!= 0 && b!=0 && c!=0 && d!= 0 && (a == b && c == d) || (a == d && b == c) || (a == c && b == d)) {
            System.out.println("Prostokąt.");
            System.out.println("Obwód: ");
            System.out.println(obliczObwod(boki));
            System.out.println("Pole: ");
            Prostokat prostokat = new Prostokat(boki);
            System.out.println(prostokat.obliczPole());
        } else if( a== 0 || b==0 || c==0 || d== 0){
            System.out.println("Bok nie moze byc rowny 0 ! Być moze chciales skonstruowac trojkat ?");
        } else {
            System.out.println("Czworokąt nieforemny.");
            System.out.println("Obwód: ");
            System.out.println(obliczObwod(boki));
            System.out.println("Nie można policzyc pola majac tylko boki ");
            Czworokat czworokat = new Czworokat(boki);
            System.out.println(czworokat.obliczPole());
        }
    }

    private void analizujPieciokat(int[] boki) {
        int a = boki[0];
        int b = boki[1];
        int c = boki[2];
        int d = boki[3];
        int e = boki[4];

        if (a!= 0 && b!=0 && c!=0 && d!= 0 && e!=0 && (a == b && b == c && c == d && d == e)) {
            System.out.println("Pięciokąt foremny.");
            System.out.println("Obwód: ");
            System.out.println(obliczObwod(boki));
            System.out.println("Pole: ");
            PieciokatForemny pieciokatForemny = new PieciokatForemny(boki);
            System.out.println(pieciokatForemny.obliczPole());
        } else if( a== 0 || b==0 || c==0 || d== 0 || e==0){
            System.out.println("Bok nie moze byc rowny 0 ! Być moze chciales skonstruowac czworokat ?");
        } else {
            System.out.println("Pięciokąt nieforemny.");
            System.out.println("Obwód: ");
            System.out.println(obliczObwod(boki));
            System.out.println("Nie da sie policzyc pola tylko z bokow ");
            Pieciokat pieciokat = new Pieciokat(boki);
            System.out.println(pieciokat.obliczPole());
        }
    }

    private void analizujSzesciokat(int[] boki) {
        int a = boki[0];
        int b = boki[1];
        int c = boki[2];
        int d = boki[3];
        int e = boki[4];
        int f = boki[5];

        if (a!= 0 && b!=0 && c!=0 && d!= 0 && e!=0 && f!=0 && (a == b && b == c && c == d && d == e && e == f)) {
            System.out.println("Sześciokąt foremny.");
            System.out.println("Obwód: ");
            System.out.println(obliczObwod(boki));
            System.out.println("Pole: ");
            SzesciokatForemny szesciokatForemny = new SzesciokatForemny(boki);
            System.out.println(szesciokatForemny.obliczPole());
        } else if( a== 0 || b==0 || c==0 || d== 0 || e==0 || f==0){
            System.out.println("Bok nie moze byc rowny 0 ! Być moze chciales skonstruowac pieciokat ?");
        } else {
            System.out.println("Sześciokąt nieforemny.");
            System.out.println("Obwód: ");
            System.out.println(obliczObwod(boki));
            System.out.println("Nie da sie policzyc pola tylko z bokow ");
            Szesciokat szesciokat = new Szesciokat(boki);
            System.out.println(szesciokat.obliczPole());
        }
    }
}