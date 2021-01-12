package Java.Amazon;

//1108. Defanging an IP Address
// EASY

public class DefangingAnIPAddress {
    public static void main(String[] args) {

        String address ="1.1.1.1";
        System.out.println(defangIPaddr(address));
        System.out.println(defangIPaddrII(address));

    }

    private static String defangIPaddrII(String address) {

        return address.replace(".", "[.]");
    }

    private static String defangIPaddr(String address) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < address.length(); i++) {
            if(address.charAt(i)=='.'){
                stringBuilder.append("[.]");
            }
            else {
                stringBuilder.append(address.charAt(i));
            }
        }
        return stringBuilder.toString();
    }
}
