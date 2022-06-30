/*
    SW Expert Academy 1209. [S/W 문제해결 기본] 2일차 - Sum
    https://swexpertacademy.com/main/code/problem/problemDetail.do?problemLevel=3&contestProbId=AV13_BWKACUCFAYh&categoryId=AV13_BWKACUCFAYh&categoryType=CODE&problemTitle=&orderBy=INQUERY_COUNT&selectCodeLang=ALL&select-1=3&pageSize=10&pageIndex=1
    이번 문제를 통해 얻은 게 없음.
 */

import java.util.Scanner;

public class SWEA_1209 {
    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);

        for (int test_case = 1; test_case <= 10; test_case++) {
            int testNumber;
            int[][] num = new int[100][100];
            int max = 0, sum;

            testNumber = sc.nextInt();

            // data를 받아 배열에 저장하기
            for (int i = 0; i < 100; i++) {
                for (int j = 0; j < 100; j++) {
                    num[i][j] = sc.nextInt();
                }
            }

            // 가로줄에서 최댓값 찾기
            for (int i = 0; i < 100; i++) {
                sum = 0;

                for (int j = 0; j < 100; j++) {
                    sum = sum + num[i][j];
                }

                if (sum > max)
                    max = sum;
            }

            // 세로줄에서 최댓값 찾기
            for (int j = 0; j < 100; j++) {
                sum = 0;

                for (int i = 0; i < 100; i++) {
                    sum = sum + num[i][j];
                }

                if (sum > max)
                    max = sum;
            }

            // 오른쪽 아래로 향하는 대각선 줄에서 최댓값 찾기
            sum = 0;
            for (int i = 0; i < 100; i++) {
                sum = sum + num[i][i];
            }

            if (sum > max)
                max = sum;

            // 왼쪽 아래로 향하는 대각선 줄에서 최댓값 찾기
            sum = 0;
            for (int i = 0; i < 100; i++)
                sum = sum + num[i][99 - i];

            if (sum > max)
                max = sum;

            // 결과 출력
            System.out.println(String.format("#%d %d", test_case, max));

        }
    }
}
