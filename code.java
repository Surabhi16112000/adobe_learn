class Solution{
    static long disarrange(int N)
    {
        long mod=1000000007;
        long[] dp=new long[N+1];
        dp[0]=0;
        dp[1]=0;
        dp[2]=1;
        for(int i=3;i<=N;i++)
        {
            dp[i]=((i-1)*(dp[i-1]+dp[i-2]))% mod;
        }
        return dp[N];
hi
        
    }
}