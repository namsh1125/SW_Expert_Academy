/*
    SW Expert Academy 8658. Summation
    https://swexpertacademy.com/main/code/problem/problemDetail.do?problemLevel=3&contestProbId=AW1lwyh6WPwDFARC&categoryId=AW1lwyh6WPwDFARC&categoryType=CODE&problemTitle=&orderBy=PASS_RATE&selectCodeLang=ALL&select-1=3&pageSize=10&pageIndex=2

    이번 문제를 통해 얻은 게 없음.
 */

import java.util.Scanner;

class Solution {

    public static void main(String args[]) throws Exception {

        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for (int test_case = 1; test_case <= T; test_case++) {

            int min = 0, max = 0;

            for (int i = 0; i < 10; i++) {
                int num = sc.nextInt();

                int sum = 0;
                while (num != 0) {
                    sum = sum + num % 10;
                    num = num / 10;
                }

                if (i == 0) {
                    max = sum;
                    min = sum;
                } else {
                    if (sum > max) {
                        max = sum;
                    } else if (sum < min) {
                        min = sum;
                    }
                }
            }

            // 출력
            System.out.println(String.format("#%d %d %d", test_case, max, min));
        }
    }
}
