/*
    SW Expert Academy 1976. 시각 덧셈
    https://swexpertacademy.com/main/code/problem/problemDetail.do?problemLevel=2&contestProbId=AV5PttaaAZIDFAUq&categoryId=AV5PttaaAZIDFAUq&categoryType=CODE&problemTitle=&orderBy=FIRST_REG_DATETIME&selectCodeLang=ALL&select-1=2&pageSize=10&pageIndex=2

    이번 문제를 통해 얻은 게 없음.
 */

import java.util.Scanner;

class Solution {

    public static void main(String args[]) throws Exception {

        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for (int test_case = 1; test_case <= T; test_case++) {

            int[] num = new int[4];

            for (int i = 0; i < 4; i++) {
                num[i] = sc.nextInt();
            }

            int h = num[0] + num[2];
            int m = num[1] + num[3];

            if (m >= 60) {
                h++;
                m = m - 60;
            }

            if (h > 12) {
                h = h - 12;
            }

            // 출력
            System.out.println(String.format("#%d %d %d", test_case, h, m));
        }
    }
}
