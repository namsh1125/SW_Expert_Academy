/*
    SW Expert Academy 2001. 파리 퇴치
    https://swexpertacademy.com/main/code/problem/problemDetail.do?problemLevel=2&contestProbId=AV5PzOCKAigDFAUq&categoryId=AV5PzOCKAigDFAUq&categoryType=CODE&problemTitle=&orderBy=FIRST_REG_DATETIME&selectCodeLang=ALL&select-1=2&pageSize=10&pageIndex=1

    끝에서 M개라면 +1 해줘야 한다는 사실을 다시 상기한 문제
    ( 끝이 [4], 뒤에서 2개면 [4], [3]. 4 - 2인 2부터가 아니라. )
 */

import java.util.Scanner;

class Solution {
    public static void main(String args[]) throws Exception {

        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for (int test_case = 1; test_case <= T; test_case++) {

            int N = sc.nextInt();
            int M = sc.nextInt();

            // 파리의 개수 입력받기
            int[][] fly = new int[N][N];
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    fly[i][j] = sc.nextInt();
                }
            }

            int max = 0;
            for (int i = 0; i < N - M + 1; i++) {
                for (int j = 0; j < N - M + 1; j++) {

                    // 공간 내 파리의 개수 구하기
                    int sum = 0;

                    for (int k = i; k < i + M; k++) {
                        for (int p = j; p < j + M; p++) {
                            sum = sum + fly[k][p];
                        }
                    }

                    // 최댓값 비교
                    if (max < sum)
                        max = sum;

                }
            }

            // 출력
            System.out.println(String.format("#%d %d", test_case, max));

        }
    }
}
