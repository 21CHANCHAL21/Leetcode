class Solution {
    public int maxCount(int[] banned, int n, int maxSum) {
        int ans = 0;
        HashSet<Integer> lst = new HashSet<>();
        for(int i = 0; i<banned.length; i++){
            lst.add(banned[i]);
        }
        int currSum = 0;
        for(int i =1; i<=n; i++){
            if(!lst.contains(i) && currSum+i <= maxSum){
                ans++;
                currSum += i;

            }
            else{
                if(i >= maxSum-currSum)break;
            }
            
        }
        return ans;

    }
}