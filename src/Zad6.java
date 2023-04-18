// Given n>=0, create an array length n*n with the following pattern, shown here for n=3 :
// {0, 0, 1,    0, 2, 1,    3, 2, 1} (spaces added to show the 3 groups).
//squareUp(3) → [0, 0, 1, 0, 2, 1, 3, 2, 1]
//squareUp(2) → [0, 1, 2, 1]

public class Zad6 {

    public static void main(String[] args) {

        int[] wynik = squareUp(3);

        for (int element : wynik){
            System.out.println(element);
        }

    }

    public static int[] squareUp(int n) {

        int[] result = new int[n * n];

        for (int i = 1; i <= n; i++) {
            for (int j = n; j > 0; j--) {
                if (j <= i) {
                    result[(i - 1) * n + (n - j)] = j;
                } else {
                    result[(i - 1) * n + (n - j)] = 0;
                }
            }
        }
        return result;
    }
}
