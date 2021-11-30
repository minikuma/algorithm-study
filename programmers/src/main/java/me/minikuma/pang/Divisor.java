package me.minikuma.pang;

import java.util.*;

/*
    효율성 해결 해야 함
 */
public class Divisor {
    public int[] solution(int[] numbers) {
        // O (sqrt N)
        int size = numbers.length;
        List<Integer> divData = new ArrayList<>();
        Map<Integer, Object> maps = new HashMap<>();

        for (int j = 1; j <= size; j++) {
            int sq = (int) Math.sqrt(j);
            for (int i = 1; i <= sq; i++) {
                if (j % i == 0) {
                    divData.add(i);
                    if (j / i != i) {
                        divData.add(j / i);
                    }
                }
            }
        }

//        lists.sort(Comparator.naturalOrder());

        System.out.println(divData);

//        for (int i = 1; i <= n; i++) {
//            for (int j = 1; j <= i; j++) {
//                if (i % j == 0) {
//                    answer[i - 1] += numbers[j - 1];
//                }
//            }
//        }
        return null;
    }
    public static void main(String[] args) {
        int[] a1 = {5, 8, 2, 7, 6, 1}; // 6
        int[] a2 = {3, 5, 9};

        Divisor d = new Divisor();
        int[] res1 = d.solution(a1);
        System.out.println("res1 = " + (Arrays.toString(res1)));
        int[] res2 = d.solution(a2);
        System.out.println("res2 = " + (Arrays.toString(res2)));
    }
}
