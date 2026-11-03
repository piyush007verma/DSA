class Solution {
    List<String> arr = new ArrayList<>();
    public void generate(int open , int closed ,String ans , int n)
    {
        if(ans.length()==2*n)
        {
            arr.add(ans);
            return;
        }

        if(open<n) generate(open + 1 , closed , ans + "(" ,  n);
        if(closed<open) generate(open , closed+1 , ans + ")" , n);
        
    }
    public List<String> generateParenthesis(int n) {
        generate(0 , 0 , "" , n);

        return arr;
    }
}