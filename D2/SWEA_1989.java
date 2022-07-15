/*
    SW Expert Academy 1989. 초심자의 회문 검사
    https://swexpertacademy.com/main/code/problem/problemDetail.do?problemLevel=2&contestProbId=AV5PyTLqAf4DFAUq&categoryId=AV5PyTLqAf4DFAUq&categoryType=CODE&problemTitle=&orderBy=FIRST_REG_DATETIME&selectCodeLang=ALL&select-1=2&pageSize=10&pageIndex=1

    삼항연산자 복습 및 StringBuffer와 reverse() method를 통해 문자열을 뒤집을 수 있다는 것을 알게 된 문제

 */

import java.util.Scanner;

class Solution {
    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        sc.nextLine(); // 개행 문자 제거

        for (int test_case = 1; test_case <= T; test_case++) {
            String sentence = sc.nextLine();

            // reverse sentence
            StringBuffer sb = new StringBuffer(sentence);
            String reversedStr = sb.reverse().toString();

            // sentence와 reverse sentence 비교
            int result = sentence.equals(reversedStr) ? 1 : 0;

            // 출력
            System.out.println(String.format("#%d %d", test_case, result));

        }
    }
}
