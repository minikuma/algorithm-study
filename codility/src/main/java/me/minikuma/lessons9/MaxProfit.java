package me.minikuma.lessons9;

/**
 * 정확도: 100%
 * 효율성: 25%
 * 총점: 66% O(N**2)
 */

public class MaxProfit {
    public int solution(int[] A) {
        int max = 0;
        // Brute Force
        for (int i = 0; i < A.length; i++) {
            for(int j = i + 1; j < A.length; j++) {
                int temp = A[j] - A[i];
                System.out.println("temp = " + temp);
                if (temp > max) {
                    max = temp;
                }
            }
        }


        return max;
    }

    public static void main(String[] args) {
//        int[] a1 = {23171, 21011, 21123, 21366, 21013, 21367};
        int[] a2 = {5,4,3,2,1};
        MaxProfit m = new MaxProfit();
//        int res1 = m.solution(a1);
        int res2 = m.solution(a2);
//        System.out.println("res1 = " + res1);
        System.out.println("res2 = " + res2);
    }
}
