package me.minikuma.lessons13;

import java.util.*;

public class FibFrog {

    final static Map<Integer, Integer> fiboMap = new HashMap<>();

    public int solution(int[] A) {
        int n = A.length;
        // 거리를 미리 계산 해 놓는다.
        for (int i = 0; fibo(i) <= n + 1; i++) {
            fibo(i);
        }
        System.out.println("distance : " + fiboMap);

        List<Integer> fiboList = new ArrayList<>(fiboMap.values());
        Collections.reverse(fiboList); // 큰값부터 작은값으로 정렬

        System.out.println("sorted distance = " + fiboList);

        boolean[] currentArrive = new boolean[n + 1];

        Queue<Point> queue = new LinkedList<>();
        queue.add(new Point(-1, 0)); // 시작점

        while (!queue.isEmpty()) {
            Point currentPoint = queue.poll(); // 먼저들어온 값을 뺀다.

            for (int i = 0; i < fiboList.size(); i++) {
                int nextPoint = currentPoint.startPoint + fiboList.get(i);
                if (nextPoint == n) {
                    return currentPoint.jump + 1;
                }
                if (nextPoint < n && nextPoint >= 0) {
                    if (A[nextPoint] == 1 && !currentArrive[nextPoint]) {
                        currentArrive[nextPoint] = true;
                        Point point = new Point(nextPoint, currentPoint.jump + 1);
                        queue.add(point);
                    }
                }
            }
        }
        return -1;
    }

    static class Point {
        int startPoint;
        int jump;
        public Point(int startPoint, int jump) {
            this.startPoint = startPoint;
            this.jump = jump;
        }
    }

    private int fibo(int num) {
        if (num == 0) return 0;
        if (num == 1) return 1;
        if (fiboMap.containsKey(num)) {
            return fiboMap.get(num);
        }
        fiboMap.put(num, fibo(num - 1) + fibo(num - 2));
        return fiboMap.get(num);
    }

    public static void main(String[] args) {
        int[] a1 = {0,0,0,1,1,0,1,0,0,0,0};
        FibFrog f = new FibFrog();
        int res1 = f.solution(a1);
        System.out.println("res1 = " + res1);
    }
}
