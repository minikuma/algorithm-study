package me.minikuma.lessons8.v1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
/*
    정확도: 100%
    효율성: 0 %
    합계: 55 %
    Big-O: O(N**2)
 */
public class EquiLeaderV1 {
    public int solution(int[] A) {
        int[] left = {};
        int[] right = {};

        int l_cnt = 0;
        int r_cnt = 0;

        Map<Integer, Integer> maps = new HashMap<>();

        for (int i = 0; i < A.length; i++) {
            maps.put(A[i], maps.getOrDefault(A[i], 0) + 1);
        }

        int half = A.length / 2;
        int leader = 0;

        for (Integer key : maps.keySet()) {
            int temp = maps.get(key);
            if (temp > half) {
                leader = key; // leader 숫자
            }
        }

        int count = 0;

        for (int i = 1; i < A.length; i++) {
            left = Arrays.copyOfRange(A, 0, i);
            System.out.println(Arrays.toString(left));
            for (int k = 0; k < left.length; k++) {
                if (left[k] == leader) {
                    l_cnt++;
                }
            }

            right = Arrays.copyOfRange(A, i, A.length);

            for (int j = 0; j < right.length; j++) {
                if (right[j] == leader) {
                    r_cnt++;
                }
            }

            if (left.length / 2 < l_cnt && right.length / 2 < r_cnt) {
                count++;
            }

            l_cnt = 0;
            r_cnt = 0;
        }

        return count;
    }

    public static void main(String[] args) {
        int[] a1 = {4, 3, 4, 4, 4, 2};
        int[] a2 = {0,0};
        EquiLeaderV1 e = new EquiLeaderV1();
        int res1 = e.solution(a1);
        int res2 = e.solution(a2);
        System.out.println("res1 = " + res1);
        System.out.println("res2 = " + res2);
    }
}
