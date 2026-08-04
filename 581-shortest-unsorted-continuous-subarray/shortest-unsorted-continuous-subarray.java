class Solution {
    public int findUnsortedSubarray(int[] nums) {
        int [] sorted = nums.clone();
        Arrays.sort(sorted);

        int left = nums.length;
        int right = 0;

        for(int i = 0; i < nums.length; i++){

            if(nums[i] != sorted[i]){
                left = Math.min(left, i);
                right = Math.max(right, i);
            }
        }
        return right > left ? right - left + 1 : 0;
    }
}