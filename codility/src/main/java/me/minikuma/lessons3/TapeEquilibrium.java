package me.minikuma.lessons3;

/*
    배열을 영역별로 잘라서 만든 서브 배열의 계산 값 중에 제일 작은 수
 */

public class TapeEquilibrium {
    public int solution(int[] A) {

        int[] temp = new int[A.length];
        int sum = 0;

        for (int i = 0; i < A.length; i++) {
            sum += A[i];
            temp[i] = sum;
        }
        int min = Integer.MAX_VALUE;
        for (int j = 0; j < A.length - 1; j++) {
            int res = Math.abs(temp[j] - (temp[temp.length - 1] - temp[j]));
            if (min > res) {
                min = res;
            }
        }
        return min;
    }

    public static void main(String[] args) {
        int[] minusNum = {-1000, -900, -100, 0, 100}; // 3, 4, 6, 10 13
        TapeEquilibrium t = new TapeEquilibrium();
        int minusRes = t.solution(minusNum);
        System.out.println("minusRes = " + minusRes);
    }
}
