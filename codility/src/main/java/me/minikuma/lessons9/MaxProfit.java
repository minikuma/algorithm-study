package me.minikuma.lessons9;

/**
 * 정확도: 100%
 * 효율성: 25%
 * 총점: 66% O(N**2)
 * 부분 합 문제
 */

public class MaxProfit {
    public int solution(int[] A) {
        int res = 0;
        // Brute Force
        for (int i = 0; i < A.length; i++) {
            for(int j = i + 1; j < A.length; j++) {
                int temp = A[j] - A[i];
                if (temp > res) {
                    res = temp;
                }
            }
        }

        //N is an integer within the range [0..400,000]
        // 배열이 빈 배열일수도 있다.

        if (A.length < 2) return 0;

        int currentMin = A[0]; //5
        int max = A[1] - A[0]; // 1

        for (int i = 1; i < A.length; i++) {
            currentMin = Math.min(currentMin, A[i]);
            max = Math.max(max, A[i] - currentMin);
        }

        return max;
    }

    public static void main(String[] args) {
        int[] a1 = {23171, 21011, 21123, 21366, 21013, 21367};
        int[] a2 = {5,4,3,2,1};
        MaxProfit m = new MaxProfit();
        int res1 = m.solution(a1);
        int res2 = m.solution(a2);
        System.out.println("res1 = " + res1);
        System.out.println("res2 = " + res2);
    }
}
