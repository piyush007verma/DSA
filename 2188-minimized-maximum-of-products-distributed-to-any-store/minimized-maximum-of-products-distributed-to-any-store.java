class Solution {
    public boolean ispossible(int[] arr , int maxqty , int n)
    {
        int units = 0;
        int stores = 0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]%maxqty==0)
            {
                stores += arr[i]/maxqty;
            }
            else
            {
                stores += arr[i]/maxqty + 1;
            }
        }

        if(stores<=n)
        {
            return true;
        }
        else
        {
            return false;
        }
    }


    public int minimizedMaximum(int n, int[] arr) {
        int m = arr.length;
        int mx = Integer.MIN_VALUE;
        int low = 1;
        for(int ele : arr)
        {
            mx = Math.max(ele , mx);
        }

        int high = mx;
        int ans = 0;
        while(low <= high)
        {
            int mid = low + (high-low)/2;
            if(ispossible(arr , mid , n))
            {
                ans = mid;
                high = mid-1;
            }
            else
            {
                low = mid+1;
            }
        }

        return ans;
        
    }
}