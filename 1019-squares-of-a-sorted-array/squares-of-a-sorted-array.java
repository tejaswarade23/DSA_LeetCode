class Solution {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        int left = 0;
        int right = n - 1;

        for(int pos = n - 1; pos >= 0; pos--){
            int leftSq = nums[left] * nums[left];
            int rightSq = nums[right] * nums[right];

            if(leftSq > rightSq){
                result[pos] = leftSq;
                left++;
            }
            else{
                result[pos] = rightSq;
                right--;
            }

        }
        return result;
    }
}