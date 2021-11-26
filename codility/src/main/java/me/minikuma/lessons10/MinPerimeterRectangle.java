package me.minikuma.lessons10;

public class MinPerimeterRectangle {
    public int solution(int N) {
        // N 은 넓이 -> N을 통해 A, B 값의 경우의 수를 알아 낼 수 있음
        // 둘레 길이: 2 * (A + B) 의 최소 값
        // O (N) -> O(sqrt(N)) 정도로 풀어야 함
        if (N == 1) return 2 * (N + N);
        int sq = (int) Math.sqrt(N);
        int min = Integer.MAX_VALUE;
        for (int i = 1; i <= sq; i++) {
            if (N % i == 0) {
                min = Math.min(min,  2 * (i + N/i));
                System.out.println("(a, b) = " + i + ", " + N/i + " == " + 2 * (i + N/i));
            }
        }
        return min;
    }

    public static void main(String[] args) {
        int n0 = 20;
        int n1 = 30;
        int n2 = 25;
        MinPerimeterRectangle m = new MinPerimeterRectangle();
        int res0 = m.solution(n0);
        int res1 = m.solution(n1);
        int res2 = m.solution(n2);
        System.out.println("res0 = " + res0);
        System.out.println("res1 = " + res1);
        System.out.println("res2 = " + res2);
    }
}
