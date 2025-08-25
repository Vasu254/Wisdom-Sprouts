import java.util.*;
public class Day11 {
    public static String permutationsString(String s) {
        if (s == null || s.length() == 0) return "";
        List<String> result = new ArrayList<>();
        boolean[] used = new boolean[s.length()];
        StringBuilder current = new StringBuilder();
        char[] chars = s.toCharArray();
        Arrays.sort(chars); // Sort to handle duplicates
        backtrack(chars, used, current, result);
        return String.join(",", result);
    }
    private static void backtrack(char[] chars, boolean[] used, StringBuilder current, List<String> result) {
        if (current.length() == chars.length) {
            result.add(current.toString());
            return;
        }
        for (int i = 0; i < chars.length; i++) {
            if (used[i]) continue;
            if (i > 0 && chars[i] == chars[i - 1] && !used[i - 1]) continue; // Skip duplicates
            used[i] = true;
            current.append(chars[i]);
            backtrack(chars, used, current, result);
            current.deleteCharAt(current.length() - 1);
            used[i] = false;
        }
    }
    public static void main(String[] args) {
        String s1 = "abc";
        String s2 = "aab";
        System.out.println(permutationsString(s1)); // "abc,acb,bac,bca,cab,cba"
        System.out.println(permutationsString(s2)); // "aab,aba,baa"
    }
}
