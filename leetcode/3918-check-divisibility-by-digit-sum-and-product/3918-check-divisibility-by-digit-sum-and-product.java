class Solution {
    public boolean checkDivisibility(int n) {
        int num=n;
        int sum=0;
        int product=1;
        while(n>0){
            int cur=n%10;
            n=n/10;
            sum+=cur;
            product*=cur;

        }
        return num % (sum+product)==0;
    }
}