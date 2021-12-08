package me.minikuma.lessons3;

/**
 * 각 요소는 유일한 값 (1 ~ N + 1)
 * bit (xor) 연산으로 Missing Element 찾는다.
 */
public class PermMissingElemV1 {
    public int solution(int[] A) {
        int bit = 0;
        for (int i = 0; i < A.length; i++) {
            bit = bit ^ A[i];
        }
        System.out.println("bit = " + bit);

        // 1 ~ N + 1 탐색
        for (int i = 1; i <= A.length + 1; i++) {
            bit = bit ^ i;
        }
        return bit;
    }

    public static void main(String[] args) {
        int[] a1 = {2, 3, 1, 5};
        PermMissingElemV1 p = new PermMissingElemV1();
        int res1 = p.solution(a1);
        System.out.println("res1 = " + res1);
    }
}
