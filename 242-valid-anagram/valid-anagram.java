import java.util.Arrays;

class Solution {
    public boolean isAnagram(String s, String t) {
        int len1 = s.length();
        int len2 = t.length();
        if(len1!=len2)
        {
            return false;
        }

        else
        {
            char[] arr = s.toCharArray();
            Arrays.sort(arr);

            char[] brr = t.toCharArray();
            Arrays.sort(brr);

            for(int i=0;i<len1;i++)
            {
                if(arr[i]!=brr[i])
                {
                    return false;
                }
            }
        }

        return true;
    }
}