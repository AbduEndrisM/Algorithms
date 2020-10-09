package Java.Amazon;

import java.util.Arrays;

//#937
//https://leetcode.com/problems/reorder-data-in-log-files/
public class ReorderDataInLogFiles {
    public static void main(String[] args) {

        String[] logs = new String[]{"dig1 8 1 5 1","let1 art can","dig2 3 6","let2 own kit dig","let3 art zero"};

        String[] answer = reorderLogFiles(logs);

        Arrays.stream(answer).forEach(System.out::println);
    }


    public static String[] reorderLogFiles(String[] logs) {

        int digits = logs.length-1;
        int letters = 0;
        String[] newString = new String[logs.length];
        for (int i = 0; i < logs.length; i++) {
            String[] string = logs[i].split(" ", 2);
            if (Character.isDigit(string[1].charAt(0))){
                newString[digits]= logs[i];
                digits--;
            }
            else {
                newString[letters]=logs[i];
                letters++;
            }
        }
        return newString;
    }
}
