class Solution {
    public int countTrapezoids(int[][] points) {
       long MOD = 1000000007L;

       Map<Integer, Integer> map=new HashMap<>();
       for (int[] p : points){
        map.put(p[1], map.getOrDefault(p[1],0)+1);
       }

       List<Long> pairs=new ArrayList<>();
       for (int count : map.values()){
        if(count>=2){
            long c2=(long) count * (count-1)/2;
            pairs.add(c2%MOD);
        }
       }

       if(pairs.size()<2)return 0;

       long sum=0, sumSq=0;
       for(long x : pairs){
        sum = (sum+x)%MOD;
        sumSq = (sumSq + (x*x)%MOD)%MOD;
       }
       long ans =(sum*sum%MOD-sumSq+MOD)%MOD;
       long inv2 = (MOD+1)/2;
       ans=ans*inv2%MOD;

       return (int) ans;
    }
}