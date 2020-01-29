public class WitoutEnd {

    public static void main(String[] args) {
        System.out.println(withouEnd2("abc"));
        System.out.println(withouEnd2("bc"));
        System.out.println(withouEnd2("abcd"));
        System.out.println(withouEnd2("a"));
    }

    public static String withouEnd2(String str) {
        if (str.length() < 2) return "";
        return str.subSequence(1, str.length() - 1).toString();
    }
}
