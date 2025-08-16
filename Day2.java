public class Day2 {
    public static int findMissing(int[] arr) {
        int n = arr.length + 1;
        int expectedSum = n * (n + 1) / 2;
        int actualSum = 0;
        for (int num : arr) {
            actualSum += num;
        }
        return expectedSum - actualSum;
    }

    public static void main(String[] args) {
        int[][] testCases = {
            {1, 2, 4, 5},
            {2, 3, 4, 5},
            {1, 2, 3, 4},
            {1},
            java.util.stream.IntStream.rangeClosed(1, 999999).toArray()
        };

        for (int i = 0; i < testCases.length; i++) {
            System.out.println("Test Case " + (i + 1) + " Output: " + findMissing(testCases[i]));
        }
    }
}
