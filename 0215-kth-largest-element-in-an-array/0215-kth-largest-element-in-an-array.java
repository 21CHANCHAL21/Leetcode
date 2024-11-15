class Solution {
    public int findKthLargest(int[] nums, int k) {
        
        Arrays.sort(nums);
        int ind = nums.length- k;

        return nums[ind];
    }
}