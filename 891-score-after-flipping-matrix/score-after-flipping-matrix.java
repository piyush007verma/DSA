class Solution {
    public int matrixScore(int[][] arr) {
        int r = arr.length;
        int c = arr[0].length;

        for(int i=0;i<r;i++)
        {
            if(arr[i][0]==0)
            {
                for(int j=0;j<c;j++)
                {
                    if(arr[i][j]==0)
                    {
                        arr[i][j] = 1;
                    }
                    else
                    {
                        arr[i][j] = 0;
                    }
                }
            }
        }



        

        for(int j=1;j<c;j++)
        {
            int zeros = 0;
            int ones = 0;
            for(int i=0;i<r;i++)
            {
                if(arr[i][j]==0)
                {
                    zeros++;
                }
                else
                {
                    ones++;
                }
            }

            if(zeros>ones)
            {
                for(int i=0;i<r;i++)
                {
                    if(arr[i][j]==0)
                    {
                        arr[i][j] = 1;
                    }
                    else
                    {
                        arr[i][j] = 0;
                    }
                }
            }
        }

        int score = 0;
        int x = 1;
        for(int j=c-1;j>=0;j--)
        {
            for(int i=0;i<r;i++)
            {
                score+=arr[i][j]*x;
            }
            x *= 2;
        }

        return score;
    }
}