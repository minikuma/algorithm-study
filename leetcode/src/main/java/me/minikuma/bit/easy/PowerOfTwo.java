package me.minikuma.bit.easy;

/*
   231. Power of Two
   Given an integer n, return true if it is a power of two. Otherwise, return false.
   An integer n is a power of two, if there exists an integer x such that n == 2^x.
   (Idea)

 */
public class PowerOfTwo {

    public boolean isPowerOfTwo(int n) {
        if (n < 1) return false;
//        double log = getLog(n, 2);
//        double d = log - (int) log;
//        if (d > 0.0) {
//            return false;
//        }
//        return true;
//        return Integer.bitCount(n) == 1;
        return (n & (n - 1)) == 0;
    }

    private double getLog(double x, double base) {
        return Math.log10(x) / Math.log10(base);
    }

    public static void main(String[] args) {
        int n1 = 0;
        int n2 = 1;
        int n3 = 10;
        int n4 = 8;
        int n5 = 7;
        PowerOfTwo p = new PowerOfTwo();
        boolean res1 = p.isPowerOfTwo(n1);
        boolean res2 = p.isPowerOfTwo(n2);
        boolean res3 = p.isPowerOfTwo(n3);
        boolean res4 = p.isPowerOfTwo(n4);
        boolean res5 = p.isPowerOfTwo(n5);
        System.out.println("res1 = " + res1);
        System.out.println("res2 = " + res2);
        System.out.println("res3 = " + res3);
        System.out.println("res4 = " + res4);
        System.out.println("res5 = " + res5);
    }
}
