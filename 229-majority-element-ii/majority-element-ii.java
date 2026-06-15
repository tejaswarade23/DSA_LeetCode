class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n = nums.length;
        int threshold = n/3;
        List<Integer> result = new ArrayList<> ();

        Arrays.sort(nums);

        int i = 0;
        while(i < n){
            int current = nums[i];
            int count = 0;

            while (i < n && nums[i] == current){
                count++;
                i++;
            }
            if(count > threshold){
                result.add(current);
            }
        }
        return result;
    }
}