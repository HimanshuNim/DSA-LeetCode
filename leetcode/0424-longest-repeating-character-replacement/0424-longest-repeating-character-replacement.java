class Solution {
    public int characterReplacement(String s, int k) {
        int[]freq=new int[26];
        int low=0;
        int maxcnt=0;
        int maxLen=0;

        for(int high=0;high<s.length();high++){
            freq[s.charAt(high)-'A']++;
            maxcnt=Math.max(maxcnt,freq[s.charAt(high)-'A']);

            while((high-low+1)-maxcnt>k){
                freq[s.charAt(low)-'A']--;
                low++;
            }
            maxLen=Math.max(maxLen,high-low+1);
        }
        return maxLen;
    }
}