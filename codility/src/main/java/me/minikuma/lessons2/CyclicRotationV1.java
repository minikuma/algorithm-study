package me.minikuma.lessons2;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

/**
 * Deque 자료형으로 배열 로테이션 해결
 *
 */
public class CyclicRotationV1 {
    public int[] solution(int[] A, int K) {
        int n = A.length;
        if (n < 1) return A; // (*) 빈 배열 조건 고려 필요!

        Deque<Integer> deque = new ArrayDeque<>();

        for (int i = 0; i < n; i++) {
            deque.add(A[i]);
        }

        System.out.println("Deque = " + deque);

        for (int i = 0; i < K; i++) {
            deque.addFirst(deque.pollLast());
        }

        return deque.stream().mapToInt(Integer::intValue).toArray();
    }

    public static void main(String[] args) {
        int[] a1 = {3, 8, 9, 7, 6};
        int[] a2 = {1, 2, 3, 4};
        int[] a3 = {0, 0, 0};
        int[] a4 = {};
        int k1 = 6;
        int k2 = 4;
        int k3 = 1;
        int k4 = 1;
        CyclicRotationV1 c = new CyclicRotationV1();
        int[] res1 = c.solution(a1, k1);
        int[] res2 = c.solution(a2, k2);
        int[] res3 = c.solution(a3, k3);
        int[] res4 = c.solution(a3, k3);
        System.out.println("res1 = " + Arrays.toString(res1));
        System.out.println("res2 = " + Arrays.toString(res2));
        System.out.println("res3 = " + Arrays.toString(res3));
        System.out.println("res4 = " + Arrays.toString(res4));
    }
}
