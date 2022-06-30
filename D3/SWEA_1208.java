/*
    SW Expert Academy 1208. [S/W 문제해결 기본] 1일차 - Flatten
    https://swexpertacademy.com/main/code/problem/problemDetail.do?problemLevel=3&contestProbId=AV139KOaABgCFAYh&categoryId=AV139KOaABgCFAYh&categoryType=CODE&problemTitle=&orderBy=INQUERY_COUNT&selectCodeLang=ALL&select-1=3&pageSize=10&pageIndex=1
    이번 문제를 통해 얻은 게 없음.
 */

import java.util.Scanner;

public class SWEA_1208 {
    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);

        for (int test_case = 1; test_case <= 10; test_case++) {
            int[] floor = new int[100];
            int dump;
            int result = 0;

            // 덤프 횟수 받기
            dump = sc.nextInt();

            // data를 받아와 배열에 저장하기
            for (int i = 0; i < 100; i++)
                floor[i] = sc.nextInt();

            // 평탄화 작업하기
            for (int change = 0; change <= dump; change++) {
                int max_position = 0;
                int min_position = 0;

                for (int j = 0; j < 100; j++) {
                    if (floor[max_position] < floor[j])
                        max_position = j;

                    if (floor[min_position] > floor[j])
                        min_position = j;
                }

                if (change == dump) { // 입력받은 덤프가 다 끝난 경우
                    result = floor[max_position] - floor[min_position];
                } else {
                    floor[max_position]--;
                    floor[min_position]++;
                }
            }

            // 결과 출력
            System.out.println(String.format("#%d %d", test_case, result));

        }
    }
}
