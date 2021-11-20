package me.minikuma.pang;
/*
    배열의 크기가 10,000,000 인 경우는 Out Of Memory 가 발생
    2차원 배열을 -> 1차원 배열로 변경할 수 있는 방법이 필요하다.
 */
public class ZigZagMatrix {
    public int solution(int n, int r, int c) {
        int[][] arr = new int[n][n];

        int text = 1;

        // 윗 삼각형
        for (int i = 0; i < n; i++) {
            int cnt = 0;

            if (i % 2 == 0) {
                for (int cc = 0; cc < i + 1; cc++) {
                    arr[i - cnt][cnt] = text++;
                    cnt++;
                }
            } else {
                for (int cc = 0; cc <i + 1; cc++) {
                    arr[cnt][i - cnt] = text++;
                    cnt++;
                }
            }
        }
        // 아래 삼각형
        for (int i = 1; i <= n - 1; i++) {
            int cnt = 0;
            // 짝수
            if ((i + n - 1) % 2 == 0) {
                for (int cc = i; cc < n; cc++) {
                    arr[n - 1 -cnt][i + cnt] = text++;
                    cnt++;
                }
            } else {
                for (int cc = i; cc < n; cc++) {
                    arr[i + cnt][n - 1 - cnt] = text++;
                    cnt++;
                }
            }
        }

        // 출력
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.printf("%3d", arr[i][j]);
            }
            System.out.println();
        }
        return arr[r - 1][c - 1];
    }

    public static void main(String[] args) {
        int n = 5;
        int r = 3;
        int c = 2;
        ZigZagMatrix z = new ZigZagMatrix();
        int res = z.solution(n, r, c);
        System.out.println("res = " + res);
    }
}
