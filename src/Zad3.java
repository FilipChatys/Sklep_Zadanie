// Given an array of ints, return true if the array contains no 1's and no 3's.

public class Zad3 {

    public static boolean noOnesOrThrees (int[] tab){
        int i;
        for (i=0;i< tab.length;i++){
            if(tab[i] == 1 || tab[i] == 3){
                return false;
            }
        }
return true;
    }

    public static void main(String[] args) {

        int[] x = {1, 2, 3, 4, 5, 6, 8, 9, 13};

        int[] x2 = {2,4,5,6,7};

        boolean wynik = noOnesOrThrees(x);

        boolean wynik2 = noOnesOrThrees(x2);

        System.out.println(wynik);
        System.out.println(wynik2);
    }

}
