public class StringTimes {

    public static void main(String[] args) {
        System.out.println(stringTimes("asd", 2));
    }

    public static String stringTimes(String str, int n) {
        String result = "";
        for (int i =0; i < n; i++) {
            result = result + str;
        }
        return result;
    }

}
