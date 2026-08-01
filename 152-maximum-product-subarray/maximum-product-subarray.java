class Solution {
    public int maxProduct(int[] nums) {
        int maxEnding = nums[0];
        int minEnding = nums[0];
        int ans = nums[0];

        for(int i = 1; i < nums.length; i++){
             int tempMax = Math.max(nums[i], Math.max(maxEnding * nums[i], minEnding * nums[i]));
             int tempMin = Math.min(nums[i], Math.min(maxEnding * nums[i], minEnding * nums[i]));

             maxEnding = tempMax;
             minEnding = tempMin;

             ans = Math.max(ans, maxEnding) ;
        }
        return ans;
    }
}