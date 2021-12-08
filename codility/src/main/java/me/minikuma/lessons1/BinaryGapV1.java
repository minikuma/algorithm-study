package me.minikuma.lessons1;

import java.util.Stack;

/**
 * 양의 정수 (n)를 이진수로 표현할 때 연속되는 0의 갯수가 최대인 경우를 계산
 * 예) 10001001 -> 3
 * (idea) stack 자료 구조로 해결
 */
public class BinaryGapV1 {
    public int solution(int N) {
        // 이진수로 변경
        String bi = Integer.toBinaryString(N);
        System.out.println(N + " : 이진수로 변경된 수: " + bi);

        // array 로 변경
        char[] toCharArray = bi.toCharArray();

        Stack<Integer> stack = new Stack<>();

        // 10000010001
        for (int i = 0; i < toCharArray.length; i++) {
            if (toCharArray[i] == '1') {
                stack.push(i);
            }
        }
        // stack 확인
        System.out.println("stack data : " + stack);

        int maxVal = 0;

        // 1 이 한번만 등장함 -> 10000000 이런 케이스 처리
        if (stack.size() < 2) {
            return 0;
        }

        for (int i = 0; i < stack.size() - 1; i++) {
            maxVal = Math.max((stack.elementAt(i + 1) - stack.elementAt(i)), maxVal);
        }

        return maxVal - 1;
    }

    public static void main(String[] args) {
        int n1 = 1041;
        int n2 = 32;
        int n3 = 10;
        int n4 = 2;
        BinaryGapV1 bg = new BinaryGapV1();
        int res1 = bg.solution(n1);
        int res2 = bg.solution(n2);
        int res3 = bg.solution(n3);
        int res4 = bg.solution(n4);
        System.out.println("res1 = " + res1);
        System.out.println("res2 = " + res2);
        System.out.println("res3 = " + res3);
        System.out.println("res4 = " + res4);
    }
}
