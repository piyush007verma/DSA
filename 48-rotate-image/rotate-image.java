class Solution {
    public void rotate(int[][] arr) {
        int n = arr.length;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<=i;j++)
            {
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }


        for(int[] row:arr)
        {
            int low = 0;
            int high = n-1;
            while(low<=high)
            {
                int temp = row[low];
                row[low] = row[high];
                row[high] = temp;
                low++;
                high--;  
            }
        }
    }
}