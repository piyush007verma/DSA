
class Solution {
    public int compress(char[] chars) {
        String ans = "";
        int n = chars.length;
        int i=0 , j=0;
        while(j<n)
        {
            if(chars[i]==chars[j])
            {
                j++;
            }
            else
            {
                int len = j-i;
                ans += chars[i];
                if(len>1)
                {
                    ans += len;
                }
                i = j;
            }
        }

        ans += chars[i];
        int len = j-i;
        if(len>1)
        {
            ans += len;
        }
        for(i=0;i<ans.length();i++)
        {
            chars[i] = ans.charAt(i);
        }
        return ans.length();
    }
}