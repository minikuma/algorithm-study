package me.minikuma.lessons15;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class CountDistinctSlices {
    public int solution(int M, int[] A) {
        // 배열 스캔
        // M 보다 작은 값 확인
        // 중복 값이 없는 지 확인
        Set<Integer> sets = new HashSet<>();

        for (int i = 0; i < A.length; i++) {
            if (A[i] <= M) {
                if (!sets.contains(A[i])) {
                    sets.add(A[i]);
                }
            }

        }


        return 0;
    }

    public static void main(String[] args) {
        int m1 = 6;
        int[] a1 = {3,4,5,5,2};
        CountDistinctSlices cs = new CountDistinctSlices();
        int res1 = cs.solution(m1, a1);
        System.out.println("res1 = " + res1);
    }
}
