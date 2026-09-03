class Solution {
    public int removeDuplicates(int[] nums) {
        int x = 0;
        int n = nums.length;
        int [] arr = new int[nums.length];
        arr[0] = nums[0];
        for(int i=0;i<n;i++)
        {
            if(arr[x]!=nums[i])
            {
                x++;
                arr[x] = nums[i];
            }
        }
        for(int i=0;i<=x;i++)
        {
            nums[i] = arr[i];
        }

        return x+1;
    }
}