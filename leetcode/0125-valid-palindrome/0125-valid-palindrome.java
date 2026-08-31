class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder cleaned =new StringBuilder();
        for(char c: s.toCharArray()){
            if(Character.isLetterOrDigit(c)){
                cleaned.append(Character.toLowerCase(c));
            }
        }
        String str =cleaned.toString();
        int n=str.length();

        int i=0;
        while(i<n/2){
            if(str.charAt(i)!=str.charAt(n-1-i)) return false;

            i++;
        }

        return true;
    }
}