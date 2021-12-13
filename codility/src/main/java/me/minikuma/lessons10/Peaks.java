package me.minikuma.lessons10;

import java.util.ArrayList;
import java.util.List;

public class Peaks {
    public int solution(int[] A) {
        int n = A.length;
        if (n < 3) return 0;
        List<Integer> peaks = new ArrayList<>();
        // find peaks A[P - 1] < A[P] and A[P] > A[P + 1]
        for (int i = 1; i < n; i++) {
            if (A[i - 1] < A[i] && A[i] > A[i + 1]) peaks.add(i);
        }

        System.out.println("peaks = " + peaks);

        if (peaks.size() == 0) return 0; // peak 없는 경우

        // 배열 그룹 나누기
        for (int size = 1; size <= n; size++) {
            if (n % size != 0) continue;
            int find = 0;
            int groups = n / size;
            boolean ok = true;
            // peak 여부 확인
            for (int p = 0; p < peaks.size(); p++) {
                if (peaks.get(p) / size > find) {
                    ok = false;
                    break;
                }
                if (peaks.get(p) / size == find) find++;
            }

            if (find != groups) ok = false;
            if (ok) return groups;
        }
        return 0;
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 3, 4, 1, 2, 3, 4, 6, 2};
        Peaks p = new Peaks();
        int res1 = p.solution(a);
        System.out.println("res1 = " + res1);
    }
}
