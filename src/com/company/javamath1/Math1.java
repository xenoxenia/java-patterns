package com.company.javamath1;

public class Math1 {
    public static int recursion(int l, int sum, int k, int s) {
        if (l == k) {
            if (sum == s) {
                return 1;
            } else {
                return 0;
            }
        }
        int c = (l == 0 ? 1 : 0);
        int res = 0;
        for (int i = c; i < 10; i++) {
            res += recursion(l + 1, sum + i, k, s);
        }
        return res;
    }
    public static void main(String[] args) {
        System.out.println(recursion(0, 0, 3, 15));
    }
}
