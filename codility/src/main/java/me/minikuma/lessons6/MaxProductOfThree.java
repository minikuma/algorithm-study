package me.minikuma.lessons6;

import java.util.Arrays;

/**
 * 오름차순으로 정렬한다.
 * 모든 수가 양수인 경우
 * 모든 수가 음수인 경우
 * 혼합된 경우를 생각한다.
 */

public class MaxProductOfThree {
    public int solution(int[] A) {
        int N = A.length - 1;
        Arrays.sort(A);

        int num  = A[N];
        int rightSum = num * (A[N -1] * A[N - 2]);
        int leftSum = num * (A[0] * A[1]);

        return Math.max(rightSum, leftSum);
    }

    public static void main(String[] args) {
        int[] a = {-3,1,2,-2,5,6};
        int[] b = {1,2,3,4,5,6};
        int[] c = {-6,-5,-4,-3,-2,-1};
        int[] d = {-6,-5,-4,1,2,3};
        MaxProductOfThree m = new MaxProductOfThree();
        int res = m.solution(a);
        System.out.println("res = " + res);
    }
}
