/*
    SW Expert Academy 5601. [Professional] 쥬스 나누기
    https://swexpertacademy.com/main/code/problem/problemDetail.do?problemLevel=3&contestProbId=AWXGAylqcdYDFAUo&categoryId=AWXGAylqcdYDFAUo&categoryType=CODE&problemTitle=&orderBy=PASS_RATE&selectCodeLang=ALL&select-1=3&pageSize=10&pageIndex=2

    이번 문제를 통해 얻은 게 없음. 독해력을 시험하는 문제 같았음
 */

import java.util.Scanner;

class Solution {
    public static void main(String args[]) throws Exception {

        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for (int test_case = 1; test_case <= T; test_case++) {

            int N = sc.nextInt();

            // 출력
            System.out.print("#" + test_case + " ");
            for (int i = 0; i < N; i++)
                System.out.print("1/" + N + " ");

            System.out.println();
        }
    }
}
