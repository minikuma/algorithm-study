package me.minikuma.lessons5;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class GenomicRangeQueryV1 {
    public int[] solution(String S, int[] P, int[] Q) {

        Map<Character, Integer> maps = new HashMap<>();
        maps.put('A', 1);
        maps.put('C', 2);
        maps.put('G', 3);
        maps.put('T', 4);

        System.out.println("maps = " + maps);

        // O (n * m) - time out
        int left = 0;
        int right = 0;
        int min = Integer.MAX_VALUE;
        int[] res = new int[P.length];

        for (int i = 0; i < P.length; i++) {
            left = P[i]; // 2
            right = Q[i]; // 4
            // 0 1  2 3 4  5 6
            // C A [G C C] T A

            while (left <= right) {
                min = Math.min(min, maps.get(S.charAt(right)));
                right--;
            }
            res[i] = min;
            min = Integer.MAX_VALUE;
        }
        return res;
    }

    public static void main(String[] args) {
        String s1 = "CAGCCTA";
        int[] p1 = {2,5,0};
        int[] q1 = {4,5,6};
        GenomicRangeQueryV1 gv1 = new GenomicRangeQueryV1();
        int[] res1 = gv1.solution(s1, p1, q1);
        System.out.println("res1 = " + Arrays.toString(res1));
    }

}
