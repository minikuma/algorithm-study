package me.minikuma.lessons4;

import java.util.Arrays;

public class MissingInteger {
    /*
    *   음수인 경우 고려 해야 함
    * */
    public int solution(int[] A) {
        Arrays.sort(A);
        int missingNum = 1;
        // 1, 1, 2, 3, 4, 6
        // -1 -2, -3
        for (int i = 0; i < A.length - 1; i++) {
            if (A[i + 1] - A[i] >= 2) {
                missingNum = A[i] + 1;
            }
        }

        return missingNum;
    }

    public static void main(String[] args) {
        int[] a = {1, 3, 6, 4, 1, 2};
        int[] b = {-1, -2 , -3};
        int[] c = {-1, -2 , 1, 3};
        int[] d = {1, 2, 3, 4};


        MissingInteger m = new MissingInteger();
        System.out.println("res = " + m.solution(a));
        System.out.println("res = " + m.solution(b));
        System.out.println("res = " + m.solution(c));
        System.out.println("res = " + m.solution(d));
    }
}
