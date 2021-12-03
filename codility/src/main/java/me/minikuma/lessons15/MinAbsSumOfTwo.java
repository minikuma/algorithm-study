package me.minikuma.lessons15;

import java.util.Arrays;

/**
 * 연속되는 구간의 최소, 최대값은 정렬 이후 고려해야 함
 */
public class MinAbsSumOfTwo {
    public int solution(int[] A) {
        int n = A.length;
        Arrays.sort(A);
        int front = 0;
        int end = n - 1;
        int min = Math.abs(A[front] + A[end]);

        while (front <= end) {
            int currentSum = A[front] + A[end];
            min = Math.min(min, Math.abs(A[front] + A[end]));
            if (currentSum <= 0) {
                front++;
            } else {
                end--;
            }
        }
        return min;
    }

    public static void main(String[] args) {
        int[] a1 = {-8, 4, 5, -10, 3}; // -10 -8 3 4 5
        int[] a2 = {1, 4, -3};
        int[] a3 = {1000000000}; //이 케이스가 함정 (0, 0) (1, 1) 과 같은 케이스
        MinAbsSumOfTwo m = new MinAbsSumOfTwo();
        int res1 = m.solution(a1);
        int res2 = m.solution(a2);
        int res3 = m.solution(a3);
        System.out.println("res1 = " + res1);
        System.out.println("res2 = " + res2);
        System.out.println("res3 = " + res3);
    }
}
