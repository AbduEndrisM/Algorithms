package Java.Amazon;

//1119. Remove Vowels from a String
//        Easy

public class RemoveVowelsFromString {

    public static void main(String[] args) {
        String string = "abdu";
        String result = removeVowelsFromStringIII(string);

        System.out.println(result);
    }

    private static String removeVowelsFromString(String string) {

        String s = "";
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) != 'a' && string.charAt(i) != 'e' && string.charAt(i) != 'i' &&
                    string.charAt(i) != 'o' && string.charAt(i) != 'u') {

                s = s + string.charAt(i);
            }
        }
        return s;
    }


    private static String removeVowelsFromStringII(String string) {

        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < string.length(); i++) {

            if (string.charAt(i) != 'a' && string.charAt(i) != 'e' && string.charAt(i) != 'i' &&
                    string.charAt(i) != 'o' && string.charAt(i) != 'u') {
                stringBuilder.append(string.charAt(i));

            }
        }
        return stringBuilder.toString();
    }

    private static String removeVowelsFromStringIII(String string) {

        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < string.length(); i++) {
            char ch = string.charAt(i);
            if (ch != 'a' && ch != 'e' && ch != 'i' && ch != 'o' && ch != 'u') {
                stringBuilder.append(ch);
            }
        }
        return stringBuilder.toString();
    }
}
