package me.minikuma.lessons5;

import java.util.*;

public class GenomicRangeQuery {
    public int[] solution(String S, int[] P, int[] Q) {
        Map<Character, Integer> maps = new HashMap<>();
        maps.put('A', 1);
        maps.put('C', 2);
        maps.put('G', 3);
        maps.put('T', 4);

        List<List<Character>> arr = new ArrayList<>();
    /*
        P[0] = 2    Q[0] = 4
        P[1] = 5    Q[1] = 5
        P[2] = 0    Q[2] = 6
     */
        for (int i = 0; i < P.length; i++) {
            System.out.println("(" + P[i] + "," + Q[i] + ")");
            List<Character> t = new ArrayList<>();
            for (int j = P[i]; j <= Q[i]; j++) {
                if (!t.contains(S.charAt(j))) {
                    t.add(S.charAt(j));
                }
            }
            arr.add(t);
        }
        arr.forEach(System.out::println);

        int[] result = new int[arr.size()];
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < arr.size(); i++) {
            for (int j = 0; j < arr.get(i).size(); j++) {
                int a = maps.get(arr.get(i).get(j));
                min = Math.min(min, a);
            }
            result[i] = min;
            min = Integer.MAX_VALUE;
        }

        return result;
    }

    public static void main(String[] args) {
        GenomicRangeQuery genomicRangeQuery = new GenomicRangeQuery();
        String s = "CAGCCTA";
        int[] p = {2, 5, 0};
        int[] q = {4, 5, 6};
        int[] result = genomicRangeQuery.solution(s, p, q);
        System.out.println("result = " + Arrays.toString(result));
    }
}
