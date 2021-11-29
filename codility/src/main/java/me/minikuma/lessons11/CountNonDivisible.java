package me.minikuma.lessons11;

import java.util.Arrays;

public class CountNonDivisible {
    public int[] solution(int[] A) {
        // O (N ** 2)
        int[] count = new int[2 * A.length + 1];
        for (int i = 0; i < A.length; i++) {
            count[A[i]]++;
        }
        //  0  1  2  3  4  5  6  7  8  9  10
        //----------------------------------
        // [0, 1, 1, 2, 0, 0, 1, 0, 0, 0, 0]

        System.out.println(Arrays.toString(count));

        return null;
    }

    public static void main(String[] args) {
        int[] a1 = {3,1,2,3,6};
//        int[] a1 = {3};
        CountNonDivisible cnd = new CountNonDivisible();
        int[] res1 = cnd.solution(a1);
        System.out.println("res1 = " + Arrays.toString(res1));
    }
}
