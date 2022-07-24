/*
    SW Expert Academy 10505. 소득 불균형
    https://swexpertacademy.com/main/code/problem/problemDetail.do?problemLevel=3&contestProbId=AXNP4CvauaMDFAXS&categoryId=AXNP4CvauaMDFAXS&categoryType=CODE&problemTitle=&orderBy=PASS_RATE&selectCodeLang=ALL&select-1=3&pageSize=10&pageIndex=1

    이번 문제를 통해 얻은 게 없음.
 */

import java.util.Scanner;

class Solution {
    public static void main(String args[]) throws Exception {

        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for (int test_case = 1; test_case <= T; test_case++) {

            int N = sc.nextInt();
            int[] income = new int[N];
            int result = 0; // 평균 수입 이하의 사람
            int sum = 0; // 수입의 합
            float avg; // 평균 수입


            for (int i = 0; i < N; i++) {
                income[i] = sc.nextInt();
                sum = sum + income[i];
            }

            avg = (float) sum / N;

            for (int i = 0; i < N; i++) {
                if ((float) income[i] <= avg)
                    result++;
            }


            // 출력
            System.out.println(String.format("#%d %d", test_case, result));

        }
    }
}
