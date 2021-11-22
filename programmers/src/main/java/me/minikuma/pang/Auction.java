package me.minikuma.pang;

import java.util.*;

/*
       데이터는 Map 으로 처리
        - 데이터 저장
        - 데이터 히스토리 -> 음수 값 처리를 위해
 */
public class Auction {
    public int[] solution(int n, int[][] record) {

        Map<Integer, Integer> data = new HashMap<>();
        Map<Integer, Integer> currData = new HashMap<>();

        int temp = 0;

        for (int i = 0; i < record.length; i++) {
            temp += record[i][1];

//            for (int j = 0; j < record[i].length; j++) {
//                if (j == 1) {
//                    temp += record[i][j];
//                }
//            }
            // 데이터 처리
            if (data.containsKey(record[i][0])) {
                int rec = data.get(record[i][0]);
                if (temp > 0) {
                    data.put(record[i][0], temp + rec);
                    currData.put(record[i][0], temp);
                } else {
                    data.put(record[i][0], currData.get(record[i][0]));
                }
            } else {
                data.put(record[i][0], temp);
                currData.put(record[i][0], temp);
            }
            temp = 0;
        }

        // 출력용
        data.forEach((key, value) -> {
            System.out.println(key + " : " + value);
        });

        List<Integer> keyData = new ArrayList<>(n);

        // Map Value sorting
        data.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .forEachOrdered(x -> keyData.add(x.getKey()));

        // 정렬 맵 출력
        System.out.println("reverse_key: " + keyData);

        // map to array
        return keyData.stream().mapToInt(Integer::intValue).toArray();
    }

    public static void main(String[] args) {
        int n1 = 3;
        int[][] record1 = {
                {1, 100}, {2, 150}, {3, 300},
                {1, 200}, {2, 250}, {3, 350},
                {2, -1}, {3, -1}, {3, 190}};
        Auction a = new Auction();
        int[] res1 = a.solution(n1, record1);
        System.out.println("res1 = " + Arrays.toString(res1));
    }
}
