/*
    SW Expert Academy 1289. 원재의 메모리 복구하기
    https://swexpertacademy.com/main/code/problem/problemDetail.do?problemLevel=3&contestProbId=AV19AcoKI9sCFAZN&categoryId=AV19AcoKI9sCFAZN&categoryType=CODE&problemTitle=&orderBy=PASS_RATE&selectCodeLang=ALL&select-1=3&pageSize=10&pageIndex=1

    이번 문제를 통해 얻은 게 없음.
 */

import java.util.Scanner;

class Solution {
    public static void main(String args[]) throws Exception {

        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        sc.nextLine(); // 개행문자 제거

        for (int test_case = 1; test_case <= T; test_case++) {

            String data = sc.nextLine();
            char compare = '0';
            int recover = 0;

            // 문자가 바뀌는 횟수가 곧 복구 횟수
            for (int i = 0; i < data.length(); i++) {

                if (data.charAt(i) != compare) {
                    if (compare == '0')
                        compare = '1';
                    else
                        compare = '0';

                    recover++;
                }
            }

            // 출력
            System.out.println(String.format("#%d %d", test_case, recover));

        }
    }
}
