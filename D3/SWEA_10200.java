/*
    SW Expert Academy 10200. 구독자 전쟁
    https://swexpertacademy.com/main/code/problem/problemDetail.do?problemLevel=3&contestProbId=AXMCXV_qVgkDFAWv&categoryId=AXMCXV_qVgkDFAWv&categoryType=CODE&problemTitle=&orderBy=PASS_RATE&selectCodeLang=ALL&select-1=3&pageSize=10&pageIndex=5

    이번 문제를 통해 얻은 게 없음.
 */


import java.util.Scanner;

class Solution {

    public static void main(String args[]) throws Exception {

        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for (int test_case = 1; test_case <= T; test_case++) {

            int N = sc.nextInt();
            int A = sc.nextInt();
            int B = sc.nextInt();

            int min = 0, max = 0;

            min = A + B - N < 0 ? 0 : A + B - N;
            max = A > B ? B : A;

            // 출력
            System.out.println(String.format("#%d %d %d", test_case, max, min));

        }
    }
}
