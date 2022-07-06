/*
    SW Expert Academy 1204. [S/W 문제해결 기본] 1일차 - 최빈수 구하기
    https://swexpertacademy.com/main/code/problem/problemDetail.do?problemLevel=2&contestProbId=AV13zo1KAAACFAYh&categoryId=AV13zo1KAAACFAYh&categoryType=CODE&problemTitle=&orderBy=INQUERY_COUNT&selectCodeLang=ALL&select-1=2&pageSize=10&pageIndex=1
    
    이번 문제를 통해 얻은 게 없음.
    
 */

import java.util.Scanner;

class Solution {
    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for (int test_case = 1; test_case <= T; test_case++) {
            int[] score = new int[101]; // 0점부터 100점까지
            int Mode = 0; // 최빈값

            sc.nextInt(); // Test case number 제거

            // 학생 1,000명에 대해 성적 입력받기
            for (int i = 0; i < 1000; i++) {
                int student_score = sc.nextInt();
                score[student_score]++;
            }

            // 101개의 점수에 대해 제일 많이 나온 점수 찾기
            for (int i = 0; i < score.length; i++) {
                if (score[Mode] <= score[i])
                    Mode = i;
            }

            // 출력
            System.out.println(String.format("#%d %d", test_case, Mode));
            
        }
    }
}
