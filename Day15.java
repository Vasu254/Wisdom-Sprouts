import java.util.*;
public class Day15 {
    public int LongestSubstringWithoutRepeating(String s) {
        int maxLength = 0;
        int start = 0;
        Map<Character, Integer> charIndexMap = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);
            if (charIndexMap.containsKey(currentChar) && charIndexMap.get(currentChar) >= start) {
                start = charIndexMap.get(currentChar) + 1;
            }
            charIndexMap.put(currentChar, i);
            maxLength = Math.max(maxLength, i - start + 1);
        }
        return maxLength;
    }
    public static void main(String[] args) {
        Day15 day15 = new Day15();
        String input = "abcabcbb";
        int result = day15.LongestSubstringWithoutRepeating(input);
        System.out.println("length:" + result);
    }
}
