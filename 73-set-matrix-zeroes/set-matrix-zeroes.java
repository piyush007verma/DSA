class Solution {
    public void setZeroes(int[][] arr) {
        int r = arr.length;
        int c = arr[0].length;
        boolean[] row = new boolean[r];
        boolean[] col = new boolean[c];
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                if(arr[i][j]==0)
                {
                    row[i]=true;
                    col[j]=true;
                }
            }
        }



        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                if(row[i])
                {
                    for(int b=0;b<c;b++)
                    {
                        arr[i][b] = 0;
                    }
                }

                else if(col[j])
                {
                    for(int a = 0;a<r;a++)
                    {
                        arr[a][j] = 0;
                    }
                }
            }
        }
    }
}