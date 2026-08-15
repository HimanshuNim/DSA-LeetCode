class Solution {
    public int removeDuplicates(int[] nums) {
        int pin = 0;
        int k=1;
        int check_arr=1;
        int n= nums.length;

        while(check_arr<n){
            if(nums[check_arr]==nums[check_arr-1]){
                check_arr++;
                continue;
            }
            nums[pin+1]= nums[check_arr];
            check_arr++;
            k++;
            pin++;
        }
        return k;
    }
}