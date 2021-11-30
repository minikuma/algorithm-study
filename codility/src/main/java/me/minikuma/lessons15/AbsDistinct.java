package me.minikuma.lessons15;

import java.util.HashSet;
import java.util.Set;

/**
 * 배열의 요소의 절대값을 취했을 때 Unique 한 값을 가지는 배열의 요소의 갯수
 */
public class AbsDistinct {
    public int solution(int[] A) {
        Set<Integer> sets = new HashSet<>();

        for (int i = 0; i < A.length; i++) {
            sets.add(Math.abs(A[i]));
        }
        return sets.size();
    }

    public static void main(String[] args) {
        int[] a1 = {-5, -3, -1, 0, 3, 6};
        int[] a2 = {-1, 0, 1, 1, 1, -1};
        int[] a3 = {-2147483648, -2147483647, 2147483647};
        AbsDistinct a = new AbsDistinct();
        int res1 = a.solution(a1);
        int res2 = a.solution(a2);
        int res3 = a.solution(a3);
        System.out.println("res1 = " + res1);
        System.out.println("res2 = " + res2);
        System.out.println("res3 = " + res3);
    }
}
