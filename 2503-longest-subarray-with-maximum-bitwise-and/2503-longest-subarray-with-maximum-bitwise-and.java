class Solution {
    public int longestSubarray(int[] nums) {
        // int ans = 0;
        // int bitwiseAnd = 0;
        // for(int i =0; i<nums.length; i++){
        //     int res = nums[i];
        //     for(int j= i; j<nums.length; j++){ 
                
        //         if(bitwiseAnd <= res){
        //             bitwiseAnd = res;
        //             ans = j-i+1;
        //         }
        //         res = res & nums[j];
        //     }
        // }
        // return ans;

        int max = 0, count = 0, maxcount = 0;
        for(int i =0; i<nums.length; i++){
            max = Math.max(max, nums[i]);
        }

        for(int i =0; i<nums.length; i++){
            if(max == nums[i]){
                count++;
            }
            else{
                maxcount = Math.max(maxcount, count);
                count = 0;
            }
        }

        maxcount = Math.max(maxcount, count);
        if(maxcount == 0)return 1;
        return maxcount;
        
    }
}