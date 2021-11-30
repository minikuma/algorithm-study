package me.minikuma.lessons12.v1;

import java.util.ArrayList;
import java.util.List;

/**
 * 소인수 분해 (유클리드 호제법)
 */
public class CommonPrimeDivisorsV1 {
    public int solution(int[] A, int[] B) {
        List<Integer> ap = new ArrayList<>();
        List<Integer> bp = new ArrayList<>();

        int count = 0;

        for (int i = 0; i < A.length; i++) {
            // A 기준 소인수 분해
            int a = A[i];
            int aIdx = 2;
            int bIdx = 2;

            while (aIdx <= a) {
                if (a % aIdx == 0) {
                    a /= aIdx;
                    if (!ap.contains(aIdx)) {
                        ap.add(aIdx);
                    }
                } else {
                    aIdx++;
                }
            }
            // B 기준 소인수 분해
            int b = B[i]; // 15
            while (bIdx <= b) {
                if (b % bIdx == 0) {
                    b /= bIdx;
                    if (!bp.contains(bIdx)) {
                        bp.add(bIdx);
                    }
                } else {
                    bIdx++;
                }
            }
            if (ap.equals(bp)) {
                count++;
            }
            ap.clear();
            bp.clear();

        }
        return count;
    }

    public static void main(String[] args) {
        int[] a1 = {7, 17, 5, 3};
        int[] b1 = {7, 11, 5, 2};
        CommonPrimeDivisorsV1 cp = new CommonPrimeDivisorsV1();
        int res1 = cp.solution(a1, b1);
        System.out.println("res1 = " + res1);
    }
}
