package me.minikuma.lessons10;

import java.util.ArrayList;
import java.util.List;

/**
 * 어려운 문제: 구글링을 통해 겨우 이해, 다시 봐야 함
 */
public class Flags {
    public int solution(int[] A) {
        int len = A.length;

        // peak point 를 먼저 계산
        // 0 < P < N -1, A[P - 1] < A[P] > A[P + 1] = A[P]가 peak point
        List<Integer> peaks = new ArrayList<>();
        // A 배열 스캔하면서 Peak Point 구한다
        // O (N)
        for (int i = 1; i < len - 1; i++) {
            if (A[i - 1] < A[i] && A[i] > A[i + 1]) {
                peaks.add(i);
            }
        }

        int pSize = peaks.size();

        if (pSize < 2) {
            return pSize;
        }

        System.out.println(peaks);

        // flags 정의
        int sf = 1;
        int ef = pSize;
        int max = 0;

        while (sf <= ef) {
            int flag = (sf + ef) / 2;
            boolean check = false;
            int used = 0;
            int prevPeak = peaks.get(0);

            for (int i = 0; i < pSize; i++) {
                if (peaks.get(i) >= prevPeak) {
                    used++;
                    prevPeak = peaks.get(i) + flag;
                    if (used == flag) {
                        check = true;
                        break;
                    }
                }
            }

            if (check) {
                max = flag;
                sf = flag + 1;
            } else {
                ef = flag - 1;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] p1 = {1,5,3,4,3,4,1,2,3,4,6,2};
        int[] p2 = {1, 3, 2};
        Flags f = new Flags();
        int res1 = f.solution(p1);
        int res2 = f.solution(p2);
        System.out.println("res1 = " + res1);
        System.out.println("res2 = " + res2);
    }
}
