import java.util.*;
public class Day3 {
    public static int findDuplicateNumber(int[] arr) {
        Set<Integer> seen = new HashSet<>();
        for (int num : arr) {
            if (seen.contains(num)) {
                return num;
            }
            seen.add(num);
        }
        return -1; 
    }
        public static void main(String[] args) {
        int[][] testCases = {
            {1, 2, 3, 3, 3},        // duplicate = 3
            {2, 3, 6, 6, 6},        // duplicate = 6
            {1, 2, 3, 3},           // duplicate = 3
            {1, 1},                 // duplicate = 1
            {1, 2, 3, 4, 5, 6, 7}   // no duplicate → -1
        };

        for (int i = 0; i < testCases.length; i++) {
            System.out.println("Test Case " + (i + 1) + " Output: " + findDuplicateNumber(testCases[i]));
        }
    }
}
