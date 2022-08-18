/*
    SW Expert Academy 1940. 가랏! RC카!
    https://swexpertacademy.com/main/code/problem/problemDetail.do?problemLevel=2&contestProbId=AV5PjMgaALgDFAUq&categoryId=AV5PjMgaALgDFAUq&categoryType=CODE&problemTitle=&orderBy=PASS_RATE&selectCodeLang=ALL&select-1=2&pageSize=10&pageIndex=2

    이번 문제를 통해 얻은 게 없음.
 */


import java.util.Scanner;

class Solution {

    public static void main(String args[]) throws Exception {

        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for (int test_case = 1; test_case <= T; test_case++) {

            int N = sc.nextInt();
            int distance = 0;
            int v = 0;

            for (int i = 0; i < N; i++) {

                int command = sc.nextInt();

                if (command == 1)
                    v = v + sc.nextInt();

                else if (command == 2) {

                    v = v - sc.nextInt();
                    if (v < 0)
                        v = 0;
                }

                distance = distance + v;
            }

            System.out.println(String.format("#%d %d", test_case, distance));
        }
    }
}
