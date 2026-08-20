class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int res=Integer.MAX_VALUE;
        int high=0;
        int low=0;
        int sum=0;
        int n=nums.length;
        while(high<n){
            sum=sum+nums[high];
            while(sum>=target){
                int len=high-low+1;
                res=Math.min(len,res);
                sum=sum-nums[low];
                low++;
            }
            high++;

        }
        return res==Integer.MAX_VALUE ? 0:res;

    }
}