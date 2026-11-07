class Solution {
    public void swap(int[]arr , int i , int j)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public int[] findErrorNums(int[] arr) {
        int[] ans = new int[2];
        int i = 0;
        int n = arr.length;
        while(i<n)
        {
            if(arr[i]==i+1 || arr[i]==arr[arr[i]-1]) i++;
            else swap(arr , i , arr[i]-1);
        }

        for(i=0;i<n;i++)
        {
            if(arr[i]!=i+1)
            {
                ans[0] = arr[i];
                ans[1] = i+1;
                break;
            }
        }

        return ans;

    }
}