package me.minikuma.lessons15;
/*
    다시 봐야 함 포인터를 2개 사용, 체크 배열을 별도로 가져감(*)
 */
public class CountDistinctSlices {
    public int solution(int M, int[] A) {
        // 배열 요소 Unique 체크 용
        boolean[] check = new boolean[M + 1];
        int count = 0;
        int front = 0;
        int end = 0;

        while (front < A.length && end < A.length) {
            if (check[A[end]]) {
                check[A[front]] = false;
                front++;
            } else {
                check[A[end]] = true;
                count += (end - front + 1);
                end++;
            }
            if (count > 1000000000) {
                return 1000000000;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int m1 = 6;
        int[] a1 = {3,4,5,5,2};
        CountDistinctSlices cs = new CountDistinctSlices();
        int res1 = cs.solution(m1, a1);
        System.out.println("res1 = " + res1);
    }
}
