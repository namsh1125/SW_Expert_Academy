/*
    SW Expert Academy 1966. 숫자를 정렬하자
    https://swexpertacademy.com/main/code/problem/problemDetail.do?problemLevel=2&contestProbId=AV5PrmyKAWEDFAUq&categoryId=AV5PrmyKAWEDFAUq&categoryType=CODE&problemTitle=&orderBy=INQUERY_COUNT&selectCodeLang=ALL&select-1=2&pageSize=10&pageIndex=3

    이번 문제를 통해 얻은 게 없음.
 */


import java.util.Arrays;
import java.util.Scanner;

class Solution {

    public static void main(String args[]) throws Exception {

        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for (int test_case = 1; test_case <= T; test_case++) {

            int N = sc.nextInt();
            int[] num = new int[N]; // 5만원, 1만원, 5천원, 1천원, 5백원, 1백원, 50원, 10원

            for (int i = 0; i < num.length; i++) {
                num[i] = sc.nextInt();
            }

            Arrays.sort(num);

            // 출력
            System.out.print("#" + test_case + " ");

            for (int i = 0; i < num.length; i++) {
                System.out.print(num[i] + " ");
            }

            System.out.println();

        }
    }
}
