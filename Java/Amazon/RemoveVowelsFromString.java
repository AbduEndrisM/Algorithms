package Java.Amazon;

//1119. Remove Vowels from a String
//        Easy

public class RemoveVowelsFromString {

    public static void main(String[] args) {
        String string = "abdu";
        System.out.println("String " + removeVowelsFromString(string));
        System.out.println("StringBuilder " + removeVowelsFromStringII(string));
        System.out.println("RegEx " + removeVowelsFromStringB(string));
        System.out.println("CharArray " + removeVowelsFromStringC(string));

    }

    private static String removeVowelsFromStringC(String string) {
        char[] chars = new char[string.length()];

        int index = 0;
        for (char c :
                string.toCharArray()) {
            if (c != 'a' && c != 'e' && c != 'i' && c != 'o' && c != 'u')
                chars[index++] = c;
        }
        return new String(chars, 0, index);
    }

    private static String removeVowelsFromStringB(String string) {

        return string.replaceAll("[a,e,i,o,u]", "");
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
            char ch = string.charAt(i);
            if (ch != 'a' && ch != 'e' && ch != 'i' && ch != 'o' && ch != 'u') {
                stringBuilder.append(ch);
            }
        }
        return stringBuilder.toString();
    }
}
