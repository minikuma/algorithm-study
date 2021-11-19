package me.minikuma.pang;

import java.util.HashMap;
import java.util.Map;

public class MajorityNumber {
    public int solution(int[] N) {
        int m = N.length / 2; // 과반수 기준 8/2 = 4

        Map<Integer, Integer> maps = new HashMap<>();

        for (int key : N) {
            maps.put(key, maps.getOrDefault(key, 0) + 1);
        }

        System.out.println(maps.toString());

        for (int k : maps.keySet()) {
            if (maps.get(k) > m) {
                return k;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] num1 = {6,1,6,6,7,6,6,7}; // 6
        int[] num2 = {6,1,6,6,7,5,6,7}; // -1
        MajorityNumber m = new MajorityNumber();
        int res1 = m.solution(num1);
        int res2 = m.solution(num2);
        System.out.println("res1 = " + res1);
        System.out.println("res2 = " + res2);
    }
}
