class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        int n = arr.length;
        List<Integer> ans = new ArrayList<>();
        int low = 0;
        int high = n-1;
        int lb = n;
        while(low<=high)
        {
            int mid = low + (high - low)/2;
            if(arr[mid]>=x)
            {
                lb = Math.min(lb , mid);
                high = mid-1;
            }
            else
            {
                low = mid+1;
            }
        }
        int i = lb-1;
        int j = lb;
        while(k>0 && i>=0 && j<n)
        {
            int di = Math.abs(x-arr[i]);
            int dj = Math.abs(x-arr[j]);
            if(di<=dj)
            {
                ans.add(arr[i]);
                i--;
            }
            else
            {
                ans.add(arr[j]);
                j++;
            }
            k--;
        }

        if(i<0)
        {
            while(j<n && k>0)
            {
                ans.add(arr[j++]);
                k--;
            }
        }
        else if(j>=n)
        {
            while(i>=0 && k>0)
            {
                ans.add(arr[i--]);
                k--;
            }
        }


        Collections.sort(ans);
        return ans;
    }
}