class Solution {
    public int compress(char[] chars) {
        String ans = "";
        int i = 0;
        int j = 0;
        while(j<chars.length)
        {
            if(chars[i]==chars[j])
            {
                j++;
            }
            else
            {
                int len = j-i;
                if(len>1)
                {
                    ans+=chars[i];
                    ans += len;
                }
                else
                {
                    ans += chars[i];
                }
                i=j;
            }
        }
        int len = j-i;
        if(len>1)
        {
            ans+=chars[i];
            ans += len;
        }
        else
        {
            ans += chars[i];
        }
        for(int k=0;k<ans.length();k++)
        {
            chars[k] = ans.charAt(k);
        }
        return ans.toCharArray().length;
    }
}