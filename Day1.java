public class Day1 {
    public static int sort012(int[] arr) {
        int low = 0, mid = 0, high = arr.length - 1;

        while (mid <= high) {
            switch (arr[mid]) {
                case 0:
                    swap(arr, low, mid);
                    low++;
                    mid++;
                    break;
                case 1:
                    mid++;
                    break;
                case 2:
                    swap(arr, mid, high);
                    high--;
                    break;
            }
        }
        return 0;
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 0, 1, 0, 2, 2, 2, 2, 2};
        int[] arr2 = {0, 0, 0, 0, 0, 0, 0, 0, 0};
        int[] arr3 = {1, 1, 1, 1,1, 1, 1, 1, 1,1};
        int[] arr4 = {};
        sort012(arr1);
        sort012(arr2);
        sort012(arr3);
        sort012(arr4);
        System.out.println("Sorted arr1: " + java.util.Arrays.toString(arr1));
        System.out.println("Sorted arr2: " + java.util.Arrays.toString(arr2));
        System.out.println("Sorted arr3: " + java.util.Arrays.toString(arr3));
        System.out.println("Sorted arr4: " + java.util.Arrays.toString(arr4));
        // Additional test cases can be added here
    }
}