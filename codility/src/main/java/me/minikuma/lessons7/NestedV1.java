package me.minikuma.lessons7;

import java.util.Stack;

public class NestedV1 {
    public int solution(String S) {
        if (S.isEmpty()) return 1;
        Stack<Character> braket = new Stack<>();
        char[] str = S.toCharArray();

        for (char c : str) {
            if (braket.isEmpty()) {
                braket.push(c);
                continue;
            }
            if ('(' == braket.peek() && ')' == c) {
                braket.pop();
            } else {
                braket.push(c);
            }
        }
        return (braket.isEmpty()) ? 1 : 0;
    }
}
