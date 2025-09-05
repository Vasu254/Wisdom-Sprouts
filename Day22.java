import java.util.*;

public class Day22 {
    public static int FirstEleKTimes(int[] arr, int k) {
        Map<Integer, Integer> countMap = new HashMap<>();
        for (int num : arr) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }
        for (int num : arr) {
            if (countMap.get(num) == k) {
                return num;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr1 = {3, 1, 4, 4, 5, 2, 6, 1, 4};
        int k1 = 2;
        System.out.println("Input: " + Arrays.toString(arr1) + ", k = " + k1);
        System.out.println("Output: " + FirstEleKTimes(arr1, k1));
        System.out.println();
    }
}