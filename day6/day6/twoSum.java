public class twoSum {

    public static int[] twoSum1(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length-1; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{0, 0};
    }

    public static void main(String[] args) {
        int[] nums = {10, 13, -1, 8, 1};
        int target = 9;

        int[] result = twoSum1(nums, target);

        System.out.println(result[0] + " " + result[1]);
    }
}