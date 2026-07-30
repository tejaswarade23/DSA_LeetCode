class Solution {
    public String minWindow(String s, String t) {
        
        Map<Character, Integer> targetMap = new HashMap<>();

        for(char c : t.toCharArray()){
            targetMap.put(c, targetMap.getOrDefault(c,0) + 1);
        }

        int minLen = Integer.MAX_VALUE;
        int left = 0;
        
        Map<Character, Integer> windowMap = new HashMap<>();
        int formed = 0;
        int required = targetMap.size();
        int minStart = 0;

        for(int right = 0; right < s.length(); right++){
            char c = s.charAt(right);

            windowMap.put(c, windowMap.getOrDefault(c,0) + 1);

            if(targetMap.containsKey(c) && windowMap.get(c).intValue() == targetMap.get(c).intValue()){
                formed++;
            }

            while(formed == required && left <= right){
                if(right - left + 1 < minLen){
                    minLen = right - left + 1;
                    minStart = left;
                }

                char leftChar = s.charAt(left); 
                windowMap.put(leftChar, windowMap.get(leftChar) - 1);

                if(targetMap.containsKey(leftChar) && windowMap.get(leftChar) < targetMap.get(leftChar)){
                    formed--;
                }
                left++;
            }
        }
         if(minLen == Integer.MAX_VALUE){
            return"";
         }else{
            return s.substring(minStart, minStart + minLen);
         }
    }
}