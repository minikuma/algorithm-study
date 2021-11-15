package me.minikuma.lessons2;

import java.util.Arrays;

/**
 * 배열 쉬프트 문제 (정확도 고려 문제)
 */
public class CyclicRotation {
    public int[] solution(int[] A, int K) {
        int size = A.length;
        for (int i = 0; i < K; i++) {
            int temp = A[size - 1];
            for (int j = size - 1; j > 0; j--) {
                A[j] = A[j - 1];
            }
            A[0] = temp;
        }
        return A;
    }

    public static void main(String[] args) {
        int[] a = {3, 8, 9, 7, 6};
        int k = 3;
        CyclicRotation c = new CyclicRotation();
        System.out.println(Arrays.toString(c.solution(a, k)));
    }
}
