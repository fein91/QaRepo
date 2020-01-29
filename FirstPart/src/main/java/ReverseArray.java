import java.util.Arrays;

public class ReverseArray {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(reverse3(new int[]{1, 2, 3})));
    }

    public static int[] reverse3(int[] nums) {
        int[] result = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            result[i] = nums[nums.length - i - 1];
        }
     return result;
    }
}
