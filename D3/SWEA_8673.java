/*
    SW Expert Academy 8673. 코딩 토너먼트1
    https://swexpertacademy.com/main/code/problem/problemDetail.do?problemLevel=3&contestProbId=AW2Jldrqlo4DFASu&categoryId=AW2Jldrqlo4DFASu&categoryType=CODE&problemTitle=&orderBy=PASS_RATE&selectCodeLang=ALL&select-1=3&pageSize=10&pageIndex=2

    이번 문제를 통해 얻은 게 없음.
 */

import java.util.Scanner;

class Solution {
    public static void main(String args[]) throws Exception {

        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for (int test_case = 1; test_case <= T; test_case++) {

            int K = sc.nextInt();
            int user = (int) Math.pow(2, K); // 유저 수
            int[] skill = new int[user]; // 유저들의 능력치

            // 실력 입력받기
            for (int i = 0; i < user; i++) {
                skill[i] = sc.nextInt();
            }

            // 지겨운 정도 계산
            int boring = 0;
            while (user != 1) {

                int[] temp = new int[user / 2]; // 승리 한 애들 능력치 저장할 공간
                for (int i = 0; i < user; i = i + 2) {

                    // 토너먼트 승리자 구하고 지루한 정도 더하기
                    temp[i/2] = skill[i] > skill[i + 1] ? skill[i] : skill[i + 1];
                    boring = boring + Math.abs(skill[i] - skill[i+1]);

                }

                skill = temp; // 승리 한 애들 저장

                user = user / 2;
            }


            // 출력
            System.out.println(String.format("#%d %d", test_case, boring));
        }
    }
}
