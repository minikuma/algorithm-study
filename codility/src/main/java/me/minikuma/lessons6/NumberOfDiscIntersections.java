package me.minikuma.lessons6;

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
        int interCount = 0;
        for (int i = 0; i < A.length; i++) {
            for (int j = i + 1; j < A.length; j++) {
                int d = j - i;
                int sum = A[i] + A[j];
                int sub = A[j] - A[i];
                if (sub >= d && sum <= d) {
                    interCount++;
                }
            }
        }
        return interCount;
    }

    public static void main(String[] args) {
        NumberOfDiscIntersections n = new NumberOfDiscIntersections();
        int[] a = {1,5,2,1,4,0};
        int res = n.solution(a);
        System.out.println("res = " + res);
    }
}
