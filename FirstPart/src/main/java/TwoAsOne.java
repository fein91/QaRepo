public class TwoAsOne {

    public static void main(String[] args) {
        System.out.println(twoAsOne(1, 2, 3));
    }

    public static boolean twoAsOne(int a, int b, int c) {
        if (a + b == c) return true;
        if (a + c == b) return true;
        if (b + c == a) return true;
        return false;
    }
}
