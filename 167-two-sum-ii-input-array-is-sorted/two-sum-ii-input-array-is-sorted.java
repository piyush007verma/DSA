class Solution {
    public int[] twoSum(int[] arr, int target) {
        int low = 0;
        int high = arr.length-1;
        int[] ans = new int[2];

        while(low<high)
        {
            if(arr[low] + arr[high]==target)
            {
                return new int[] {low+1 , high+1};
            }

            else if(arr[low] + arr[high]<target)
            {
                low++;
            }
            else if(arr[low]+arr[high]>target)
            {
                high--;
            }
        }

        return new int[]{};
    }
}