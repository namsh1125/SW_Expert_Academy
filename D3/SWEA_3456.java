/*
    SW Expert Academy 3456. 직사각형 길이 찾기
    https://swexpertacademy.com/main/code/problem/problemDetail.do?problemLevel=3&contestProbId=AWFPmsqqALwDFAV0&categoryId=AWFPmsqqALwDFAV0&categoryType=CODE&problemTitle=&orderBy=PASS_RATE&selectCodeLang=ALL&select-1=3&pageSize=10&pageIndex=4

    이번 문제를 통해 얻은 게 없음.
 */


import java.util.Scanner;

class Solution {

    public static void main(String args[]) throws Exception {

        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for (int test_case = 1; test_case <= T; test_case++) {

            int[] num = new int[3];

            for (int i = 0; i < num.length; i++) {
                num[i] = sc.nextInt();
            }

            if (num[0] == num[1])
                System.out.println("#" + test_case + " " + num[2]);
            else if (num[0] == num[2])
                System.out.println("#" + test_case + " " + num[1]);
            else
                System.out.println("#" + test_case + " " + num[0]);

        }
    }
}
