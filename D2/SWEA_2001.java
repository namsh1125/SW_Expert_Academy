/*
    SW Expert Academy 2001. 파리 퇴치
    https://swexpertacademy.com/main/code/problem/problemDetail.do?problemLevel=1&problemLevel=2&contestProbId=AV5PzOCKAigDFAUq&categoryId=AV5PzOCKAigDFAUq&categoryType=CODE&problemTitle=&orderBy=INQUERY_COUNT&selectCodeLang=ALL&select-1=2&pageSize=10&pageIndex=1

    10개의 test case 중 5개 정답
 */

import java.util.Scanner;

class Solution {
    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        for (int test_case = 1; test_case <= T; test_case++) {

            int N = sc.nextInt();
            int M = sc.nextInt();

            // 파리의 개수 입력 받기
            int[][] fly = new int[N][N];
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    fly[i][j] = sc.nextInt();
                }
            }

            int max = 0;
            for (int i = 0; i < N; i++) {

                for (int j = 0; j < N; j++) {

                    if (i + M >= N || j + M >= N) //overflow
                        continue;

                    int sum = 0;

                    for (int k = i; k < i + M; k++) {
                        for (int p = j; p < j + M; p++) {
                            sum = sum + fly[k][p];
                        }
                    }

                    if (max < sum)
                        max = sum;

                }
            }


            // 출력
            System.out.println(String.format("#%d %d", test_case, max));

        }
    }
}
