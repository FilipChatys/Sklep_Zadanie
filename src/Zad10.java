// Given an array of ints, return the number of times that two 6's are next to
// each other in the array. Also count instances where the second "6" is actually a 7.


import static java.lang.String.valueOf;

public class Zad10 {

    public static void main(String[] args) {

int[] tablica = {1,2,3,4,5,6,6,8,6,7,9,6,6,6,7};

int[] wynik = array667(tablica);

        System.out.println("Zliczenia 66" + " " + wynik[0]);
        System.out.println("Zliczenia 67" + " " + wynik[1]);

        }




    public static int[] array667(int[] tab) {

        int licznikSzostek= 0;
        int licznikSiodemek= 0;

        for(int i = 0; i< tab.length;i++){
            if(tab[i]==6 && tab[i+1] == 6){

               licznikSzostek ++;

            } else if (tab[i]==6 && tab[i+1] == 7){

                licznikSiodemek ++;

            }
        }

        int[] dane = new int[2];


        dane[0] = licznikSzostek;
        dane[1] = licznikSiodemek;

        return dane;

    }
}





