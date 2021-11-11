package me.minikuma.lessons4;

import java.util.HashSet;
import java.util.Set;

public class FrogRiverOne {
    public int solution(int X, int[] A) {
        Set<Integer> sets = new HashSet<>();
        for (int i = 0; i < A.length; i++) {
            sets.add(A[i]);
            if (sets.size() == X) return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] a = {1,3,1,4,2,3,5,4};
        int x = 5;
        FrogRiverOne f = new FrogRiverOne();
        int res = f.solution(x, a);
        System.out.println("res = " + res);
    }
}
