/*
    SW Expert Academy 9317. 석찬이의 받아쓰기
    https://swexpertacademy.com/main/code/problem/problemDetail.do?problemLevel=3&contestProbId=AW-hOY5KeEIDFAVg&categoryId=AW-hOY5KeEIDFAVg&categoryType=CODE&problemTitle=&orderBy=PASS_RATE&selectCodeLang=ALL&select-1=3&pageSize=10&pageIndex=2

    이번 문제를 통해 얻은 게 없음.
 */

import java.util.Scanner;

class Solution {
    public static void main(String args[]) throws Exception {

        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for (int test_case = 1; test_case <= T; test_case++) {

            int num = 0;
            int N = sc.nextInt();

            sc.nextLine(); // 개행 문자 제거

            String sentence = sc.nextLine();
            String write = sc.nextLine();

            for (int i = 0; i < N; i++) {
                if (sentence.charAt(i) == write.charAt(i))
                    num++;
            }

            // 출력
            System.out.println(String.format("#%d %d", test_case, num));

        }
    }
}
