package me.minikuma.hash;

import java.util.HashMap;
import java.util.Map;

public class Marathon {
    public String solution(String[] participant, String[] completion) {

        Map<String, Integer> pMap = new HashMap<>();

        for (String s : participant) {
            pMap.put(s, pMap.getOrDefault(s, 0) + 1);
        }

        // 참여자
        System.out.println("참여자: " + pMap.entrySet().toString());

        for (String s : completion) {
            if (pMap.containsKey(s)) {
                pMap.replace(s, pMap.get(s) - 1);
            }
        }

        System.out.println("마라톤 결과 = " + pMap.entrySet().toString());

        for (String key : pMap.keySet()) {
            if (pMap.get(key) > 0) {
                return key;
            }
        }
        return "";
    }

    public static void main(String[] args) {
        String[] p1 = {"leo", "kiki", "eden"};
        String[] c1 = {"eden", "kiki"};

        String[] p2 = {"marina", "josipa", "nikola", "vinko", "filipa"};
        String[] c2 = {"josipa", "filipa", "marina", "nikola"};

        String[] p3 = {"mislav", "stanko", "mislav", "ana"};
        String[] c3 = {"stanko", "ana", "mislav"};

        Marathon m = new Marathon();
        String res1 = m.solution(p1, c1);
        System.out.println("res1 = " + res1);
        String res2 = m.solution(p2, c2);
        System.out.println("res2 = " + res2);
        String res3 = m.solution(p3, c3);
        System.out.println("res3 = " + res3);
    }
}
