package Java.Amazon;

// #1
//https://leetcode.com/explore/interview/card/amazon/76/array-and-strings/508/

// You may assume that each input would have exactly one solution, and you may not use the same element twice.
// Since there is no duplication, we can use list.
// If their was a duplication, and we could use set.

import java.util.*;

public class TwoSum {
    public static void main(String[] args) {

        int[] nums = new int[]{2, 7, 11, 15};
        int target = 18;

        int[] answer = twoSum(nums, target);
        Arrays.stream(answer).forEach(System.out::println);

    }

    private static int[] twoSum(int[] nums, int target) {

        Map<Integer, Integer> map = new HashMap<>();
        int[] response = new int[2];

        for (int i = 0; i < nums.length; i++) {
            int ans = target - nums[i];
            if (map.containsKey(ans)) {
                response[0] = i;
                response[1] = map.get(ans);
            }
            map.put(nums[i], i);
        }
        return response;
    }

}
