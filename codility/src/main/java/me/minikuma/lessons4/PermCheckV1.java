package me.minikuma.lessons4;

public class PermCheckV1 {
    public int solution(int[] A) {
        int n = A.length;
        int bit = 0;
        for (int i = 0; i < n; i++) {
            bit = bit ^ A[i];
        }

        System.out.println("bit sum = " + bit);

        for (int i = 1; i <= n; i++) {
            bit = bit ^ i;
        }
        System.out.println(bit);

        return bit == 0 ? 1 : 0;
    }

    public static void main(String[] args) {
        int[] a = {4,1,3,2};
        int[] b = {1,3,2};
        int[] c = {1,3,2,5,6};
        PermCheckV1 p = new PermCheckV1();
        int aRes = p.solution(a);
        int bRes = p.solution(b);
        int cRes = p.solution(c);
        System.out.println("aRes = " + aRes);
        System.out.println("bRes = " + bRes);
        System.out.println("cRes = " + cRes);
    }
}
