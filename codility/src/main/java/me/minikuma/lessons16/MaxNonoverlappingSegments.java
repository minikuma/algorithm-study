package me.minikuma.lessons16;

public class MaxNonoverlappingSegments {
    public int solution(int[] A, int[] B) {
        int n = A.length;
        int count = 1; // 최초 범위도 포함되어야 한다.

        if (n < 1) {
            return 0;
        }

        int currenctEnd = B[0]; // 빈배열이 들어올수 있어서 조심해야 함!

        for (int i = 1; i < n; i++) {
            if (A[i] > currenctEnd) {
                count++;
                currenctEnd = B[i];
            }
        }
        return count;
    }

    static class Point {
        int start;
        int end;
        public Point(int start, int end) {
            this.start = start;
            this.end = end;
        }
    }

    public static void main(String[] args) {
        int[] a1 = {1,3,7,9,9};
        int[] b1 = {5,6,8,9,10};
        MaxNonoverlappingSegments m = new MaxNonoverlappingSegments();
        int res1 = m.solution(a1, b1);
        System.out.println("res1 = " + res1);
    }
}
