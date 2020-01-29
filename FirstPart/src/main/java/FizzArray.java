public class FizzArray {

    public static void main(String[] args) {
        System.out.println(fizzArray(2));
    }

    public static int[] fizzArray(int n) {
        int[] result = new int[n];
        for (int i =0; i < n; i++) {
            result[i] = i;
        }
        return result;
    }
}
