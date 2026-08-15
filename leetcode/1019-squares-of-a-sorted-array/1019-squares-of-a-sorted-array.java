class Solution {
    public int[] sortedSquares(int[] nums) {
      int n=nums.length;
      int result[]=new int[n];
      int l=0;
      int r=n-1;
      int index=n-1;

      while(l<=r){
        int ls=nums[l]*nums[l];
        int rs=nums[r]*nums[r];
        if(ls>rs){
            result[index]=ls;
            l++;
        }else{
            result[index]=rs;
            r--;
        }
        index--;
      }
      return result;
    }
}