package me.minikuma.lessons1;

import java.util.ArrayList;
import java.util.List;

/**
 *  [Iterator] Binary Gap
 *  정수를 이진수로 변경
 *  이진수(문자열) 중 1과 1사이에 존재하는 0의 갯수가 많은 경우를 구한다.
 *  (예) 100001001: 4, 2 개 중 최대 4개
 */

public class BinaryGap {
    public int solution(int N) {
        String bNumber = Integer.toBinaryString(N);
        char[] b = bNumber.toCharArray();
        int max = 0;
        List<Integer> pos = new ArrayList<>();
        for (int i = 0; i < b.length; i++) {
            if (b[i] == '1') {
                pos.add(i);
            }
        }

        if (pos.size() > 0) {
            for (int i = 1; i < pos.size(); i++) { // 1, 2
                int gap = pos.get(i) - pos.get(i - 1) - 1;
                max = Math.max(max, gap);
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int n = 1041; // 1041 32
        BinaryGap bg = new BinaryGap();
        int result = bg.solution(n);
        System.out.println("result = " + result);
    }
}
