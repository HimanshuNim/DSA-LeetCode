class Solution {
    public int longestSubsequence(int[] nums) {
        int xor =0;
        boolean NoZero = false;

        for (int n: nums) {
            xor ^= n;

            if (n!=0)
                NoZero = true;
        }

        if (xor !=0)
            return nums.length;
        
        if (NoZero)
            return nums.length-1;

        return 0;
        
    }
}