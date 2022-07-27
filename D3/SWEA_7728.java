/*
    SW Expert Academy 7728. 다양성 측정
    https://swexpertacademy.com/main/code/problem/problemDetail.do?problemLevel=3&contestProbId=AWq40NEKLyADFARG&categoryId=AWq40NEKLyADFARG&categoryType=CODE&problemTitle=&orderBy=PASS_RATE&selectCodeLang=ALL&select-1=3&pageSize=10&pageIndex=2

    int 범위가 –2,147,483,648 ~ 2,147,483,647 임을 복습하게 되었던 문제.
    즉 10의 9승은 커버가 가능하다는 것을 복습함.
 */

import java.util.Scanner;

class Solution {
    public static void main(String args[]) throws Exception {

        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        sc.nextLine(); // 개행 문자 제거

        for (int test_case = 1; test_case <= T; test_case++) {

            String X = sc.nextLine();
            int[] num = new int[10];
            int result = 0;

            // 다양성 체크
            for (int i = 0; i < X.length(); i++) {
                num[X.charAt(i) - '0']++; // 숫자로 만들고, 배열에 저장
            }

            for (int i = 0; i < 10; i++) {
                if (num[i] != 0)
                    result++;
            }

            // 출력
            System.out.println(String.format("#%d %d", test_case, result));
        }
    }
}
