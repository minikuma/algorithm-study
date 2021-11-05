package me.minikuma.lessons5;

import java.util.*;

public class GenomicRangeQuery {
    public int[] solution(String S, int[] P, int[] Q) {
    /*
        P[0] = 2    Q[0] = 4
        P[1] = 5    Q[1] = 5
        P[2] = 0    Q[2] = 6
     */
        int M = P.length;
        int size = S.length();

        int[] result = new int[M];
        int[] a = new int[size + 1];
        int[] c = new int[size + 1];
        int[] g = new int[size + 1];

        for (int i = 0; i < size; i++) {
            if (S.charAt(i) == 'A') {
                a[i + 1] = a[i] + 1;
                c[i + 1] = c[i];
                g[i + 1] = g[i];
            } else if (S.charAt(i) == 'C') {
                a[i + 1] = a[i];
                c[i + 1] = c[i] + 1;
                g[i + 1] = g[i];
            } else if (S.charAt(i) == 'G') {
                a[i + 1] = a[i];
                c[i + 1] = c[i];
                g[i + 1] = g[i] + 1;
            } else {
                a[i + 1] = a[i];
                c[i + 1] = c[i];
                g[i + 1] = g[i];
            }
        }

        for (int j = 0; j < M; j++) {
            int start = P[j];
            int end = Q[j] + 1;

            if (a[end] - a[start] > 0) {
                result[j] = 1;
            } else if (c[end] - c[start] > 0) {
                result[j] = 2;
            } else if (g[end] - g[start] > 0) {
                result[j] = 3;
            } else {
                result[j] = 4;
            }
        }
        return result;
    /*
        for (int i = 0; i < M; i++) {
            String str = S.substring(P[i], Q[i] + 1);
            if (str.contains("A")) {
                result[i] = 1;
            } else {
                if (str.contains("C")) {
                    result[i] = 2;
                } else {
                    if (str.contains("G")) {
                        result[i] = 3;
                    } else {
                        result[i] = 4;
                    }
                }
            }
            if (str.contains("A")) {
                result[i] = 1;
            } else if (str.contains("C")) {
                result[i] = 2;
            } else if (str.contains("G")) {
                result[i] = 3;
            } else {
                result[i] = 4;
            }
        }
        return result;
*/
//
//        for (int i = 0; i < P.length; i++) {
//            System.out.println("(" + P[i] + "," + Q[i] + ")");
//            List<Character> t = new ArrayList<>();
//            for (int j = P[i]; j <= Q[i]; j++) {
//                if (!t.contains(S.charAt(j))) {
//                    t.add(S.charAt(j));
//                }
//            }
//            arr.add(t);
//        }
//        arr.forEach(System.out::println);
//
//        int[] result = new int[arr.size()];
//        int min = Integer.MAX_VALUE;
//
//        for (int i = 0; i < arr.size(); i++) {
//            for (int j = 0; j < arr.get(i).size(); j++) {
//                int a = maps.get(arr.get(i).get(j));
//                min = Math.min(min, a);
//            }
//            result[i] = min;
//            min = Integer.MAX_VALUE;
//        }
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
