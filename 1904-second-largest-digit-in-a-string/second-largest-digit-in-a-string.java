class Solution {
    public int secondHighest(String s) {
        int first = -1, second = -1;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            // check if it's a digit
            if (Character.isDigit(ch)) {
                int num = ch - '0';

                if (num > first) {
                    second = first;
                    first = num;
                } else if (num > second && num != first) {
                    second = num;
                }
            }
        }
        return second;
    }
}