package me.minikuma.lessons9;

import java.util.Arrays;

/*
    double slice max sum
    경계값은 max sum에 영향을 받게 하면 안됨 (*)
    left sum, right sum 필요
    음수인 경우를 체크한다.
 */

public class MaxDoubleSliceSum {
    public int solution(int[] A) {
        // (X, Y, X) = 0 <= X < Y < Z < N
        int size = A.length;
        if (size < 4) return 0;

        int[] leftMax = new int[size]; // 왼쪽의 최대값들을 담는 배열
        int[] rightMax = new int[size]; // 오른쪽 영역의 최대값을 담는 배열

        // left max
        for (int i = 1; i < size - 1; i++) {
            leftMax[i] = Math.max(0, leftMax[i - 1] + A[i]);
        }
        System.out.println(Arrays.toString(leftMax));

        // right max
        for (int i = size - 1; i > 1 ; i--) {
            rightMax[i - 1] = Math.max(0, rightMax[i] + A[i - 1]);
        }

        System.out.println(Arrays.toString(rightMax));

        int max = 0;

        for (int i = 1; i < size - 1; i++) {
            max = Math.max(leftMax[i - 1] + rightMax[i + 1], max);
        }

        return max;
    }

    public static void main(String[] args) {
        int[] a1 = {3,2,6,-1,4,5,-1,2};
        int[] a2 = {0, 10, -5, -2, 0};
        MaxDoubleSliceSum md = new MaxDoubleSliceSum();
        int res1 = md.solution(a1);
        int res2 = md.solution(a2);
        System.out.println("res1 = " + res1);
        System.out.println("res2 = " + res2);
    }
}