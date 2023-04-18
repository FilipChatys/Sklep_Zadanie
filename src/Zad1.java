
public class Zad1 {

    public static int countEven(int[] n) {
        int counter = 0;
        int i;
        for (i = 0; i < n.length; i++) {
            if (i % 2 == 0) {
                counter = counter + 1;
            }
        }
        return counter;
    }

    public static void main(String[] args) {

        int[] x = {1, 2, 3, 4, 5, 6, 8, 69};

        int cyfra = countEven(x);

        System.out.println(cyfra);

    }

}
