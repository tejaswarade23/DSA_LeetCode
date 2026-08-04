class Solution {
    public int subarraySum(int[] nums, int k) {
         int count = 0;
         int prefixSum = 0;

         HashMap<Integer, Integer> prefixCount = new HashMap<>();
         prefixCount.put(0, 1);

         for(int i = 0; i < nums.length; i++){
            prefixSum += nums[i];

            count += prefixCount.getOrDefault(prefixSum - k, 0);
            prefixCount.put(prefixSum, prefixCount.getOrDefault(prefixSum, 0) + 1);
         }
         return count;
    }
}