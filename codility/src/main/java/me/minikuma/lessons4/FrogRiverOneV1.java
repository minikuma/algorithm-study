package me.minikuma.lessons4;

import java.util.HashMap;
import java.util.Map;

public class FrogRiverOneV1 {
    public int solution(int X, int[] A) {
        int n = A.length;
        Map<Integer, Integer> maps = new HashMap<>();
        for (int i = 0; i < n; i++) {
            maps.put(i, A[i]);
            if (maps.size() == X) return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] a1 = {1,3,1,4,2,3,5,4};
        int x = 7;
        FrogRiverOneV1 f1 = new FrogRiverOneV1();
        int res1 = f1.solution(x, a1);
        System.out.println("res1 = " + res1);
    }
}
