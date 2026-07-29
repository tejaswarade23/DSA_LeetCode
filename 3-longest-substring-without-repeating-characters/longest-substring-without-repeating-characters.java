class Solution {
    public int lengthOfLongestSubstring(String s) {
        
        HashSet<Character> window = new HashSet<>();
        int n = s.length();
        int left = 0;
        int maxLen = 0;

        for(int right = 0; right < n; right++){

            while(window.contains(s.charAt(right))){
                window.remove(s.charAt(left));
                left++;
            }
             window.add(s.charAt(right));
             maxLen = Math.max(maxLen, right - left + 1);
        }
        return maxLen;
    }
}