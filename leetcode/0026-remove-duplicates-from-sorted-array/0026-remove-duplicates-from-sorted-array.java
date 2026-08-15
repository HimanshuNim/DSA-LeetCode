class Solution {
    public int removeDuplicates(int[] nums) {
        int pin = 0;
        int check_arr=1;

        while(check_arr<nums.length){
            if(nums[check_arr]==nums[check_arr-1]){
                check_arr++;
                continue;
            }
            nums[pin+1]= nums[check_arr];
            check_arr++;
            pin++;
        }
        return pin+1;
    }
}