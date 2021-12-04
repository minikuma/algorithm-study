package me.minikuma.lessons13;

import java.util.Arrays;

/**
 * 사다리의 경우의 수가 피보나치 수열의 수와 같다!!
 */
public class Ladder {
    public int[] solution(int[] A, int[] B) {
        int L = A.length; // 전체 사다리 수
        int[] result = new int[L];
        int[] fibo = createFibo(L);
        for (int i = 0; i < L; i++) {
            result[i] = (int) (fibo[A[i]] % Math.pow(2, B[i]));
        }
        return result;
    }

    private int[] createFibo(int len) {
       int[] temp = new int[len + 2];
       temp[1] = 1;
       temp[2] = 2;
       for (int i = 3; i <= len; i++) {
           temp[i] = (int) ((temp[i - 2] + temp[i - 1]) % Math.pow(2, 30));
       }
       return temp;
    }

    public static void main(String[] args) {
        int[] a1 = {4,4,5,5,1};
        int[] b1 = {3,2,4,3,1};
        Ladder l = new Ladder();
        int[] res1 = l.solution(a1, b1);
        System.out.println("res1 = " + Arrays.toString(res1));
    }
}
