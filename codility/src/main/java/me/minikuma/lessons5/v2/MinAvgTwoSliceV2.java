package me.minikuma.lessons5.v2;

/**
 * MinAvgTwoSlice - 평균의 특징을 알아야 함
 * a <= b 일때, a와 b의 평균은 a + b / 2는 a 이상이다.
 * (a + b) <= (c + d)도 마찬갖지로 (a + b) 이상이다.
 * 원소가 3개인 경우를 처리 한다.
 */

public class MinAvgTwoSliceV2 {
    public int solution(int[] A) {
        int minIdx = 0;
        float minAvg = (A[0] + A[1]) / 2f;

        for (int i = 2; i < A.length; i++) {
            // 3개 원소의 평균
            float avg = (A[i - 2] + A[i - 1] + A[i]) / 3f;
            if (minAvg > avg) {
                minAvg = avg;
                minIdx = i - 2;
            }

            // 2개 원소의 평균
            avg = (A[i - 1] + A[i]) / 2f;
            if (minAvg > avg) {
                minAvg = avg;
                minIdx = i - 1;
            }
        }
        return minIdx;
    }

    public static void main(String[] args) {
        int[] a = {4,2,2,5,1,5,8};
        MinAvgTwoSliceV2 m = new MinAvgTwoSliceV2();
        int res = m.solution(a);
        System.out.println("res = " + res);
    }
}
