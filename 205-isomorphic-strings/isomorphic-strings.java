class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length()!=t.length())
        {
            return false;
        }


        else
        {
            char[] arr = new char[128];
            for(int i=0;i<s.length();i++)
            {
                char ch = s.charAt(i);
                int idx = (int)ch;
                if(arr[idx]!='\u0000' && arr[idx]!=t.charAt(i))
                {
                    return false;
                }
                else
                {
                    arr[idx] = t.charAt(i);
                }
            }

            char[] brr = new char[128];
            for(int i=0;i<t.length();i++)
            {
                char ch = t.charAt(i);
                int idx = (int)ch;
                if(brr[idx]!='\u0000' && brr[idx]!=s.charAt(i))
                {
                    return false;
                }
                else
                {
                    brr[idx] = s.charAt(i);
                }
            }
        }
        return true;
    }
}