package me.minikuma.lessons2;

import java.util.HashMap;
import java.util.Map;

/**
 * 배열의 요소는 모두 홀수
 * Unpair 배열의 요소를 찾아라
 * Bit 연산(XOR)
 */
public class OddOccurrencesInArrayV1 {
    public int solution(int[] A) {
        int bit = 0;

        for (int i = 0; i < A.length; i++) {
            bit = bit ^ A[i];
            System.out.println("bit = " + bit);
        }

        return bit;
    }

    public static void main(String[] args) {
        int[] a1 = {9, 3, 9, 3, 9, 7, 9};
        OddOccurrencesInArrayV1 o = new OddOccurrencesInArrayV1();
        int res1 = o.solution(a1);
        System.out.println("res1 = " + res1);
    }
}
