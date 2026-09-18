class Solution {
    public void moveZeroes(int[] arr) {
        int n = arr.length;
        int passes = 0;
        for(int ele : arr)
        {
            if(ele==0)
            {
                passes++;
            }
        }


        for(int i=0;i<passes;i++)
        {
            for(int j=0;j<n-1-i;j++)
            {
                if(arr[j]==0 && arr[j+1]!=0)
                {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
}