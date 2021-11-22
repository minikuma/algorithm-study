package me.minikuma.lessons7;

import java.util.Stack;

public class StoneWall {
    public int solution(int[] H) {
        Stack<Integer> stack = new Stack<>();

        int cnt = 0;

        for (int i = 0; i < H.length; i++) {
            while (!stack.isEmpty() && stack.peek() > H[i]) {
                stack.pop();
            }
            if (stack.isEmpty() || stack.peek() < H[i]) {
                stack.push(H[i]);
                cnt++;
            }
            System.out.println("i  = " + i + " :: " + stack.toString() + " == " + cnt);
        }
        return cnt;
    }

    public static void main(String[] args) {
        int[] h = {8,8,5,7,9,8,7,4,8};
        StoneWall s = new StoneWall();
        int res = s.solution(h);
        System.out.println("res = " + res);
    }
}
