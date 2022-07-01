/*
    SW Expert Academy 1225. [S/W 문제해결 기본] 7일차 - 암호생성기
    https://swexpertacademy.com/main/code/problem/problemDetail.do?problemLevel=3&contestProbId=AV14uWl6AF0CFAYD&categoryId=AV14uWl6AF0CFAYD&categoryType=CODE&problemTitle=&orderBy=INQUERY_COUNT&selectCodeLang=ALL&select-1=3&pageSize=10&pageIndex=1
    
    이번 문제를 통해 얻은 것은 없는데, 문제 조건이 명확했으면 좋았을 문제 (test_case == 10)
 */

import java.util.Scanner;

public class Solution {
    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);

        for (int test_case = 1; test_case <= 10; test_case++) {
            test_case = sc.nextInt();
            int[] num = new int[8];
            int result = 0;

            // data 받기
            for (int i = 0; i < 8; i++)
                num[i] = sc.nextInt();

            // 값 변경
            int value = 1;
            while (true) {
                // 값 빼기
                num[0] = num[0] - value;

                // update value
                value++;
                if (value == 6)
                    value = 1;

                // 첫 번째 값을 맨 뒤로 보내기
                for (int i = 0; i < 7; i++) {
                    int temp = num[i];
                    num[i] = num[i + 1];
                    num[i + 1] = temp;
                }

                // end condition
                if (num[7] <= 0) {
                    num[7] = 0;
                    break;
                }
            }

            // 출력
            System.out.print(String.format("#%d", test_case));
            for (int i = 0; i < 8; i++)
                System.out.print(" " + num[i]);
            System.out.println();

        }
    }
}
