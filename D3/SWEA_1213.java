/*
    SW Expert Academy 1213. [S/W 문제해결 기본] 3일차 - String
    https://swexpertacademy.com/main/code/problem/problemDetail.do?problemLevel=3&contestProbId=AV14P0c6AAUCFAYi&categoryId=AV14P0c6AAUCFAYi&categoryType=CODE&problemTitle=&orderBy=INQUERY_COUNT&selectCodeLang=ALL&select-1=3&pageSize=10&pageIndex=1
    
    nextInt() 후에 개행 문자가 있어 문자열 data를 받기 위해선 nextLine()을 이용해 개행 문자를 제거해줘야 함을 다시 한번 깨닫게 된 문제
    
    < comment >
    substring을 이용하였다면 더 이쁘게 작성할 수 있었을 듯
    
 */

import java.util.Scanner;

public class SWEA_1213 {
    public static void main(String args[]) throws Exception {
        String find, sentence;
        Scanner sc = new Scanner(System.in);

        for (int test_case = 1; test_case <= 10; test_case++) {
            int answer = 0;

            // get test case
            sc.nextLine();

            // get data
            find = sc.nextLine();
            sentence = sc.nextLine();

            for (int i = 0; i + find.length() <= sentence.length(); i++) {
                String temp = "";
                for (int j = 0; j < find.length(); j++)
                    temp = temp + sentence.charAt(i + j);

                if (find.equals(temp))
                    answer++;
            }

            System.out.println(String.format("#%d %d", test_case, answer));
            
        }
    }
}
