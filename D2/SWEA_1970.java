/*
    SW Expert Academy 1970. 쉬운 거스름돈
    https://swexpertacademy.com/main/code/problem/problemDetail.do?problemLevel=2&contestProbId=AV5PsIl6AXIDFAUq&categoryId=AV5PsIl6AXIDFAUq&categoryType=CODE&problemTitle=&orderBy=FIRST_REG_DATETIME&selectCodeLang=ALL&select-1=2&pageSize=10&pageIndex=2

    이번 문제를 통해 얻은 게 없음.
 */


import java.util.Scanner;

class Solution {

    public static void main(String args[]) throws Exception {

        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for (int test_case = 1; test_case <= T; test_case++) {

            int N = sc.nextInt();
            int[] money = new int[8]; // 5만원, 1만원, 5천원, 1천원, 5백원, 1백원, 50원, 10원

            money[0] = N / 50000;
            N = N % 50000;

            money[1] = N / 10000;
            N = N % 10000;

            money[2] = N / 5000;
            N = N % 5000;

            money[3] = N / 1000;
            N = N % 1000;

            money[4] = N / 500;
            N = N % 500;

            money[5] = N / 100;
            N = N % 100;

            money[6] = N / 50;
            N = N % 50;

            money[7] = N / 10;
            N = N % 10;


            // 출력
            System.out.println("#" + test_case);

            for (int i = 0; i < money.length; i++) {
                System.out.print(money[i] + " ");
            }

            System.out.println();

        }
    }
}
