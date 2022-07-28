/*
    SW Expert Academy 11688. Calkin-Wilf tree 1
    https://swexpertacademy.com/main/code/problem/problemDetail.do?problemLevel=3&contestProbId=AXgZSOn6ApIDFASW&categoryId=AXgZSOn6ApIDFASW&categoryType=CODE&problemTitle=&orderBy=PASS_RATE&selectCodeLang=ALL&select-1=3&pageSize=10&pageIndex=2

    이번 문제를 통해 얻은 게 없음.
 */

import java.util.Scanner;

class Solution {

    public static void main(String args[]) throws Exception {

        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        sc.nextLine();

        for (int test_case = 1; test_case <= T; test_case++) {

            int a = 1, b = 1;
            String move = sc.nextLine();

            for (int i = 0; i < move.length(); i++) {
                char direction = move.charAt(i);

                if (direction == 'L') { // Left
                    b = a + b;
                } else { // Right
                    a = a + b;
                }
            }

            // 출력
            System.out.println(String.format("#%d %d %d", test_case, a, b));
        }
    }
}}
