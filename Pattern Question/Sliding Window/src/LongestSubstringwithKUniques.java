import java.util.HashMap;
import java.util.Map;

public class LongestSubstringwithKUniques {

    public static int longestSubstringWithKUnique(String s, int k) {
        int left = 0;
        int maxLength = 0;
        Map<Character, Integer> charCount = new HashMap<>();

        for (int right = 0; right < s.length(); right++) {
            char rightChar = s.charAt(right);
            charCount.put(rightChar, charCount.getOrDefault(rightChar, 0) + 1);

            while (charCount.size() > k) {
                char leftChar = s.charAt(left);
                charCount.put(leftChar, charCount.get(leftChar) - 1);
                if (charCount.get(leftChar) == 0) {
                    charCount.remove(leftChar);
                }
                left++;
            }
            maxLength = Math.max(maxLength, right - left + 1);
        }
        return maxLength;
    }

    public static void main(String[] args) {
        String s = "aabacbebebe";
        int k = 3;
        System.out.println(longestSubstringWithKUnique(s, k)); // Output: 7
    }
}
