package Java.Amazon;

//1480. Running Sum of 1d Array
//Easy -  Array

import java.util.Arrays;
import java.util.List;

public class RunningSumOf1dArray {
    public static void main(String[] args) {
        int[] nums = new int[]{1,2,3,4};
        Integer[] numsII = new Integer[]{1,2,3,4};

        System.out.print("[");

        Arrays.stream(runningSumOf1dArray(nums))
        .forEach(x-> System.out.print(x + ", "));
        System.out.println("]");


        System.out.println(Arrays.asList(runningSumOf1dArrayII(numsII)));

    }

    private static int[]  runningSumOf1dArray(int[] nums) {
        int[] result = new int[nums.length];
        int sum = 0;

        for (int i = 0; i < nums.length; i++) {
            sum = nums[i] + sum;
            result[i] = sum;
        }
        return result  ;
    }

    private static Integer[] runningSumOf1dArrayII(Integer[] nums) {
        Integer[] result = new Integer[nums.length];
        int sum = 0;

        for (int i = 0; i < nums.length; i++) {
         sum = nums[i] + sum;
         result[i] = sum;
        }
        return result;
    }
}
