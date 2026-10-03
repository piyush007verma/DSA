class Solution {
    public String sortSentence(String s) {
        String[] arr = s.split(" ");
        int n = arr.length;
        for(int i=0;i<n-1;i++)
        {
            boolean sorted = true;
            for(int j=0;j<n-i-1;j++)
            {
                if(arr[j].charAt(arr[j].length()-1) > arr[j+1].charAt(arr[j+1].length()-1))
                {
                    String temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    sorted = false;
                }
            }

            if(sorted)
            {
                break;
            }
        }

        String ans = "";
        for(int i=0;i<n;i++)
        {
            ans += arr[i].substring(0,arr[i].length()-1) + " ";
        }

        return ans.trim();
    }
}