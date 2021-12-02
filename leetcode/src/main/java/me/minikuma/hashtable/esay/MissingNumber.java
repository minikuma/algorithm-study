package me.minikuma.hashtable.esay;
/*
    268. Missing Number
         Given an array nums containing n distinct numbers in the range [0, n],
         return the only number in the range that is missing from the array.
 */
public class MissingNumber {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        // n * (n + 1) / 2 = 3 * (4) / 2 = 6
        int d = (n * (n + 1)) / 2; // 등차 수열 합
        for (int i = 0; i < n; i++) {
            d -= nums[i];
        }
        return d;
    }

    public static void main(String[] args) {
        int[] n1 = {3, 0, 1};
        int[] n2 = {9,6,4,2,3,5,7,0,1};
        MissingNumber m = new MissingNumber();
        int res1 = m.missingNumber(n1);
        int res2 = m.missingNumber(n2);
        System.out.println("res1 = " + res1);
        System.out.println("res2 = " + res2);
    }
}
