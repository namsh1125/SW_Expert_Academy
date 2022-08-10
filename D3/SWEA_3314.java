/*
    SW Expert Academy 3314. 보충학습과 평균
    https://swexpertacademy.com/main/code/problem/problemDetail.do?problemLevel=3&contestProbId=AWBnA2jaxDsDFAWr&categoryId=AWBnA2jaxDsDFAWr&categoryType=CODE&problemTitle=&orderBy=PASS_RATE&selectCodeLang=ALL&select-1=3&pageSize=10&pageIndex=3

    이번 문제를 통해 얻은 게 없음.
 */

import java.util.Scanner;

class Solution {

    public static void main(String args[]) throws Exception {

        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for (int test_case = 1; test_case <= T; test_case++) {

            int sum = 0;

            for (int i = 0; i < 5; i++) {
                int score = sc.nextInt();
                sum += score >= 40 ? score : 40;
            }

            // 출력
            System.out.println(String.format("#%d %d", test_case, (int) sum / 5));
        }
    }
}
