package me.minikuma.lessons6;

import java.util.Arrays;

public class NumberOfDiscIntersections {
    public int solution(int[] A) {
        /*
            교차원
            2개의 원의 위치 관계
            d: 두원의 길이 (중심거리)
            r + r' (반지름 합)
            r - r' (반지름 차)
            r - r' <= d <= r + r'
         */


        int N = A.length;
        long[] upper = new long[N]; // 반지름의 합
        long[] lower = new long[N]; // 반지름의 차

        for (int i = 0; i < N; i++) {
            lower[i] = i - (long) A[i];
            upper[i] = i + (long) A[i];
        }

        Arrays.sort(lower);
        Arrays.sort(upper);

        int interSections = 0;
        int j = 0;

        for (int i = 0; i < N; i++) {
            while (j < N && upper[i] >= lower[j]) {
                interSections += j;
                interSections -= i;
                j++;
            }
        }
        if (interSections > 10000000) return -1;
        return interSections;
    }

    public static void main(String[] args) {
        NumberOfDiscIntersections n = new NumberOfDiscIntersections();
        int[] a = {1,5,2,1,4,0};
        int res = n.solution(a);
        System.out.println("res = " + res);
    }
}
