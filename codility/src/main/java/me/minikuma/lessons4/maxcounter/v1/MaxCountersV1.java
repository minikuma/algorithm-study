package me.minikuma.lessons4.maxcounter.v1;

import java.util.Arrays;

/**
 * 정확도: 100%
 * 성능: 60%
 *
 */
public class MaxCountersV1 {
    public int[] solution(int N, int[] A) {
        // 0 1 2 3 4 5 6
        // 3 4 4 6 1 4 4

        int[] counter = new int[N];
        int max = 0;

        for (int i = 0; i < A.length; i++) {
            if (1 <= A[i] && A[i] <= N) {
                counter[A[i] - 1]++;

                /*
                    i = 0 -> 0, 0, 0, 1, 0
                    i = 1 -> 0, 0, 0, 1, 1
                    i = 2 -> 0, 0, 0, 1, 2
                    i = 4 -> 2, 3, 2, 2, 2
                    i = 5 -> 2, 3, 2, 2, 3
                    i = 6 -> 2, 3, 2, 2, 4
                 */

                if (max < counter[A[i] - 1]) {
                    max = counter[A[i] - 1];
                    /*
                        i = 0 -> max = 1
                        i = 2 -> max = 2
                        i = 3 -> max = 3
                     */
                }
            } else {
                if (A[i] == N + 1) {
                    // 현재 counter 의 최대값으로 채워준다.
                    Arrays.fill(counter, max);
                    // 2, 2, 2, 2, 2
                }
            }
        }
        return counter;
    }

    public static void main(String[] args) {
        int n = 5;
        int[] a = {3,4,4,6,1,4,4};
        MaxCountersV1 mc = new MaxCountersV1();
        int[] res = mc.solution(n, a);
        System.out.println("res = " + Arrays.toString(Arrays.stream(res).toArray()));
    }
}
