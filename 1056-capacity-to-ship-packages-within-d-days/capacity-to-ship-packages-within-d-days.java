class Solution {

    public boolean ispossible(int cap, int[] arr, int d) {
        int n = arr.length;
        int load = 0;
        int days = 1;
        for (int i = 0; i < n; i++) {
            if (load + arr[i] <= cap) {
                load += arr[i];
            } else {
                load = arr[i];
                days++;
            }
        }

        if (days > d) {
            return false;
        } else {
            return true;
        }
    }

    public int shipWithinDays(int[] arr, int days) {
        int mx = Integer.MIN_VALUE;
        int ans = 1;
        int sum = 0;
        int n = arr.length;
        for (int ele : arr) {
            sum += ele;
            mx = Math.max(ele, mx);
        }

        int low = mx;
        int high = sum;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (ispossible(mid, arr, days)) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return ans;
    }
}