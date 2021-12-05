package me.minikuma.lessons16;

public class TieRopes {
    public int solution(int K, int[] A) {
        int ropeLen = 0;
        int count = 0;
        // 인접한 로프
        for (int i = 0; i < A.length; i++) {
            ropeLen += A[i];
            if (ropeLen >= K) {
                count++;
                ropeLen = 0;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int k1 = 4;
        int[] a1 = {1,2,3,4,1,1,3};
        TieRopes t = new TieRopes();
        int res1 = t.solution(k1, a1);
        System.out.println("res1 = " + res1);
    }
}
