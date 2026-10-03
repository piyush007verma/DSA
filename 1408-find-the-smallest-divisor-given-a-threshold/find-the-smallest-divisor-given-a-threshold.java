class Solution {
    public int smallestDivisor(int[] arr, int t) {
        int mx = Integer.MIN_VALUE;
        int n = arr.length;
        for(int ele : arr)
        {
            mx = Math.max(ele , mx);
        }

        int low = 1;
        int high = mx;
        int d = 1;

        while(low<=high)
        {
            int mid = low + (high-low)/2;

            int sum = 0;
            for(int i=0;i<n;i++)
            {
                if(arr[i]%mid==0)
                {
                    sum += arr[i]/mid;
                }
                else
                {
                    sum += arr[i]/mid + 1;
                }
            }

            if(sum<=t)
            {
                d = mid;
                high = mid-1;
            }
            else
            {
                low = mid+1;
            }
        }

        return d;
    }
}