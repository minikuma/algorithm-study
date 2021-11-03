package me.minikuma.lessons5;

/**
 * [Prefix Sums] CountDiv - medium
 * 3개의 입력값이 주어진다.
 * 입력 값은 각각 정수 A, B, K 이다.
 * [A...B] 범위에 존재하는 수 중에 K로 나누어 떨어지는 수의 개수를 구하라.
 */
public class CountDiv {
    public int solution(int A, int B, int K) {
        int tc = B / K;
        int pc = (A - 1) / K;
        if (A == 0) {
            return tc + 1;
        } else {
            return tc - pc;
        }
    }

    public static void main(String[] args) {
        CountDiv cd = new CountDiv();
        int A = 0, B = 111111, K = 4;
        int result = cd.solution(A, B, K);
        System.out.println("result = " + result);
    }
}
