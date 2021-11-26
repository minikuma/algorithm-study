package me.minikuma.lessons10;
/*
    for loop scan 범위를 줄이는 게 중요한 포인트
    : O(sqrt(N))
 */
public class CountFactors {
    public int solution(int N) {
        if (N == 1) return 1;
        int count = 0;
        int sq = (int) Math.sqrt(N);

        // O (N)
        for (int i = 1; i <= sq; i++) {
//            System.out.println("(i , N) --> " + i + ", " + N + " == " + (N % i));
            if (N % i == 0) {
                count++;
            }
        }
        count *= 2;
        if (sq * sq == N) { // 4, 8, 16 등과 같은 케이스
            count--;
        }
        return count;
    }

    public static void main(String[] args) {
        int n1 = 1;
        int n2 = 3;
        int n3 = 4;
        int n4 = 15;
        int n5 = 40;
        CountFactors c = new CountFactors();
        int res1 = c.solution(n1);
        int res2 = c.solution(n2);
        int res3 = c.solution(n3);
        int res4 = c.solution(n4);
        int res5 = c.solution(n5);
        System.out.println("res1 = " + res1);
        System.out.println("res2 = " + res2);
        System.out.println("res3 = " + res3);
        System.out.println("res4 = " + res4);
        System.out.println("res5 = " + res5);
    }
}
