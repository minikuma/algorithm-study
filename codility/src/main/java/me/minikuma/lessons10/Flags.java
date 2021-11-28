package me.minikuma.lessons10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Flags {
    public int solution(int[] A) {
        if (A.length < 4) return 1;

        // peak point를 먼저 계산
        // 0 < P < N -1, A[P - 1] < A[P] > A[P + 1] = A[P]가 peak point
        List<Integer> lists = new ArrayList<>();
        // A 배열 스캔하면서 Peak Point 구한다
        // O (N)
        for (int i = 1; i < A.length - 1; i++) {
            if (A[i - 1] < A[i] && A[i] > A[i + 1]) {
                lists.add(i);
            }
        }

        // flags 정의
        System.out.println(lists);
        return -1;
    }

    public static void main(String[] args) {
        int[] p1 = {1,5,3,4,3,4,1,2,3,4,6,2};
        Flags f = new Flags();
        int res1 = f.solution(p1);
        System.out.println("res1 = " + res1);
    }
}
