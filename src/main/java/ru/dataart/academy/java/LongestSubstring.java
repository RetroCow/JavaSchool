package ru.dataart.academy.java;

public class LongestSubstring {
    /**
     * @param checkString - input string to check
     * @return - length of max substring without repeatable characters
     * Example: dnmdncbb  -> 5 (mdncb)
     * amam -> 2 (am)
     */

    public int getLengthOfLongestSubstring(String checkString) {
        int maxLength = 0;
        StringBuilder str = new StringBuilder();
        String substr;
        for (int i = 0; i < checkString.length(); i++) {
            substr = checkString.substring(i);

            int length = 0;
            for (char ch : substr.toCharArray()) {
                if (str.toString().contains(String.valueOf(ch))) {
                    str = new StringBuilder();
                    break;
                }
                str.append(ch);
                length++;
                maxLength = Math.max(length, maxLength);
            }
        }

        return maxLength;
    }
}
