/*
    SW Expert Academy 6730. 장애물 경주 난이도
    https://swexpertacademy.com/main/code/problem/problemDetail.do?problemLevel=3&contestProbId=AWefy5x65PoDFAUh&categoryId=AWefy5x65PoDFAUh&categoryType=CODE&problemTitle=&orderBy=PASS_RATE&selectCodeLang=ALL&select-1=3&pageSize=10&pageIndex=1

    이번 문제를 통해 얻은 게 없음.
 */

import java.util.Scanner;

class Solution {
    public static void main(String args[]) throws Exception {

        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for (int test_case = 1; test_case <= T; test_case++) {

            int N = sc.nextInt();
            int[] block = new int[N];

            int up = 0, down = 0;

            // get block data
            for (int i = 0; i < N; i++)
                block[i] = sc.nextInt();

            // compare
            for (int i = 0; i < N - 1; i++) {

                int diff = block[i + 1] - block[i];
                if (diff > 0){ // 올라가는 경우
                    if(up < diff)
                        up = diff;
                }
                else{ // 내려가는 경우
                    if(down > diff)
                        down = diff;
                }
            }


            // 출력
            System.out.println(String.format("#%d %d %d", test_case, up, down * (-1)));

        }
    }
}
