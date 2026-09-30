class Solution {
    public int[] searchRange(int[] arr, int target) {
        int[] ans = {-1,-1};
        int low = 0;
        int high = arr.length-1;
        while(low<=high)
        {
            int mid = low + (high-low)/2;
            if(arr[mid]==target)
            {
                ans[0] = mid;
                high = mid-1;
            }
            else if(arr[mid]>target)
            {
                high = mid-1;
            }
            else
            {
                low = mid+1;
            }
        }

        low = 0;
        high = arr.length-1;
        
        while(low<=high)
        {
            int mid = low + (high-low)/2;
            if(arr[mid]==target)
            {
                ans[1] = mid;
                low = mid+1;
            }
            else if(arr[mid]>target)
            {
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