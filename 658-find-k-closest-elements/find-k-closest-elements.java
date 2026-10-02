class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        int n = arr.length;
        List<Integer> ans = new ArrayList<>();
        if (x < arr[0]) {
            for (int i = 0; i < k; i++) {
                ans.add(arr[i]);
            }
            return ans;
        } else if (x > arr[n - 1]) {
            for (int i = n - 1; i >= n - k; i--) {
                ans.add(arr[i]);
            }
            Collections.sort(ans);
            return ans;
        } else {
            int lb = n;
            int low = 0;
            int high = n - 1;
            while (low <= high) {
                int mid = low + (high - low) / 2;
                if (arr[mid] >= x) {
                    lb = Math.min(lb, mid);
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }

            }

            int i = lb - 1;
            int j = lb;
            while (k > 0 && i >= 0 && j < n) {
                int di = Math.abs(x - arr[i]);
                int dj = Math.abs(x - arr[j]);
                if (di <= dj) {
                    ans.add(arr[i]);
                    i--;
                } else {
                    ans.add(arr[j]);
                    j++;
                }
                k--;
            }
            while (k > 0 && i >= 0) {
                ans.add(arr[i--]);
                k--;
            }
            while (k > 0 && j < n) {
                ans.add(arr[j++]);
                k--;
            }
            Collections.sort(ans);
            return ans;
        }
    }
}