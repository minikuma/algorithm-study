package me.minikuma.lessons10;

public class CountFactors {
    public int solution(int N) {
        int count = 0;
        for (int i = 2; i <= Math.sqrt(N); i++) {
            while (N % i == 0) {
                count++;
                N /= i;
            }
        }

        if (N != 1) {
            count++;
        }

        return 2 * count;
    }

    public static void main(String[] args) {
        int n1 = 24;
        CountFactors c = new CountFactors();
        int res1 = c.solution(n1);
        System.out.println("res1 = " + res1);
    }
}
