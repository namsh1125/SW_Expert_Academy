/*
    SW Expert Academy 10570. 제곱 팰린드롬 수
    https://swexpertacademy.com/main/code/problem/problemDetail.do?problemLevel=3&contestProbId=AXO72aaqPrcDFAXS&categoryId=AXO72aaqPrcDFAXS&categoryType=CODE&problemTitle=&orderBy=PASS_RATE&selectCodeLang=ALL&select-1=3&pageSize=10&pageIndex=2

    Math.sqrt() 복습한 문제
 */

import java.util.Scanner;

class Solution {
    public static void main(String args[]) throws Exception {

        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for (int test_case = 1; test_case <= T; test_case++) {

            int num = 0; // 제곱 팰린드롬 수의 개수
            int A = sc.nextInt();
            int B = sc.nextInt();

            for (int i = A; i <= B; i++) {

                String value = "" + i;
                StringBuffer sb = new StringBuffer(value);
                String reverseValue = sb.reverse().toString();

                if (value.equals(reverseValue)) {

                    int sqrt = (int) Math.sqrt(i);

                    // 값을 루트 씌우고 나머지를 버리면 제곱했을 때 해당 값이 안 나온다.
                    if (i == sqrt * sqrt) {
                        String sqrtValue = "" + sqrt;
                        sb = new StringBuffer(sqrtValue);
                        String reverseSqrtValue = sb.reverse().toString();

                        if (sqrtValue.equals(reverseSqrtValue)) {
                            num++;
                        }

                    }
                }

            }

            // 출력
            System.out.println(String.format("#%d %d", test_case, num));

        }
    }
}
