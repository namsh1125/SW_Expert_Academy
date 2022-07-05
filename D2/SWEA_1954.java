/*
    SW Expert Academy 1954. 달팽이 숫자
    https://swexpertacademy.com/main/code/problem/problemDetail.do?problemLevel=2&contestProbId=AV5PobmqAPoDFAUq&categoryId=AV5PobmqAPoDFAUq&categoryType=CODE&problemTitle=&orderBy=INQUERY_COUNT&selectCodeLang=ALL&select-1=2&pageSize=10&pageIndex=1

    배열의 형식을 다시 한번 생각해보게 된 문제
      - 이차평면은 가로가 x, 세로가 y인데 배열은 i가 세로, j는 가로이다
      - 이차평면에서는 남으로 가는 게 - 1이라면, 배열에서는 +1이다
    방향 문제를 어떻게 풀어야 하는지 알게 된 문제 (사전에 어떤 방향으로 이동하는지 저장해서 풀기)
    주어진 형식대로 출력해야 함을 다시 한번 깨닫게 된 문제. (띄어쓰기 안 해서 10개의 case 중 5개 틀림)
    C보다는 Java가 편하다는 것을 알게 된 문제

    < comment >
    switch를 이용해서 방향 전환을 할 수도 있다

 */

import java.util.Scanner;

public class SWEA_1954 {
    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        // 동, 남, 서, 북
        int[] di = {0, 1, 0, -1};
        int[] dj = {1, 0, -1, 0};

        for (int test_case = 1; test_case <= T; test_case++) {

            // 달팽이 숫자를 저장할 공간 생성
            int N = sc.nextInt();
            int arr[][] = new int[N][N];

            // 움직임
            int i = 0, j = 0; // 배열을 control 할 때 사용
            int vector = 0; // 0: 우측으로, 1: 아래로, 2: 왼쪽으로, 3: 위로

            // 배열 채우기
            for (int num = 1; num <= N * N; num++) {

                // 값을 저장
                arr[i][j] = num;

                // 다음 방향으로 이동
                i = i + di[vector];
                j = j + dj[vector];

                // 만약 움직인 곳이 의도하지 않은 곳이라면 (범위 밖 or 이미 차 있는 경우)
                boolean intent = (i >= 0 && i < N) && (j >= 0 && j < N) && (!(arr[i][j] >= 1 && arr[i][j] <= N * N));
                if (!intent) {

                    // roll back
                    i = i - di[vector];
                    j = j - dj[vector];

                    // 방향을 전환하고
                    vector = (vector + 1) % 4;

                    // 다시 움직이기
                    i = i + di[vector];
                    j = j + dj[vector];

                }

            }

            // 출력
            System.out.println("#" + test_case);
            for (i = 0; i < N; i++) {
                for (j = 0; j < N; j++) {
                    System.out.print(arr[i][j] + " ");
                }
                System.out.println();
            }


        }
    }
}
