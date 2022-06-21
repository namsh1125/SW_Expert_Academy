/*
    SW Expert Academy 5688. 세제곱근을 찾아라
    https://swexpertacademy.com/main/code/problem/problemDetail.do?problemLevel=3&contestProbId=AWXVyCaKugQDFAUo&categoryId=AWXVyCaKugQDFAUo&categoryType=CODE&problemTitle=5688&orderBy=FIRST_REG_DATETIME&selectCodeLang=ALL&select-1=3&pageSize=10&pageIndex=1

    재귀보다는 미리 저장해서 작업하는 게 시간을 줄일 수 있다는 것을 다시 상기시켜준 문제
    Type 맞추는 게 중요하다는 것을 다시 한번 깨닫게 된 문제
 */

import java.util.Scanner;

public class SWEA_5688 {

    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);
        int T;
        T = sc.nextInt();

        // 세 제곱한 값 저장
        long[] cubic = new long[1000000];
        for (int i = 1; i <= 1000000; i++) {
            cubic[i - 1] = (long) i * i * i;
        }

        for (int test_case = 1; test_case <= T; test_case++) {
            long N;
            N = sc.nextLong();

            // 값 비교
            for (int i = 0; i < cubic.length; i++) {
                if (cubic[i] == N) {
                    System.out.println(String.format("#%d %d", test_case, i + 1));
                    break;
                } else if (cubic[i] > N) {
                    System.out.println(String.format("#%d -1", test_case));
                    break;
                }
            }

        }

    }
}
