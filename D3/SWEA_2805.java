/*
    SW Expert Academy 2805. 농작물 수확하기
    https://swexpertacademy.com/main/code/problem/problemDetail.do?problemLevel=3&contestProbId=AV7GLXqKAWYDFAXB&categoryId=AV7GLXqKAWYDFAXB&categoryType=CODE&problemTitle=&orderBy=INQUERY_COUNT&selectCodeLang=ALL&select-1=3&pageSize=10&pageIndex=1
    
    String을 한 글자씩 분리해 int형으로 전환하는 방법에 대해 알 수 있었던 문제
    
    < comment >
    위아래 삼각형을 따로 값을 구할 수도 있고,
    start, end 값을 저장해 중간값보다 작은 경우 1부터 2씩 증가하고 중간값보다 큰 경우 2씩 감소해 구할 수 있다.
    time complexity는 같다.
    
 */

import java.util.Scanner;

public class SWEA_2805 {
    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for (int test_case = 1; test_case <= T; test_case++) {
            int N = sc.nextInt();
            int[][] farm = new int[N][N];

            // 농장 data 받기
            for (int i = 0; i < N; i++) {
                String number = sc.next();

                for (int j = 0; j < N; j++) {
                    farm[i][j] = Character.getNumericValue(number.charAt(j));
                }
            }

            // 수익 구하기
            int revenue = 0;
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {

                    // i + j < 2 : 좌측 상단 / i + j > 6 우측 하단
                    // j - i < - 2 : 좌측 하단 / j - i > 2 : 우측 상단
                    // 따라서 구하고자 하는 공간은 아래와 같다.
                    if ((i + j >= N / 2 && i + j <= 3 * (N / 2)) && (j - i >= -N / 2 && j - i <= N / 2))
                        revenue = revenue + farm[i][j];
                }
            }
            System.out.println(String.format("#%d %d", test_case, revenue));

        }
    }
}
