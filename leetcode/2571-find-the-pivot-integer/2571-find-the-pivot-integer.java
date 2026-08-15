class Solution {
    public int pivotInteger(int n) {
        int newtotal = n*(n+1)/2;
        int x=(int) Math.sqrt(newtotal);
        if(x*x==newtotal)return x;
        return -1;
        
    }
}