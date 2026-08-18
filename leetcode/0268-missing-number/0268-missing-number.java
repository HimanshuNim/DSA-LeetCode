class Solution {
    public int missingNumber(int[] nums) {
        int xorSum=nums.length;
        for(int i=0;i<nums.length;i++){
            xorSum^=i^nums[i];
        }
        return xorSum;
    }
}