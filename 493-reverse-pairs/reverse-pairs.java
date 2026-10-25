class Solution {

    static int count = 0;

    public static void inversion(int[] a, int[] b) {
        int i = 0;
        int j = 0;
        while (i < a.length && j < b.length) {
            if ((long) a[i] > (long) 2 * b[j]) {
                count += a.length - i;
                j++;
            } else
                i++;
        }
    }

    public static void merge(int[] a, int[] b, int[] arr) {
        int i = 0, j = 0, k = 0;
        while (i < a.length && j < b.length) {
            if (a[i] <= b[j]) {
                arr[k] = a[i];
                i++;
                k++;
            } else {
                arr[k] = b[j];
                j++;
                k++;
            }

        }

        if (i == a.length) {
            while (j < b.length) {
                arr[k++] = b[j++];
            }
        }
        if (j == b.length) {
            while (i < a.length) {
                arr[k++] = a[i++];
            }
        }
    }

    public static void mergesort(int[] arr) {
        int n = arr.length;
        if (n == 1)
            return;
        int mid = n / 2;
        int[] a = new int[mid];
        int[] b = new int[n - mid];
        for (int i = 0; i < mid; i++) {
            a[i] = arr[i];
        }

        for (int i = 0; i < n - mid; i++) {
            b[i] = arr[i + mid];
        }

        mergesort(a);
        mergesort(b);

        inversion(a, b);
        merge(a, b, arr);
        a = null;
        b = null;
    }

    public int reversePairs(int[] arr) {
        count = 0;
        mergesort(arr);
        return count;
    }
}