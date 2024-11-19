// class Solution {
//     public long maximumSubarraySum(int[] nums, int k) {
//         if(k== 1){
//             Arrays.sort(nums);
//             return nums[nums.length-1];
//         }
//         HashSet<Integer> set = new HashSet<>();
//         int sum = 0;
//         int maxSum = 0;
//         for(int i =0; i<k; i++){
//             if(set.contains(nums[i])){
//                 set.clear();
//                 sum = 0;
                
//             }
//             set.add(nums[i]);
//             sum += nums[i];
//         }
//         if(set.size() ==k && sum > maxSum)maxSum = sum;
//         int j =0;

//         for(int i = k; i<nums.length; i++){
//             if(set.contains(nums[i])){
//                 set.clear();
//                 sum = 0;
//                 continue;
//             }
//             if(set.size() ==k){
//             set.remove(nums[j]);
//             sum = sum - nums[j];}
//             sum = sum + nums[i];
//             set.add(nums[i]);
//             j++;
//             if(set.size()==k && sum > maxSum){
//                 maxSum = sum;
//             }

            
//         }
//         return maxSum;
        
//     }
// }

class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        int n = nums.length;
        Set<Integer> elements = new HashSet<>();
        long currentSum = 0;
        long maxSum = 0;
        int begin = 0;
        
        for (int end = 0; end < n; end++) {
            if (!elements.contains(nums[end])) {
                currentSum += nums[end];
                elements.add(nums[end]);
                
                if (end - begin + 1 == k) {
                    maxSum = Math.max(maxSum, currentSum);
                    currentSum -= nums[begin];
                    elements.remove(nums[begin]);
                    begin++;
                }
            } else {
                while (nums[begin] != nums[end]) {
                    currentSum -= nums[begin];
                    elements.remove(nums[begin]);
                    begin++;
                }
                begin++;
            }
        }
        
        return maxSum;
    }
}