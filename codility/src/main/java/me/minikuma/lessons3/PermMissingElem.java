package me.minikuma.lessons3;

import java.util.Arrays;

public class PermMissingElem {
    public int solution(int[] A) {
        if (A.length == 0) return 1; // 빈 배열 케이스

        Arrays.sort(A);

        for (int i = 0; i < A.length; i++) {
           if (i + 1 != A[i]) return i + 1;
        }

        return A.length + 1;
    }

    public static void main(String[] args) {
        int[] empty= {};
        int[] mid = {2,3,1,5};
        int[] end = {1, 2, 3, 4};
        int[] addCase = {2};
        PermMissingElem p = new PermMissingElem();
        int emptyRes = p.solution(empty);
        int midRes = p.solution(mid);
        int endRes = p.solution(end);
        int addRes = p.solution(addCase);

        System.out.println("emptyRes = " + emptyRes); // 1
        System.out.println("midRes = " + midRes); // 4
        System.out.println("endRes = " + endRes); // 5
        System.out.println("addRes = " + addRes); // 1
    }
}
