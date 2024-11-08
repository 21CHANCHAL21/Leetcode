class Solution {
    public int[] getMaximumXor(int[] nums, int maximumBit) {
        int max = (1 << maximumBit) - 1;
        int total = 0;
        
        for (int num : nums) {
            total ^= num;
        }
        
        int[] res = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            res[i] = total ^ max;
            total ^= nums[nums.length - 1 - i];
        }
        
        return res;
    }
}
