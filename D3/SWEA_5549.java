/*
    SW Expert Academy 5549. 홀수일까 짝수일까
    https://swexpertacademy.com/main/code/problem/problemDetail.do?problemLevel=3&contestProbId=AWWxpEDaAVoDFAW4&categoryId=AWWxpEDaAVoDFAW4&categoryType=CODE&problemTitle=&orderBy=PASS_RATE&selectCodeLang=ALL&select-1=3&pageSize=10&pageIndex=4

    이번 문제를 통해 얻은 게 없음.
 */


import java.util.Scanner;

class Solution {

    public static void main(String args[]) throws Exception {

        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        sc.nextLine(); // 개행 문자 제거

        for (int test_case = 1; test_case <= T; test_case++) {

            String value = sc.nextLine();
            int num = value.charAt(value.length() - 1) - '0';

            if (num % 2 == 0)
                System.out.println("#" + test_case + " Even");

            else
                System.out.println("#" + test_case + " Odd");
        }
    }
}
