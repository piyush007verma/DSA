class Solution {
    public int maximumWealth(int[][] arr) {
        int mxsum = Integer.MIN_VALUE;
        int n = arr.length;
        int m = arr[0].length;

        for(int i=0;i<n;i++)
        {
            int sum = 0;
            for(int j=0;j<m;j++)
            {
                sum += arr[i][j];
            }
            mxsum = Math.max(sum , mxsum);
        }
        return mxsum;
    }
    
}