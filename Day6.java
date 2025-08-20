import java.util.*;

public class Day6 {
    public static List<int[]> FindallSubarrayswithZeroSum(int[] arr) {
        Map<Integer, List<Integer>> prefixSumMap = new HashMap<>();
        List<int[]> result = new ArrayList<>();

        int prefixSum = 0;

        for (int i = 0; i < arr.length; i++) {
            prefixSum += arr[i];
            if (prefixSum == 0) {
                result.add(new int[]{0, i});
            }
            if (prefixSumMap.containsKey(prefixSum)) {
                List<Integer> list = prefixSumMap.get(prefixSum);
                for (int startIndex : list) {
                    result.add(new int[]{startIndex + 1, i});
                }
            }
            if (!prefixSumMap.containsKey(prefixSum)) {
                prefixSumMap.put(prefixSum, new ArrayList<>());
            }
            prefixSumMap.get(prefixSum).add(i);
        }
        return result; 
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, -3, 3, -1, 2};
        int[] arr2 = {4, -1, -3, 1, 2, -1};
        int[] arr3 = {0, 0, 0};
        int[] arr4 = {-3, 1, 2, -3, 4, 0};      

        printResult(arr1);
        printResult(arr2);
        printResult(arr3);
        printResult(arr4);
    }

    // Helper method to print the result
    private static void printResult(int[] arr) {
        List<int[]> subarrays = FindallSubarrayswithZeroSum(arr);
        System.out.print("Input: " + Arrays.toString(arr) + "\nOutput: ");
        for (int[] range : subarrays) {
            System.out.print("(" + range[0] + ", " + range[1] + ") ");
        }
        System.out.println("\n");
    }
}
