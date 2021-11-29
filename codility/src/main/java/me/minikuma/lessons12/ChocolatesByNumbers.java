package me.minikuma.lessons12;

public class ChocolatesByNumbers {
    public int solution(int N, int M) {
        // (X + M) %  N
        int count = 0;
        int X = 0;
        do {
            X = (X + M) % N;
            count++;
        } while (X != 0);
        return count;
    }


    public static void main(String[] args) {
        int n1 = 10;
        int m1 = 4;

        ChocolatesByNumbers cb = new ChocolatesByNumbers();
        int res1 = cb.solution(n1, m1);
        System.out.println("res1 = " + res1);
    }
}
