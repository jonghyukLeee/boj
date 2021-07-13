package DP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q2579 {
    static int [] map;
    static int [] dp;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        map = new int[n+1];
        dp = new int[n+1];

        for(int i = 1; i <= n; ++i)
        {
            map[i] = Integer.parseInt(br.readLine());
        }
        dp[1] = map[1];

        if(n >= 2)
        {
            dp[2] = map[1] + map[2];
        }

        for(int i = 3; i <= n; ++i)
        {
            dp[i] = Math.max(dp[i-2],dp[i-3] + map[i-1]) + map[i];
        }

        System.out.print(dp[n]);
    }
}
