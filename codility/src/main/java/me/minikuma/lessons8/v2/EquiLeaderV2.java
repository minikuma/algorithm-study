package me.minikuma.lessons8.v2;

import me.minikuma.lessons8.v1.EquiLeaderV1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class EquiLeaderV2 {
    public int solution(int[] A) {

        Map<Integer, Integer> hMap = new HashMap<>();

        for (int i = 0; i < A.length; i++) {
            hMap.put(A[i], hMap.getOrDefault(A[i], 0) + 1);
        }

        int half = A.length / 2;
        int leader = 0;

        for (Integer key : hMap.keySet()) {
            int temp = hMap.get(key);
            if (temp > half) {
                leader = key; // leader 숫자
            }
        }

        int[] counter = new int[A.length];

        for (int i = 0; i < A.length; i++) {
            if (A[i] == leader) {
                counter[i] = 1;
            } else {
                counter[i] = 0;
            }
        }

        // [4, 3, 4, 4, 4, 2]
        // [1, 0, 1, 1, 1, 0]

        int count = 0;
        int leftCount = 0;
        int leftLength = 0;
        int rightCount = hMap.get(leader); // Leader 노출 횟수
        int rightLength = A.length;

        for (int i = 0; i < counter.length; i++) {
            leftCount += counter[i];
            rightCount -= counter[i];
            leftLength++;
            rightLength--;

            if ((leftCount > leftLength / 2) && (rightCount > rightLength / 2)) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] a1 = {4, 3, 4, 4, 4, 2};
        int[] a2 = {0,0};
        EquiLeaderV2 e = new EquiLeaderV2();
        int res1 = e.solution(a1);
        int res2 = e.solution(a2);
        System.out.println("res1 = " + res1);
        System.out.println("res2 = " + res2);
    }
}
