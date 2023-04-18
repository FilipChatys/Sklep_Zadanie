// Return an array that contains the exact same numbers as the given array, but rearranged so that
// all the even numbers come before all the odd numbers. Other than that, the numbers can be in any
// order. You may modify and return the given array, or make a new array.

import java.util.Arrays;

public class Zad4 {


    public static void main(String[] args) {

        int[] tablica = {1,2,3,4,5,6,7,8,9,10};

        int[] wynik = sortujTablice(tablica);

        for(int element : tablica) {
            System.out.println(element);

        }

    }
    public static int[] sortujTablice(int[] tablica) {
        Arrays.sort(tablica); // Sortowanie całej tablicy
        int i = 0;
        int j = tablica.length - 1;
        while (i < j) {
            while (tablica[i] % 2 == 0 && i < j) {
                i++;
            }
            while (tablica[j] % 2 != 0 && i < j) {
                j--;
            }
            if (i < j) {
                int temp = tablica[i];
                tablica[i] = tablica[j];
                tablica[j] = temp;
                i++;
                j--;
            }
        }
        Arrays.sort(tablica, 0, i);
        Arrays.sort(tablica, i, tablica.length);
        return tablica;
    }
}
