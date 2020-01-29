public class CountEvens {

    public static void main(String[] args) {
        System.out.println(countEvens(new int[]{1, 2 ,3}));
    }

    public static int countEvens(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) count++;
        }
        return count;
    }
}
