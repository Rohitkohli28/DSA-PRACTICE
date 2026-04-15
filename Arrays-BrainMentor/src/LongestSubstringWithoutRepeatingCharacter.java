import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithoutRepeatingCharacter {

    public int lengthOfLongestSubstring(String s) {
        int left = 0;
        int max = 0;
        Set<Character> set = new HashSet<>();
        for (int right = 0; right < s.length(); right++) {

            while (set.contains(s.charAt(right))) {
                set.remove(s.charAt(left));
                left++;
            }
            set.add(s.charAt(right));
            max = Math.max(max, right - left + 1);
        }
        return max;
    }

    public static void main(String[] args) {
        LongestSubstringWithoutRepeatingCharacter solution = new LongestSubstringWithoutRepeatingCharacter();
        String s = "abcabcbb";
        System.out.println(solution.lengthOfLongestSubstring(s)); // Output: 3
    }
}
