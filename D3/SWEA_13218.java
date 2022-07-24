/*
    SW Expert Academy 13218. 조별과제
    https://swexpertacademy.com/main/code/problem/problemDetail.do?problemLevel=3&contestProbId=AXzjvCCq-PwDFASs&categoryId=AXzjvCCq-PwDFASs&categoryType=CODE&problemTitle=&orderBy=PASS_RATE&selectCodeLang=ALL&select-1=3&pageSize=10&pageIndex=1

    이번 문제를 통해 얻은 게 없음.
 */

import java.util.Scanner;

class Solution {
    public static void main(String args[]) throws Exception {

        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for (int test_case = 1; test_case <= T; test_case++) {

            int N = sc.nextInt();

            // 출력
            System.out.println(String.format("#%d %d", test_case, N / 3));

        }
    }
}
