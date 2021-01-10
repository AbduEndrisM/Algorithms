package Java.Amazon;

//1119. Remove Vowels from a String
//        Easy

public class RemoveVowelsFromString {

    public static void main(String[] args) {
        String string = "abdu";
        String result = removeVowelsFromString(string);

        System.out.println(result);
    }

    private static String removeVowelsFromString(String string) {

        StringBuilder stringBuilder = new StringBuilder();
        String s = ""; // OPTION TWO
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) != 'a' && string.charAt(i) != 'e' && string.charAt(i) != 'i' &&
                    string.charAt(i) != 'o' && string.charAt(i) != 'u') {
                stringBuilder.append(string.charAt(i));

                s = s + string.charAt(i);
            }
        }
//        return stringBuilder.toString();
        return s;
    }
}
