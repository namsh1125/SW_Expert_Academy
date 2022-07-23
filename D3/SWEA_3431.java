/*
    SW Expert Academy 3431. 준환이의 운동관리
    https://swexpertacademy.com/main/code/problem/problemDetail.do?problemLevel=3&contestProbId=AWE_ZXcqAAMDFAV2&categoryId=AWE_ZXcqAAMDFAV2&categoryType=CODE&problemTitle=&orderBy=PASS_RATE&selectCodeLang=ALL&select-1=3&pageSize=10&pageIndex=1

    이번 문제를 통해 얻은 게 없음.
 */


import java.util.Arrays;
import java.util.Scanner;

class Solution {
    public static void main(String args[]) throws Exception {

        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for (int test_case = 1; test_case <= T; test_case++) {

            int L = sc.nextInt();
            int U = sc.nextInt();
            int X = sc.nextInt();

            int result = 0;

            if (X > U)
                result = -1;
            else if (X >= L && X <= U)
                result = 0;
            else
                result = L - X;


            // 출력
            System.out.println(String.format("#%d %d", test_case, result));

        }
    }
}
