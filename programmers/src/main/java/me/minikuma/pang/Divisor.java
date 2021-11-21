package me.minikuma.pang;

import java.util.Arrays;
/*
    효율성 해결 해야 함
 */
public class Divisor {
    public int[] solution(int[] numbers) {
        int n = numbers.length;
        int[] answer = new int[n];

        for (int i = 0; i < n; i++) {
            answer[i] = numbers[0];
        }
        for (int i = 2; i <= n; i++) {
            for (int j = i; j <= n; j = j + (j / i)) {
                if (j % i == 0) {
                    answer[j - 1] += numbers[i - 1];
                }
            }
        }

//        for (int i = 1; i <= n; i++) {
//            for (int j = 1; j <= i; j++) {
//                if (i % j == 0) {
//                    answer[i - 1] += numbers[j - 1];
//                }
//            }
//        }
        return answer;
    }


    public static void main(String[] args) {
        int[] a1 = {5, 8, 2, 7, 6, 1};
        int[] a2 = {3, 5, 9};

        Divisor d = new Divisor();
        int[] res1 = d.solution(a1);
        System.out.println("res1 = " + (Arrays.toString(res1)));
        int[] res2 = d.solution(a2);
        System.out.println("res2 = " + (Arrays.toString(res2)));
    }
}
