package me.minikuma.lessons6;

import java.util.Arrays;

/**
 *  Distinct
 *  memoization 을 사용하기에는 너무 범위가 넓음
 *  배열의 요소가 음수인 경우에는 적합하지 않음
 *  XOR 연산을 통해 같은 값인지 확인
 */
public class Distinct {
    public int solution(int[] A) {
        int size = A.length;
        if (size == 0) return 0;
        Arrays.sort(A);
        int cnt = 1;

        for (int i = 1; i < size; i++) {
            if ((A[i - 1] ^ A[i]) != 0) {
                cnt++;
            }
        }
        return cnt;
    }

    public static void main(String[] args) {
        int[] n = {2,1,1,2,3,1};
        Distinct d = new Distinct();
        int res = d.solution(n);
        System.out.println("res = " + res);
    }
}
