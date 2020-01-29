public class MissingChar {

    public static void main(String[] args) {
        System.out.println(missingChar("kitten", 4));
    }

    public static String missingChar(String str, int n) {
        String newStr = "";
        for (int i = 0; i < str.length(); i++) {
            if (i == n) continue;

            newStr = newStr + str.charAt(i);
        }
        return newStr;
    }

}
