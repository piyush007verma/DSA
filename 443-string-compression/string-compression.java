class Solution {
    public int compress(char[] arr) {
        String ans = "";
        int i = 0 , j = 0;
        while(j<arr.length)
        {
            if(arr[i]==arr[j])
            {
                j++;
            }
            else
            {
                int len = j-i;
                if(len>1)
                {
                    ans += arr[i];
                    ans += len;
                }
                else
                {
                    ans += arr[i];
                }
                i=j;
            }
        }

        int len = j-i;
        if(len>1)
        {
            ans += arr[i];
            ans += len;
        }
        else
        {
            ans += arr[i];
        }

        for(int k=0;k<ans.length();k++)
        {
            arr[k] = ans.charAt(k);
        }
        return ans.length();
    }
}