package me.minikuma.lessons5;

/**
 * [Prefix Sum] Passing Cars (easy)
 * 정수된 배열이 존재한다.
 * 배열은 연속되는 요소로 이루어져 있다.
 * 0의 요소는 동쪽으로 움직임을 나타내고, 1의 요소는 서쪽으로 움직임을 나타낸다.
 * 동쪽에서 서쪽으로 몇 번 움직였는지 구하라.
 * Tip) 전체 탐색으로 하게 되면 시간 초과 O(N^2) -> O(N) 선형탐색으로 만드는게 중요
 */

public class PassingCars {
    public int solution(int[] A) {

        int count = 0;
        int[] pSum = new int[A.length];

        for (int i = 1; i < A.length; i++) {
            pSum[i] = pSum[i - 1] + A[i];
        }
        // prefix sum = 0 1 1 2 3
        // A array    = 0 1 0 1 1
        for (int i = 0; i < A.length; i++) {
            if (count > 1000000000) return -1; // 조건 체크 주의!
            if (A[i] == 0) {
                count += (pSum[A.length - 1] - pSum[i]);
            }
        }
        if (count < 1000000000) {
            return -1;
        }
        return count;
    }

    public static void main(String[] args) {
        int[] in = {0, 1, 0, 1, 1};
        PassingCars p = new PassingCars();
        int result = p.solution(in);
        System.out.println("result = " + result);
    }
}
