/*
    SW Expert Academy 1986. 지그재그 숫자
    https://swexpertacademy.com/main/code/problem/problemDetail.do?problemLevel=2&contestProbId=AV5PxmBqAe8DFAUq&categoryId=AV5PxmBqAe8DFAUq&categoryType=CODE&problemTitle=&orderBy=FIRST_REG_DATETIME&selectCodeLang=ALL&select-1=2&pageSize=10&pageIndex=1

    이번 문제를 통해 얻은 게 없음.

 */

import java.util.Scanner;

class Solution {
    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        for (int test_case = 1; test_case <= T; test_case++) {
            int sum = 0;

            int num = sc.nextInt();
            for (int i = 1; i <= num; i++) {
                if (i % 2 == 0)
                    sum = sum - i;
                else
                    sum = sum + i;
            }

            // 출력
            System.out.println(String.format("#%d %d", test_case, sum));

        }
    }
}
