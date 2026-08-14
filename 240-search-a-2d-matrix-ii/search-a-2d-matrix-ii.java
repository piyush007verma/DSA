class Solution {
    public boolean searchMatrix(int[][] arr, int target) {
        int r = arr.length;
        int c = arr[0].length;
        int i=0;
        int j = c-1;
        while(i<r && j>=0)
        {
            if(arr[i][j]==target)
            {
                return true;
            }
            else if(arr[i][j]>target)
            {
                j--;
            }
            else if(arr[i][j]<target)
            {
                i++;
            }
        }
        return false;
    }
}