class Solution {
    public int totalFruit(int[] fruits) {
        int left=0;
        int maxLen=0;
        int n=fruits.length;
        Map<Integer,Integer> freq=new HashMap<>();
        for(int right=0;right<n;right++){
            freq.put(fruits[right],freq.getOrDefault(fruits[right],0)+1);

            while(freq.size()>2){
                int leftFruit=fruits[left];
                freq.put(leftFruit,freq.get(leftFruit)-1);
                if(freq.get(leftFruit)==0){
                    freq.remove(leftFruit);
                }
                    left++;
            }
            maxLen=Math.max(maxLen,right-left+1);
        }
        return maxLen;
    }
}