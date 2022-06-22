/*
    SW Expert Academy 1859. 백만장자 프로젝트
    https://swexpertacademy.com/main/code/problem/problemDetail.do?contestProbId=AV5LrsUaDxcDFAXc

    앞에서부터 푸는 것이 아니라 뒤를 보고 풀어야 했던 문제.
 */
import java.util.Scanner;

public class SWEA_1859 {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int T;
        T = sc.nextInt(); // Test case

        for (int test_case = 0; test_case < T; test_case++) {
            int N; // Day
            N = sc.nextInt();

            // 변수 선언
            int[] price = new int[N]; // 매매가를 저장할 N개의 공간 생성
            long benefit = 0; // 이익
            int max = 0; // 최댓값

            // 매매가 입력받기
            for (int j = 0; j < N; j++) {
                price[j] = sc.nextInt();
            }

            // 이익 계산
            for (int j =N-1;j>=0;j--){
                if(price[j] > max){
                    max = price[j];
                }
                else {
                    benefit = benefit + (max - price[j]);
                }
            }

            // 출력
            System.out.println(String.format("#%d %d", test_case, benefit));
        }

    }

}
