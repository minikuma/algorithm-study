package me.minikuma.lessons11;

import java.util.Arrays;

public class CountNonDivisible {
    public int[] solution(int[] A) {
        // O (N ** 2)
        int[] count = new int[2 * A.length + 1];
        int[] result = new int[A.length];
        for (int i = 0; i < A.length; i++) {
            count[A[i]]++;
        }
        //  0  1  2  3  4  5  6  7  8  9  10
        //----------------------------------
        // [0, 1, 1, 2, 0, 0, 1, 0, 0, 0, 0]

        System.out.println(Arrays.toString(count));
        // 3,1,2,3,6
        for (int i = 0; i < A.length; i++) {
            int divisor = 0;
            int sq = (int) Math.sqrt(A[i]);
            System.out.println("sq = " + sq);
            for (int j = 1; j <= sq; j++) { //1
                if (A[i] % j == 0) {
                    divisor += count[j];
                    if (A[i] / j != j) {
                        divisor += count[A[i] / j];
                    }
                }
            }
            result[i] = A.length - divisor;
        }

        return result;
    }

    public static void main(String[] args) {
        int[] a1 = {3,1,2,3,6};
//        int[] a1 = {3};
        CountNonDivisible cnd = new CountNonDivisible();
        int[] res1 = cnd.solution(a1);
        System.out.println("res1 = " + Arrays.toString(res1));
    }
}
