package me.minikuma.lessons5.v1;

/**
 * MinAvgTwoSlice - brute force
 */
public class MinAvgTwoSliceV1 {
    public int solution(int[] A) {
        float minAvg = Integer.MAX_VALUE;
        int minIdx = A.length;

        for (int i = 0; i < A.length; i++) {
            int sum = A[i];
            for (int j = i - 1; j >= 0; j--) {
                sum += A[j];
                float avg = (float) sum / (i - j + 1);
                System.out.println("(Q, P) = " + i + "," + j + " => " + sum + " | " + avg);
                if (minAvg > avg) {
                    minAvg = avg;
                    minIdx = j;
                }
            }
            System.out.println("==");
        }
        return minIdx;
    }

    public static void main(String[] args) {
        int[] a = {4,2,2,5,1,5,8};
        int[] b= {-3, -5, -8, -4, -10};
        MinAvgTwoSliceV1 m = new MinAvgTwoSliceV1();
        int res1 = m.solution(a);
        int res2 = m.solution(b);
        System.out.println("res1 = " + res1);
        System.out.println("res2 = " + res2);
    }
}
