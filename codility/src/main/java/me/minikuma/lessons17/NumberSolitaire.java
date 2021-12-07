package me.minikuma.lessons17;

import java.util.Arrays;

public class NumberSolitaire {
    public int solution(int[] A) {

        int[] dp = new int[A.length];
        dp[0] = A[0];

        for (int i = 1; i < A.length; i++) {
            int max = Integer.MIN_VALUE;
            for (int dice = 1; dice <= 6; dice++) {
                if ((i - dice) >= 0) {
                    max = Math.max(dp[i - dice] + A[i], max);
                }
            }
            dp[i] = max;
        }
        System.out.println(Arrays.toString(dp));
        return dp[A.length - 1];
    }

    public static void main(String[] args) {
        int[] a1 = {1, -2, 0, 9, -1, -2};
        NumberSolitaire n = new NumberSolitaire();
        int res1 = n.solution(a1);
        System.out.println("res1 = " + res1);
    }
}

/* (참고)
    max_dp = {1, 1, 1, 9, 8, 7}

i = 1, dice = 1, (i - dice) = 0, dp[0] + A[1] = 1 (max)

i = 2, dice = 1, (i - dice) = 1, dp[1] + A[2] = 1
       dice = 2, (i - dice) = 0, dp[0] + A[2] = 1 (max)

i = 3, dice = 1, (i - dice) = 2, dp[2] + A[3] = 9
       dice = 2, (i - dice) = 1, dp[1] + A[3] = 9
       dice = 3, (i - dice) = 0, dp[0] + A[3] = 9 (max)

i = 4, dice = 1, (i - dice) = 3, dp[3] + A[4] = 8 (max)
       dice = 2, (i - dice) = 2, dp[2] + A[4] = 0
       dice = 3, (i - dice) = 1, dp[1] + A[4] = 0
       dice = 4, (i - dice) = 0, dp[0] + A[4] = 0

i = 5, dice = 1, (i - dice) = 4, dp[4] + A[5] = 6
       dice = 2, (i - dice) = 3, dp[3] + A[5] = 7 (max)
       dice = 3, (i - dice) = 2, dp[2] + A[5] = -1
       dice = 4, (i - dice) = 1, dp[1] + A[5] = -1
       dice = 5, (i - dice) = 0, dp[0] + A[5] = -1
 */
