/*
    SW Expert Academy 1984. 중간 평균값 구하기
    https://swexpertacademy.com/main/code/problem/problemDetail.do?problemLevel=2&contestProbId=AV5Pw_-KAdcDFAUq&categoryId=AV5Pw_-KAdcDFAUq&categoryType=CODE&problemTitle=&orderBy=FIRST_REG_DATETIME&selectCodeLang=ALL&select-1=2&pageSize=10&pageIndex=1

    문제를 꼼꼼히 읽어야 하겠다고 생각한 문제
 */


import java.util.Arrays;
import java.util.Scanner;

class Solution {
    public static void main(String args[]) throws Exception {

        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for (int test_case = 1; test_case <= T; test_case++) {

            int[] num = new int[10];
            int sum = 0;

            for (int i = 0; i < 10; i++) {
                num[i] = sc.nextInt();
                sum = sum + num[i];
            }

            Arrays.sort(num);

            sum = sum - num[0] - num[9];

            // 출력
            System.out.println(String.format("#%d %d", test_case, (int) Math.round((double) sum / 8)));

        }
    }
}
