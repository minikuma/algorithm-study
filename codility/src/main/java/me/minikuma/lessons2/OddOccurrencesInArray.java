package me.minikuma.lessons2;

import java.util.HashMap;
import java.util.Map;
/*
    배열 내 요소는 모두 홀수로 이루어져 있다.
    출현하는 홀수들 중에 짝을 이루지 않는 배열의 요소를 찾아라
 */
public class OddOccurrencesInArray {
    public int solution(int[] A) {
        Map<Integer, Integer> maps = new HashMap<>();

        for (int i = 0; i < A.length; i++) {
            maps.put(A[i], maps.getOrDefault(A[i], 0) + 1);
        }

        System.out.println(maps);

        for (int key : maps.keySet()) {
            if (maps.get(key) % 2 != 0) {
                return key;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] a = {9,3,9,3,9,7,9};
        OddOccurrencesInArray o = new OddOccurrencesInArray();
        int res = o.solution(a);
        System.out.println("res = " + res);
    }
}
