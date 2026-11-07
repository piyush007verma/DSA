class Solution {
    public void swap(int[]arr , int i , int j)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public List<Integer> findDuplicates(int[] arr) {
        List<Integer> ans = new ArrayList<>();
        int n = arr.length;
        int i = 0;

        while(i<n)
        {
            if(arr[i]==i+1 || arr[i]==arr[arr[i]-1]) i++;
            else
            {
                swap(arr , i , arr[i]-1);
            }
        }

        for(i=0;i<n;i++)
        {
            if(arr[i]!=i+1) ans.add(arr[i]);
        }

        return ans;
    }
}