package me.minikuma.lessons7;

import java.util.Stack;

/**
 *  스택에서 유명한 브라켓 문제
 */
public class Brackets {
    public int solution(String S) {
        if (S.length() == 0) return 1; // 빈 문자열 체크
        char[] arr = S.toCharArray();
        Stack<Character> stacks = new Stack<>();

        // "(", "{", "[", "]", "}" and/or ")"
        for (int i = 0; i < arr.length; i++) {
            // push "(", "{", "["
            if (arr[i] == '(' || arr[i] == '{' || arr[i] == '[') {
                stacks.push(arr[i]);
            } else {
                if (stacks.isEmpty()) return 0; // 빈 스택 체크

                if (arr[i] == ')' && stacks.peek() == '(') {
                    stacks.pop();
                }
                if (arr[i] == '}' && stacks.peek() == '{') {
                    stacks.pop();
                }
                if (arr[i] == ']' && stacks.peek() == '[') {
                    stacks.pop();
                }
            }
            // pop "]", "}" and/or ")"
        }

        if (stacks.isEmpty()) {
            return 1;
        }
        return 0;
    }

    public static void main(String[] args) {
        Brackets b = new Brackets();
        String s1 = "{[()()]}";
        String s2 = "([)()]";
        int s1Res = b.solution(s1);
        int s2Res = b.solution(s2);
        System.out.println("s1Res = " + s1Res);
        System.out.println("s2Res = " + s2Res);
    }
}
