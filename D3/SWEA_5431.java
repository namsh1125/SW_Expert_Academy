/*
    SW Expert Academy 5431. 민석이의 과제 체크하기
    https://swexpertacademy.com/main/code/problem/problemDetail.do?problemLevel=3&contestProbId=AWVl3rWKDBYDFAXm&categoryId=AWVl3rWKDBYDFAXm&categoryType=CODE&problemTitle=&orderBy=PASS_RATE&selectCodeLang=ALL&select-1=3&pageSize=10&pageIndex=4

    이번 문제를 통해 얻은 게 없음.
 */


import java.util.Scanner;

class Solution {

    public static void main(String args[]) throws Exception {

        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for (int test_case = 1; test_case <= T; test_case++) {

            int N = sc.nextInt();
            int K = sc.nextInt();

            boolean[] val = new boolean[N];

            for (int i = 0; i < val.length; i++) {
                val[i] = true;
            }

            for (int i = 0; i < K; i++) {
                int j = sc.nextInt();
                val[j - 1] = false;
            }

            // 출력
            System.out.print("#" + test_case + " ");

            for (int i = 0; i < val.length; i++) {
                if (val[i] == true) {
                    System.out.print(i + 1 + " ");
                }
            }

            System.out.println();
        }
    }
}
