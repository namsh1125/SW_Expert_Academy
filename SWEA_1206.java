/*
    SW Expert Academy 1206. [S/W 문제해결 기본] 1일차 - View
    https://swexpertacademy.com/main/code/problem/problemDetail.do?problemLevel=3&contestProbId=AV134DPqAA8CFAYh&categoryId=AV134DPqAA8CFAYh&categoryType=CODE&problemTitle=&orderBy=INQUERY_COUNT&selectCodeLang=ALL&select-1=3&pageSize=10&pageIndex=1&&&&&&&&&&

    이번 문제를 통해 얻은 게 없음.
 */

import java.util.Scanner;

public class SWEA_1206 {
    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);

        for (int test_case = 1; test_case <= 10; test_case++) {
            int household = 0; // 조망권이 확보된 세대의 수
            int num; // 빌딩 개수
            int[] building;

            num = sc.nextInt();
            building = new int[num];

            // building 정보 받아오기
            for (int i = 0; i < num; i++) {
                building[i] = sc.nextInt();
            }

            // 값 구하기
            for (int i = 2; i < num - 2; i++) {
                int max = building[i - 2];

                // 한 건물을 기준으로 양옆 빌딩 2개 비교
                for (int j = i - 2; j <= i + 2; j++) {

                    // 본인 건물일 경우 pass
                    if (j == i)
                        continue;

                    // 기준 건물보다 큰 경우 반복문 탈출
                    if (building[i] < building[j])
                        break;

                    // 주변 건물 중 제일 높은 건물 찾기
                    if (max < building[j])
                        max = building[j];

                    // 확보된 조망권 세대 더하기
                    if (j == i + 2 && building[i] > building[j]) {
                        household = household + (building[i] - max);
                    }

                }

            }

            // 출력
            System.out.println(String.format("#%d %d", test_case, household));

        }

    }

}
