package me.minikuma.lessons3;

import java.util.Arrays;

/*
    (Idea) 전체합 - 부분합
 */
public class TapeEquilibriumV1 {
    public int solution(int[] A) {
        int n = A.length;
        int[] partialSum = new int[n];
        int sum = 0;

        for (int i = 0; i < n; i++) {
            sum += A[i];
            partialSum[i] = sum;
        }
        System.out.println("A Arrays = " + Arrays.toString(A));
        System.out.println("Partial Arrays = " + Arrays.toString(partialSum));

        int totalSum = partialSum[n - 1]; // 13
        int min = Integer.MAX_VALUE;

        for (int p = 0; p < n - 1; p++) {
            int sub = totalSum - partialSum[p];
            min = Math.min(Math.abs(partialSum[p] - sub), min);
        }

        return min;
    }

    public static void main(String[] args) {
        int[] a1 = {3, 1, 2, 4, 3};
        int[] a2 = {-1000, 1000};
        TapeEquilibriumV1 t1 = new TapeEquilibriumV1();
        int res1 = t1.solution(a1);
        int res2 = t1.solution(a2);
        System.out.println("res1 = " + res1);
        System.out.println("res2 = " + res2);
    }
}
