import java.util.*;
public class Day14 {

    public static int CountSubstringsWithExactlyKDistinctCharacters(String s, int k) {
        int n = s.length();
        int count = 0;

        for (int i = 0; i < n; i++) {
            HashMap<Character, Integer> charCount = new HashMap<>();
            int distinctCount = 0;

            for (int j = i; j < n; j++) {
                char currentChar = s.charAt(j);
                charCount.put(currentChar, charCount.getOrDefault(currentChar, 0) + 1);

                if (charCount.get(currentChar) == 1) {
                    distinctCount++;
                }

                if (distinctCount == k) {
                    count++;
                } else if (distinctCount > k) {
                    break;
                }
            }
        }
        return count;
    }
    public static void main(String[] args) {
        String s = "pqpqs";
        int k = 2;
        System.out.println(CountSubstringsWithExactlyKDistinctCharacters(s, k));
    }
}