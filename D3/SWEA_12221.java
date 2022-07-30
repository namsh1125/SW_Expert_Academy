/*
    SW Expert Academy 12221. 구구단2
    https://swexpertacademy.com/main/code/problem/problemDetail.do?problemLevel=3&contestProbId=AXpz3dravpQDFATi&categoryId=AXpz3dravpQDFATi&categoryType=CODE&problemTitle=&orderBy=PASS_RATE&selectCodeLang=ALL&select-1=3&pageSize=10&pageIndex=2

    이번 문제를 통해 얻은 게 없음.
 */

import java.util.Scanner;

class Solution {

    public static void main(String args[]) throws Exception {

        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for (int test_case = 1; test_case <= T; test_case++) {

            int a = sc.nextInt();
            int b = sc.nextInt();
            int result = 0;

            if (a >= 10 || b >= 10)
                result = -1;
            else
                result = a * b;

            // 출력
            System.out.println(String.format("#%d %d", test_case, result));
        }
    }
}
