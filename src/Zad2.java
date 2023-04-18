// Return the sum of the numbers in the array, returning 0 for an empty array. Except the number 13 is
// very unlucky, so it does not count and numbers that come immediately after a 13 also do not count.

public class Zad2 {

public static int countSum (int[] tab){

    int i ;
    int sum = 0;

    for(i = 0; i< tab.length; i++){
        if(tab[i] == 13){
            tab[i] = 0;
        }
        if(tab == null){
            return 0;
        }
        sum = sum + tab[i];
    }
return sum;
}

    public static void main(String[] args) {

        int[] x = {1, 2, 3, 4, 5, 6, 8, 9, 13};

        int[] x2 = {};

        int wynik1 = countSum(x);
        int wynik2 = countSum(x2);

        System.out.println(wynik1);

        System.out.println(wynik2);

    }

}
