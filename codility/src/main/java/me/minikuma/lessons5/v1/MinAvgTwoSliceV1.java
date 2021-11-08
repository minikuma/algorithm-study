package me.minikuma.lessons5.v1;

public class MinAvgTwoSliceV1 {
    public int solution(int[] A) {
        float minAvg = Integer.MAX_VALUE;
        int minIdx = A.length;

        for (int i = 0; i < A.length; i++) {
            int sum = A[i];
            for (int j = i + 1; j < A.length; j++) {
                sum += A[j];
                float avg = (float) sum / (j - i + 1);
//                System.out.println("sum = " + sum + "...." + avg);
                if (minAvg > avg) {
                    minAvg = avg;
                    minIdx = j;
                }
            }
//            System.out.println("==");
        }
        return minIdx;
    }

    public static void main(String[] args) {
        int[] a = {4,2,2,5,1,5,8};
        MinAvgTwoSliceV1 m = new MinAvgTwoSliceV1();
        int res = m.solution(a);
        System.out.println("res = " + res);
    }
}
