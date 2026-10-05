class Solution {

    public boolean ispossible(int[] arr, int cap, int days) {
        int d = 1;
        int load = 0;
        for (int i = 0; i < arr.length; i++) {
            if (load + arr[i] <= cap) {
                load += arr[i];
            } else {
                load = arr[i];
                d++;
            }
        }

        if (d <= days) {
            return true;
        } else {
            return false;
        }
    }

    public int shipWithinDays(int[] arr, int days) {
        int n = arr.length;
        int mx = Integer.MIN_VALUE;
        int sum = 0;
        int ans = mx;
        for (int ele : arr) {
            sum += ele;
            mx = Math.max(ele, mx);
        }

        int low = mx;
        int high = sum;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (ispossible(arr, mid, days)) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return ans;

    }
}