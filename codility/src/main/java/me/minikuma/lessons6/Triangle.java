package me.minikuma.lessons6;

import java.util.Arrays;

public class Triangle {
    public int solution(int[] A) {
        Arrays.sort(A);
        // 1, 2, 5, 8, 10, 20
        for (int i = 0; i < A.length - 2; i++) {
//            if (A[i] + A[i + 1] > A[i + 2]) { // overflow
//                return 1;
//            }
            // Integer MAX: 2,147,483,647
            // A[i + 2] 2,147,483,647
            // A[i + 1] 2,147,483,646
            // A[i] 2,147,483,645
            if (A[i + 1] > A[i + 2] - A[i]) {
                return 1;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        Triangle t = new Triangle();
        int[] a= {10,2,5,1,8,20};
        int res = t.solution(a);
        System.out.println("res = " + res);
    }
}
