package me.minikuma.lessons7;

import java.util.Stack;

public class Fish {
    public int solution(int[] A, int[] B) {
        Stack<Integer> stack = new Stack<>();
        int alive = 0;

        for (int i = 0; i < A.length; i++) {
            // down stream 인 경우 stack 에 Push
            if (B[i] == 1) {
                stack.push(A[i]);
            } else { // up stream 인 경우,
                // stack not empty : battle
                // stack empty : pop (제거)
                while (stack.size() > 0) {
                    if (stack.peek() > A[i]) {
                        break;
                    } else {
                        stack.pop();
                    }
                }
                if (stack.isEmpty()) {
                    alive++;
                }
            }
        }
        return stack.size() + alive;
    }

    public static void main(String[] args) {
        int[] a = {4,3,2,1,5};
        int[] b = {0,1,0,0,0};
        Fish fish = new Fish();
        int res = fish.solution(a, b);
        System.out.println("res = " + res);
    }
}
