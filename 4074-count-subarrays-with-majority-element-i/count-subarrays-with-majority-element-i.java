class Solution {
    public int countMajoritySubarrays(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int currSum=0, leftPts=0, result=0;
        map.put(0, 1);

        for(int i=0;i<nums.length;i++){
            if(nums[i]==target){
                leftPts+=map.getOrDefault(currSum, 0);
                currSum+=1;
            }else{
                currSum-=1;
                leftPts-=map.getOrDefault(currSum, 0);
            }
            map.put(currSum, map.getOrDefault(currSum, 0) + 1);
            result+=leftPts;
        }
        return result;
    }
}