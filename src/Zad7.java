// Return an array that contains exactly the same numbers as the given array, but rearranged so
// that every 4 is immediately followed by a 5. Do not move the 4's, but every other number may move.
// The array contains the same number of 4's and 5's, and every 4 has a number after it that is not a 4.
// In this version, 5's may appear anywhere in the original array.

import java.util.Arrays;

public class Zad7 {

    public static void main(String[] args) {

        int[] badana = {1,5,4,2,5,4,3,6,5,4,7,8,9,1,5,4,9,0,1};

        int[] wynik = fix45table(badana);

        System.out.println(Arrays.toString(wynik));

    }


    public static int[] fix45table(int[] nums) {
        int i = 0;
        int j = 0;
        while (j < nums.length) {
            if (nums[j] == 4 && nums[j+1] != 5) {
                while (nums[i] != 5 || nums[i+1] != 4) {
                    i++;
                }
                int temp = nums[j+1];
                nums[j+1] = nums[i];
                nums[i] = temp;
            }
            j++;
        }
        return nums;
    }
}

