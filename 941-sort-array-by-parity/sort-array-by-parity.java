class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int n = nums.length;
        int low = 0;
        int high = n-1;
        while(low<=high)
        {
            if(nums[low]%2==0)
            {
                low++;
            }
            else if(nums[high]%2!=0)
            {
                high--;
            }
            else if(nums[low]%2!=0 && nums[high]%2==0)
            {
                int temp = nums[high];
                nums[high] = nums[low];
                nums[low] = temp;
            }
        }
        return nums;
    }
}