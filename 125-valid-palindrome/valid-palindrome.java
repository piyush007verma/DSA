class Solution {
    public boolean isPalindrome(String s) {
        String purify = "";
        for(int i=0;i<s.length();i++)
        {
            char ch = s.charAt(i);
            if(((int)ch>=48 && (int)ch<=57) || ((int)ch>=65 && (int)ch<=90) || ((int)ch>=97 && (int)ch<=122))
            {
                purify += ch;
            }
            
        }
        purify = purify.toLowerCase();

        int low = 0;
        int high = purify.length()-1;
        while(low<=high)
        {
            if(purify.charAt(low)!=purify.charAt(high))
            {
                return false;
            }
            low++;
            high--;
        }

        return true;
    }
}