class Solution {
    public int[] xorQueries(int[] arr, int[][] queries) {
        int ans[] = new int[queries.length];
        for(int i =0; i<queries.length; i++){
            int start = queries[i][0];
            int end = queries[i][1];
            int cal = 0;
            for(int j =start; j<=end; j++){
                cal = cal ^ arr[j];
            }
            ans[i] = cal;
        }
        return ans;
        
    }
}