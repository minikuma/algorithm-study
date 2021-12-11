package me.minikuma.lessons6;

import java.util.Arrays;

public class NumberOfDiscIntersectionsV1 {
    public int solution(int[] A) {
        // r' - r < d < r' + r (intersection)
        System.out.println("===");

        // 반지름의 합과 차를 미리 구해놓는다. O (N * N)
        int n = A.length;
        long[] upper = new long[n];
        long[] lower = new long[n];

        for (int i = 0; i < n; i++) {
            upper[i] = i + (long) A[i];
            lower[i] = i - (long) A[i];
        }

        Arrays.sort(upper);
        Arrays.sort(lower);

        System.out.println("upper = " + Arrays.toString(upper));
        System.out.println("lower = " + Arrays.toString(lower));


        int interSections = 0;
        int j = 0;

        for (int i = 0; i < n; i++) {
            while (j < n && lower[j] <= upper[i]) {
                // Key Point
                interSections = interSections + j;
                interSections = interSections - i; // 겹치는 원 제외 (자기자신)
                j++;
            }
        }
        if (interSections > 10000000) return -1;

        /*
        for (int i = 0; i < A.length; i++) {
            for (int j = i + 1; j < A.length; j++) {
                long a = j - (long) A[j];
                long b = i + (long) A[i];
                if (a <= b) {
                    System.out.println("i, j = " + i + ", " + j);
                    interSections++;
                }
            }
        }*/

        return interSections;
    }

    public static void main(String[] args) {
        NumberOfDiscIntersectionsV1 n = new NumberOfDiscIntersectionsV1();
        int[] a = {1,5,2,1,4,0};
        int[] b = {1, 2147483647, 0};
        int res = n.solution(a);
        int res1 = n.solution(b);
        System.out.println("res = " + res);
        System.out.println("res1= " + res1);
    }
}
