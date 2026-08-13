class Solution {
    public List<List<Integer>> generate(int numRows) {
        int n = numRows;
        List<List<Integer>> arr = new ArrayList<>(n);

        for(int i=0;i<n;i++)
        {
            List<Integer> l = new ArrayList<>();
            for(int j=0;j<i+1;j++)
            {
                l.add(1);
            }
            arr.add(l);
        }


        for(int i=2;i<n;i++)
        {
            for(int j=1;j<i;j++)
            {
                arr.get(i).set(j,arr.get(i-1).get(j) + arr.get(i-1).get(j-1));
            }
        }

        return arr;
    }
}