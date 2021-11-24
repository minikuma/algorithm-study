package me.minikuma.lessons9;
/*
    부분합 문제
     - (P, Q) 두개의 합을 비교
     - 카데인 알고리즘
 */

public class MaxSliceSum {
    public int solution(int[] A) {

        int mSum = A[0]; // 3

        if (A.length < 2) {
            return mSum;
        }

        int sum = A[0];

        for (int i = 1; i < A.length; i++) {
            sum = Math.max(A[i], sum + A[i]);
            mSum = Math.max(mSum, sum);
        }
        return mSum;
    }

    public static void main(String[] args) {
        int[] a1 = {3,2,-6,4,0};
        int[] a2 = {4};
        int[] a3 = {-2, 1};
        MaxSliceSum m = new MaxSliceSum();
        int res1 = m.solution(a1);
        int res2 = m.solution(a2);
        int res3 = m.solution(a3);
        System.out.println("res1 = " + res1);
        System.out.println("res2 = " + res2);
        System.out.println("res3 = " + res3);
    }
}
