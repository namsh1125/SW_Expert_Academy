/*
    SW Expert Academy 10804. 문자열의 거울상
    https://swexpertacademy.com/main/code/problem/problemDetail.do?problemLevel=3&contestProbId=AXTC0x16D8EDFASe&categoryId=AXTC0x16D8EDFASe&categoryType=CODE&problemTitle=&orderBy=PASS_RATE&selectCodeLang=ALL&select-1=3&pageSize=10&pageIndex=5

    이번 문제를 통해 얻은 게 없음.
 */


import java.util.Scanner;

class Solution {

    public static void main(String args[]) throws Exception {

        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        sc.nextLine(); // 개행문자 제거

        for (int test_case = 1; test_case <= T; test_case++) {

            String sentence = sc.nextLine();

            // 출력
            System.out.print("#" + test_case + " ");

            for (int i = sentence.length() - 1; i >= 0; i--) {
                switch (sentence.charAt(i)) {
                    case 'b':
                        System.out.print('d');
                        break;

                    case 'd':
                        System.out.print('b');
                        break;

                    case 'p':
                        System.out.print('q');
                        break;

                    case 'q':
                        System.out.print('p');
                        break;
                }
            }

            System.out.println();

        }
    }
}
