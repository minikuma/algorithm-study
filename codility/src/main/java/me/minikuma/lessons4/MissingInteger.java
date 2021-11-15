package me.minikuma.lessons4;

import java.util.HashSet;
import java.util.Set;

public class MissingInteger {
    /*
    *   등장하지 않는 수는 Hash 구조를 생각해 볼것.
    *   중복을 허용하지 않는다.
    * */
    public int solution(int[] A) {
        Set<Integer> sets = new HashSet<>();

        for (int i = 0; i < A.length; i++) {
            sets.add(A[i]);
        }

        for (int i = 1; i < Integer.MAX_VALUE; i++) {
            if (!sets.contains(i)) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] a = {1, 3, 6, 4, 1, 2};
        int[] b = {-1, -2, -3};
        int[] c = {-1, -2 ,0, 1, 2};
        int[] d = {1, 2, 3, 4};

        MissingInteger m = new MissingInteger();
        System.out.println("a_res = " + m.solution(a));
        System.out.println("b_res = " + m.solution(b));
        System.out.println("c_res = " + m.solution(c));
        System.out.println("d_res = " + m.solution(d));
    }
}
