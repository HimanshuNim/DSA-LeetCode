class Solution {
    public int missingMultiple(int[] nums, int k) {
        HashSet<Integer> set=new HashSet<>();
        for(int n: nums){
            set.add(n);
        }
        int res=k;
        while(set.contains(res)){
            res +=k;
        }
        return res;
    }
}