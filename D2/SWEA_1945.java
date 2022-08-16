/*
    SW Expert Academy 1945. 간단한 소인수분해
    https://swexpertacademy.com/main/code/problem/problemDetail.do?problemLevel=2&contestProbId=AV5Pl0Q6ANQDFAUq&categoryId=AV5Pl0Q6ANQDFAUq&categoryType=CODE&problemTitle=&orderBy=PASS_RATE&selectCodeLang=ALL&select-1=2&pageSize=10&pageIndex=1

    이번 문제를 통해 얻은 게 없음.
 */

import java.util.Scanner;

class Solution {

    static int num;

    public static void main(String args[]) throws Exception {

        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for (int test_case = 1; test_case <= T; test_case++) {

            num = sc.nextInt();

            int a = getExponent(2);
            int b = getExponent(3);
            int c = getExponent(5);
            int d = getExponent(7);
            int e = getExponent(11);

            System.out.println(String.format("#%d %d %d %d %d %d", test_case, a, b, c, d, e));
        }

    }

    public static int getExponent(int base) {

        int exponent = 0;

        while (num % base == 0) {

            exponent++;
            num = num / base;
        }

        return exponent;
    }
}
