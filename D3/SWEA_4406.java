/*
    SW Expert Academy 4406. 모음이 보이지 않는 사람
    https://swexpertacademy.com/main/code/problem/problemDetail.do?problemLevel=3&contestProbId=AWNcD_66pUEDFAV8&categoryId=AWNcD_66pUEDFAV8&categoryType=CODE&problemTitle=&orderBy=PASS_RATE&selectCodeLang=ALL&select-1=3&pageSize=10&pageIndex=1

    substring 복습한 문제
    - substring(index) : index 이후 문자열 반환
    - substring(start, end) : start부터 end-1 까지 문자열 반환
 */

import java.util.Scanner;

class Solution {
    public static void main(String args[]) throws Exception {

        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        sc.nextLine(); // 개행문자 제거

        for (int test_case = 1; test_case <= T; test_case++) {

            // get vocabulary
            String vocab = sc.nextLine();

            // delete vowels
            for (int i = 0; i < vocab.length(); i++) {
                char alphabet = vocab.charAt(i);

                // i번째 값이 모음인 경우
                if(alphabet == 'a' || alphabet == 'e' || alphabet == 'i' || alphabet == 'o' || alphabet == 'u'){
                    vocab = vocab.substring(0, i) + vocab.substring(i + 1);
                    i--; // 앞으로 하나 당겼기 때문에 1 지워주기
                }
            }


            // 출력
            System.out.println(String.format("#%d %s", test_case, vocab));

        }
    }
}
