class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums.length<=2){
            return nums.length;
        }
      int pin=1;
      int check=2;

      while(check<nums.length){
        if(nums[check]!=nums[pin-1]){
            nums[pin+1]=nums[check];
            pin++;
        }
        check++;
      }  
      return pin+1;
    }
}