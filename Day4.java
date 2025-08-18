public class Day4 {
    public static void merge(int[] arr1, int[] arr2) {
        int m = arr1.length;
        int n = arr2.length;
        int gap = (m + n + 1) / 2;  // initial gap
        while (gap > 0) {
            int i = 0;
            int j = gap;
            while (j < m + n) {
                int first, second;
                // pick values depending on position
                if (i < m) first = arr1[i];
                else first = arr2[i - m];
                if (j < m) second = arr1[j];
                else second = arr2[j - m];
                // swap if out of order
                if (first > second) {
                    if (i < m && j < m) {
                        int temp = arr1[i];
                        arr1[i] = arr1[j];
                        arr1[j] = temp;
                    } else if (i < m && j >= m) {
                        int temp = arr1[i];
                        arr1[i] = arr2[j - m];
                        arr2[j - m] = temp;
                    } else {
                        int temp = arr2[i - m];
                        arr2[i - m] = arr2[j - m];
                        arr2[j - m] = temp;
                    }
                }
                i++;
                j++;
            }
            // shrink the gap
            if (gap == 1) break;
            gap = (gap + 1) / 2;
        }
    }
    public static void main(String[] args) {
        int[] arr1 = {1, 3, 5, 7};
        int[] arr2 = {2, 4, 6, 8};

        merge(arr1, arr2);

        System.out.print("arr1 = ");
        for (int x : arr1) System.out.print(x + " ");
        System.out.println();

        System.out.print("arr2 = ");
        for (int x : arr2) System.out.print(x + " ");
    }
}
