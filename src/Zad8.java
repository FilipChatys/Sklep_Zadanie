// Given three ints, a b c, return true if one of b or c is "close" (differing from a by at most 1),
// while the other is "far", differing from both other values by 2 or more. Note: Math.abs(num) computes
// the absolute value of a number.

import static java.lang.Math.abs;

public class Zad8 {

    public static void main(String[] args) {

boolean x = closeFar(4,1,3);

        System.out.println(x);

    }

    // przykład działania :  1,2,3 false
    //                       4,1,3 true
    //                       a,b,c

    public static boolean closeFar(int a, int b, int c) {

        boolean wynik = true;

        if ((Math.abs(a - b) == 1 && Math.abs(a - c) >= 2 && Math.abs(b-c) >=2) || (Math.abs(a-c) == 1 && Math.abs(a-b) >= 2 && Math.abs(b-c) >= 2)) {

                wynik = true;

            } else {
               // if (Math.abs(a-b) == 1 && Math.abs(a-c) == 2 || Math.abs(a-c) == 1 && Math.abs(a-b) == 2){
                        wynik = false;
                    }
        return wynik;
                }
    }

