class Solution {
    public int removeElement(int[] nums, int val){
        int count = 0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==val)
            {
                count++;
            }
        }
        int n = nums.length - count;
        int [] arr = new int[n];
        int x = 0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]!=val)
            {
                arr[x++] = nums[i];
            }
        }
        for(int i=0;i<n;i++)
        {
            nums[i] = arr[i];
        }
        return arr.length;
}
}