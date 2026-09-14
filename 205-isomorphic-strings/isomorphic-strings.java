class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length()!=t.length())
        {
            return false;
        }

        char[] arr = new char[128];

        for(int i=0;i<s.length();i++)
        {
            char ch = s.charAt(i);
            char dh = t.charAt(i);
            int idx = (int)ch;

            if(arr[idx]=='\u0000' || arr[idx]==dh)
            {
                arr[idx] = dh;
            }

            else
            {
                return false;
            }
        }

        char [] brr = new char[128];
        for(int i=0;i<t.length();i++)
        {
            char ch = s.charAt(i);
            char dh = t.charAt(i);
            int idx = (int)(dh);
            if(brr[idx]=='\u0000' || brr[idx]==ch)
            {
                brr[idx] = ch;
            }

            else
            {
                return false;
            }
        }

        return true;
    }
}