package me.minikuma.lessons4.maxcounter.v2;

import java.util.Arrays;
/*
    O (N + M) 구조를 만들기 위해
    배열 초기화 조건을 나중에 진행하는 방향으로 함
 */
public class MaxCountersV2 {
    public int[] solution(int N, int[] A) {
        int tempMax = 0;
        int max = 0;
        int[] counter = new int[N];

        // 0 1 2 3 4 5 6
        // 3 4 4 6 1 4 4

        for (int i = 0; i < A.length; i++) {
            if (A[i] == N + 1) {
                tempMax = max;
            } else {
                /*
                    0 0 0 0 0
                    i = 0 -> 0 0 1 0 0
                    i = 1 -> 0 0 1 1 0
                    i = 2 -> 0 0 1 2 0
                    i = 3 -> 3 0 1 2 0
                    i = 4 -> 3 0 1 3 0
                    i = 5 -> 3 0 1 4 0
                 */

                if (tempMax < counter[A[i] - 1]) {
                    counter[A[i] - 1]++;
                } else {
                    counter[A[i] - 1] = tempMax + 1;
                }
                if (max < counter[A[i] - 1]) {
                    max = counter[A[i] - 1];
                    /*
                        i = 0 -> max = 1, tempMax = 0
                        i = 2 -> max = 2 tempMax = 2
                     */
                }
            }
        }

        for (int j = 0; j < N; j++) {
            if (counter[j] < tempMax) {
                counter[j] = tempMax;
            }
        }

        return counter;
    }

    public static void main(String[] args) {
        int n = 5;
        int[] a = {3,4,4,6,1,4,4};
        MaxCountersV2 mc = new MaxCountersV2();
        int[] res = mc.solution(n, a);
        System.out.println("res = " + Arrays.toString(Arrays.stream(res).toArray()));
    }
}
