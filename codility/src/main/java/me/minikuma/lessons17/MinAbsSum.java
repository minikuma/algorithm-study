package me.minikuma.lessons17;

import java.util.Arrays;

public class MinAbsSum {
    public int solution(int[] A) {
        int n = A.length;
        if (n < 1) return 0;

        int[] abs = new int[n];
        int max = Integer.MIN_VALUE;
        int sum = 0;

        for (int i = 0; i < n; i++) {
            int val = Math.abs(A[i]);
            abs[i] = val;
            max = Math.max(max, val);
            sum += val;
        }

        int[] count = new int[max + 1];
        for (int i = 0; i < n; i++) {
            int val = abs[i];
            count[val]++;
        }

        int[] dp = new int[sum + 1];
        Arrays.fill(dp, -1);
        dp[0] = 0;

        for (int i = 1; i <= max; i++) {
            int cnt = count[i];
            if (cnt > 0) {
                for (int j = 0; j <= sum; j++) {
                    if (dp[j] >= 0) {
                        dp[j] = cnt;
                    } else if (j >= i && dp[j - i] > 0) {
                        dp[j] = dp[j - i] - 1;
                    }
                 }
            }
        }

        int res = sum;
        for (int i = 0; i < sum / 2 + 1; i++) {
            if (dp[i] >= 0) {
                res = Math.min(res, sum - 2 * i);
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] a1 = {1, 5, 2, -2};
        int[] a2 = {2, 2, 1};
        int[] a3 = {3, 3, 3, 4, 5};
        MinAbsSum m = new MinAbsSum();
        int res1 = m.solution(a1);
        int res2 = m.solution(a2);
        int res3 = m.solution(a3);
        System.out.println("res1 = " + res1);
        System.out.println("res2 = " + res2);
        System.out.println("res3 = " + res3);
    }
}

/*
 (note)
 dp = {}
dp[0] = A[0] * S[0]; // -1
int min = MAX;
int temp = 1;

for (int i = 1; i < A.length; i++) {
	min = Math.abs((Math(dp[i - 1] + (A[i] * temp), min));
	temp *= -1;
	dp[i] = dp[i - 1] + (A[i] * temp);
}

dp = {1, 4, 2, 0}

i = 1,  dp[0] + (1 * -1) = -1 + (5 * 1) = 4
i = 2, dp[1] + (2 * -1) = 2
i = 3 dp[2] + (-2 * 1) = 0
 */
