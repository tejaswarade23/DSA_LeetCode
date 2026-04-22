import java.util.*;

class Solution {
    public boolean isGood(int[] nums) {
        int len = nums.length;

        // Minimum valid good array must be size 2
        if (len < 2) return false;

        Arrays.sort(nums);

        // Special case: [1,1]
        if (len == 2) {
            return nums[0] == 1 && nums[1] == 1;
        }

        int n = len - 1;

        // Check 1 to n-1
        for (int i = 0; i < n - 1; i++) {
            if (nums[i] != i + 1) {
                return false;
            }
        }

        // Check last two elements = n
        return nums[n - 1] == n && nums[n] == n;
    }
}