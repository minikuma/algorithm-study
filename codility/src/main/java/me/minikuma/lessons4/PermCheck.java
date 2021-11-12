package me.minikuma.lessons4;

import java.util.Arrays;

public class PermCheck {
    public int solution(int[] A) {
            Arrays.sort(A);
            if (A[0] != 1) { // 5, 6, 7, 8, 9 케이스 필터링하기
                return 0;
            }

            for (int i = 0; i < A.length - 1; i++) {
                if (A[i + 1] - A[i] != 1) {
                    return 0;
                }
            }
            return 1;

    }

    public static void main(String[] args) {
        int[] a = {4,1,3,2};
        int[] b = {5,6,7,8,9,10};
        PermCheck p = new PermCheck();
        int aRes = p.solution(a);
        int bRes = p.solution(b);
        System.out.println("aRes = " + aRes);
        System.out.println("bRes = " + bRes);
    }
}
