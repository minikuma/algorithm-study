package me.minikuma.lessons7;

import java.util.Stack;
/*
    중첩(Nesting) 조건
    1) S 문자열이 빈 문자열인 경우
    2) S가 "(U)" 형식일 때 U 는 중첩 문자
    3) S가 "VW" 형식일 때 V와 W는 중첩 문자
    제약 조건: 배열의 모든 요소는 "(", ")" 만 존재함으로 빈 문자열인 경우만 체크해 준다.
 */

public class Nesting {
    public int solution(String S) {
        int size = S.length();
        if (size == 0) return 1;
        Stack<Character> stack = new Stack<>();

        stack.push(S.charAt(0));

        for (int i = 1; i < size; i++) {
            if (!stack.empty()) {
                if (S.charAt(i) == ')' && stack.peek() == '(') {
                    stack.pop();
                } else {
                    stack.push(S.charAt(i));
                }
            } else {
                stack.push(S.charAt(i));
            }
        }

        if (stack.empty()) {
            return 1;
        }

        return 0;
    }

    public static void main(String[] args) {
        String s1 = "(()(())())";
        String s2 = "";
        String s3 = "";
        Nesting n = new Nesting();
        int res1 = n.solution(s1);
        int res2 = n.solution(s2);
        int res3 = n.solution(s3);
        System.out.println("res1 = " + res1);
        System.out.println("res2 = " + res2);
        System.out.println("res3 = " + res3);
    }
}
