package me.minikuma.lessons15;

import java.util.Arrays;

/**
 * two pointer (*)
 */
public class CountTriangles {
    public int solution(int[] A) {
        int N = A.length;
        if (N < 3) return 0;

        Arrays.sort(A);
        int count = 0;

        for (int i = 0; i < A.length - 2; i++) {
            int left = i + 1;
            int right = i + 2;
            while (left < right) {
                if (right < N && A[i] + A[left] > A[right]) {
                    right++;
                } else {
                    count = count + (right - left - 1);
                    left++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] a1 = {10,2,5,1,8,12};
        CountTriangles ct = new CountTriangles();
        int res1 = ct.solution(a1);
        System.out.println("res1 = " + res1);
    }
}
