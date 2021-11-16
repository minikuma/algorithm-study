package me.minikuma.lessons3;

public class FlogJmp {
    public int solution(int X, int Y, int D) {
        // 1, 5, 2
        // 1000, 1000, 1
        return (int) Math.ceil((Y - X) / (double) D);
    }

    public static void main(String[] args) {
        int x = 10;
        int y = 85;
        int d = 30;
        FlogJmp f = new FlogJmp();
        int res = f.solution(x, y, d);
        System.out.println("res = " + res);
    }
}
