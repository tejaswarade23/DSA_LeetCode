class Solution {
    public int removeDuplicates(int[] nums) {

        if(nums.length == 0)
           return 0;

        int insertpos = 1;
        for(int i = 1; i < nums.length; i++){
            if(nums[i] != nums[insertpos - 1]){
               nums[insertpos] = nums[i];
                insertpos++;
            }
        }  
        return insertpos;
        
    }
}