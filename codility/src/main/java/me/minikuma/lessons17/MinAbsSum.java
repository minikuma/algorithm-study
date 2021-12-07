package me.minikuma.lessons17;

public class MinAbsSum {
    public int solution(int[] A) {
        return -1;
    }

    public static void main(String[] args) {
        int[] a1 = {};
        MinAbsSum m = new MinAbsSum();
        int res1 = m.solution(a1);
        System.out.println("res1 = " + res1);
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
