package me.minikuma.lessons12;

public class ChocolatesByNumbers {

    public int solution(int N, int M) {
        // (X + M) / N == 0 이 되는 값 10 / 4
        return N / gcd(N, M);
    }
    // 최대 공약수
    private int gcd(int n, int m) {
        if (n % m == 0) {
            return m;
        } else {
            return gcd(m, n % m);
        }
    }


    public static void main(String[] args) {
        int n1 = 10;
        int m1 = 4;
        int n2 = 1000000000;
        int m2= 1;
        int n3 = 415633212;
        int m3 = 234332;

        ChocolatesByNumbers cb = new ChocolatesByNumbers();
        int res1 = cb.solution(n1, m1);
        int res2 = cb.solution(n2, m2);
        int res3 = cb.solution(n3, m3);
        System.out.println("res1 = " + res1);
        System.out.println("res2 = " + res2);
        System.out.println("res3 = " + res3);
    }
}
