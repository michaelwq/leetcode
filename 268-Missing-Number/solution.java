public class Solution {
    public int missingNumber(int[] nums) {
        int sum = 0, n = nums.length;
        for (int a : nums) {
            sum += a;
        }
        return (int)(0.5 * n * (n + 1) - sum);

    }
}