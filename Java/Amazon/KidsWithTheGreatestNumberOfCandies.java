package Java.Amazon;

//1431. Kids With the Greatest Number of Candies
// EASY

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class KidsWithTheGreatestNumberOfCandies {

    public static void main(String[] args) {

        int[] candies = new int[]{2,3,5,1,3};
        int extraCandies = 3;

        kidsWithCandies(candies, extraCandies).stream()
                .forEach(System.out::print);
        System.out.println();
        kidsWithCandiesII(candies, extraCandies).stream()
                .forEach(System.out::print);
    }

    private static List<Boolean> kidsWithCandiesII(int[] candies, int extraCandies) {
        int max = Arrays.stream(candies).max().getAsInt();
        List<Boolean>booleanList = new ArrayList<>();

        for (int i = 0; i < candies.length; i++) {
            if(candies[i]+extraCandies >= max){
                booleanList.add(Boolean.TRUE);
            }
            else {
                booleanList.add(Boolean.FALSE);
            }
        }
        return booleanList;
    }


    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies){

        List<Boolean>booleanList = new ArrayList<>();

        int large = candies[0];
            for (int i = 0; i < candies.length; i++) {
                if(candies[i]>large){
                    large=candies[i];
                }
            }
            for (int i = 0; i < candies.length; i++) {
                if (candies[i]+extraCandies >=large){
                    booleanList.add(Boolean.TRUE);
                }
                else {
                    booleanList.add(Boolean.FALSE);
                }
            }
        return booleanList;
    }
}
