class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        Map<Integer, Integer> remainderCount = new HashMap<>();
        remainderCount.put(0, 1);

        int prefixSum = 0;
        int count = 0;

        for(int i = 0; i < nums.length; i++){
            prefixSum += nums[i];
            int remainder = ((prefixSum % k) + k) % k;

            count += remainderCount.getOrDefault(remainder, 0);
            remainderCount.put(remainder, remainderCount.getOrDefault(remainder, 0) + 1);
        }
        return count;
    }
}