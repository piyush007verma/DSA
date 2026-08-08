class Solution {
    public int minimumSwaps(int[] nums) {
        int n = nums.length;
        int swaps = 0;
        int mid = 0;
        int high = n-1;
        while(mid<=high)
        {
            if(nums[mid]!=0)
            {
                mid++;
            }
            else
            {
                if(nums[high]!=0)
                {
                    int temp = nums[mid];
                    nums[mid] = nums[high];
                    nums[high] = temp;
                    swaps++;
                }
                high--;
            }


            
        }
        return swaps;
    }
}