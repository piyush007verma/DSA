
class Solution {

    int ans;

    public void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public int partition(int[] arr, int low, int high) {

        // Choose middle element as pivot
        int mid = low + (high - low) / 2;
        swap(arr, low, mid);

        int pivot = arr[low];

        int smallcount = 0;

        for (int i = low + 1; i <= high; i++) {
            if (arr[i] <= pivot)
                smallcount++;
        }

        int idx = low + smallcount;

        swap(arr, low, idx);

        int i = low;
        int j = high;

        while (i < idx && j > idx) {

            if (arr[i] <= pivot)
                i++;

            else if (arr[j] > pivot)
                j--;

            else {
                swap(arr, i, j);
                i++;
                j--;
            }
        }

        return idx;
    }

    public void quickselect(int[] arr, int low, int high, int k) {

        if (low > high)
            return;

        if (low == high) {
            ans = arr[low];
            return;
        }

        int idx = partition(arr, low, high);

        if (idx == k - 1) {
            ans = arr[idx];
            return;
        }

        if (k - 1 < idx)
            quickselect(arr, low, idx - 1, k);

        else
            quickselect(arr, idx + 1, high, k);
    }

    public int findKthLargest(int[] arr, int k) {

        ans = -1;

        quickselect(arr, 0, arr.length - 1, arr.length - k + 1);

        return ans;
    }
}
