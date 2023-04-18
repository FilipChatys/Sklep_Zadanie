// Given 3 int values, a b c, return their sum. However, if one of the values is 13
// then it does not count towards the sum and values to its right do not count. So
// for example, if b is 13, then both b and c do not count.


public class Zad9 {

    public static void main(String[] args) {

int x = luckySum(13,2,1);

        System.out.println(x);

    }

    public static int luckySum(int a, int b, int c) {

    int sum = 0;

    if(a == 13) {
        a=0;
        b = 0;
        c = 0;
    }else {
        if (b==13) {
            b=0;
            c = 0;
        }else {
            if (c==13){
                c=0;
            }
        }
    }

    sum = sum + a + b + c;

return sum;
    }



}
