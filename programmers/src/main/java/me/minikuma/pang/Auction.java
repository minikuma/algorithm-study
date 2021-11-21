package me.minikuma.pang;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
/*
    미 해결 문제
 */
public class Auction {
    public int[] solution(int n, int[][] record) {
        int[] answer = {};
        Map<Integer, Integer> maps = new HashMap<>();

        int temp = 0;

        for (int i = 0; i < record.length; i++) {
            for (int j = 0; j < record[i].length; j++) {
                if (j == 1) {
                    temp += record[i][j];
                }
            }
            if (maps.containsKey(record[i][0])) {
                int oldKey = maps.get(record[i][0]);
                if (temp > 0) {
                    maps.put(record[i][0], temp + oldKey);
                } else {
                    maps.put(record[i][0], oldKey);
                }
            } else {
                maps.put(record[i][0], temp);
            }
            temp = 0;
        }

        maps.forEach((key, value) -> {
            System.out.println(key + " : " + value);
        });

        return answer;
    }

    public static void main(String[] args) {
        int n = 3;
        int[][] record = {{1, 100},{2, 150}, {3, 300}, {1, 200}, {2, 250}, {3, 350}, {2, -1}, {3, -1}, {3, 190}};
        Auction a = new Auction();
        int[] res = a.solution(n, record);
        System.out.println("res = " + Arrays.toString(res));
    }
}
