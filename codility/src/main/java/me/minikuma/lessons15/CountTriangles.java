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
        for (int p = 0; p < N; p++) {
            int r = p + 1;
            for (int q = p + 1; q < N; q++) {
                while (r < N && A[p] + A[q] > A[r]) {
                    r++;
                }
                count += r - q - 1;
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
