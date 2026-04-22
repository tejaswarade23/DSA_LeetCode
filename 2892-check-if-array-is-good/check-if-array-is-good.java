import java.util.*;

class Solution {
    public boolean isGood(int[] nums) {
        int len = nums.length;
        if (len < 2) return false;

        Arrays.sort(nums);
        if (len == 2) {
            return nums[0] == 1 && nums[1] == 1;
        }

        int n = len - 1;

        for (int i = 0; i < n - 1; i++) {
            if (nums[i] != i + 1) {
                return false;
            }
        }
        return nums[n - 1] == n && nums[n] == n;
    }
}