package me.minikuma.lessons8;

import java.util.HashMap;
import java.util.Map;

public class Dominator {
    public int solution(int[] A) {

        Map<Integer, Integer> memo = new HashMap<>();

        // Dominator 판단 기준
        int half = A.length / 2;

        // 요소가 하나인 경우
        if (A.length == 1) return 0;

        // Dominator 기준 값 세팅 변수
        int dominator = 0;

        // 데이터 저장
        for (int i = 0; i < A.length; i++) {
            memo.put(A[i], memo.getOrDefault(A[i], 0) + 1);
        }

        System.out.println(memo.toString());

        // Dominator 판단 후 변수에 저장
        for (Integer key : memo.keySet()) {
            int temp = memo.get(key);
            if (memo.get(key) > half) {
                dominator = temp;
            }
        }

        // Dominator 등장 횟수
        int count = 0;

        // Dominator 등장 횟수 체크
        for (int i = 0; i < A.length; i++) {
            if (memo.get(A[i]) == dominator) {
                count++;
            }
            if (count >= half) {
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] a1= {3, 4, 3, 2, 3, -1, 3, 3};
        int[] a2 = {-1, 2147483647, -2147483647};
        Dominator d = new Dominator();
        int res1 = d.solution(a1);
        int res2 = d.solution(a2);
        System.out.println("res1 = " + res1);
        System.out.println("res2 = " + res2);
    }
}
