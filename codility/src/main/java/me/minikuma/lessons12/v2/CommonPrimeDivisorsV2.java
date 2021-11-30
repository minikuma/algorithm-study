package me.minikuma.lessons12.v2;

import me.minikuma.lessons12.v1.CommonPrimeDivisorsV1;

/**
 * GCD(최대공약수) 의 특징을 이용한 풀이 (*)
 */

public class CommonPrimeDivisorsV2 {
    public int solution(int[] A, int[] B) {
        int len = A.length;
        int count = 0;
        for (int i = 0; i < len; i++) {
            int num1 = Math.max(A[i], B[i]); // 75
            int num2 = Math.min(A[i], B[i]); // 15
            int gcd = getGcd(num1, num2);    // 15
            if (checkedDivisor(num1, gcd) && checkedDivisor(num2, gcd)) {
                count++;
            }
        }
        return count;
    }

    private boolean checkedDivisor(int M, int gcd) {
        if (M == 1) {
            return true;
        } else if (gcd == 1) {
            return false;
        } else {
            gcd = getGcd(M, gcd);
            M /= gcd;
            return checkedDivisor(M, gcd);
        }
    }

    // 최대 공약수
    private int getGcd(int a, int b) {
        if (a % b == 0) {
            return b;
        } else {
            return getGcd(b, a % b);
        }
    }

    public static void main(String[] args) {
        int[] a1 = {15, 10 ,3};
        int[] b1 = {75, 30, 5};
        CommonPrimeDivisorsV1 cp = new CommonPrimeDivisorsV1();
        int res1 = cp.solution(a1, b1);
        System.out.println("res1 = " + res1);
    }
}
