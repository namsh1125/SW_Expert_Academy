import java.util.Scanner;

import static java.lang.Math.min;

class Solution {
    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for (int test_case = 1; test_case <= T; test_case++) {

            // 지도 정보 받기
            int N = sc.nextInt();
            int[][] arr = new int[N][N];

            sc.nextLine();// 개행 문자 제거

            for (int i = 0; i < N; i++) {
                String line = sc.nextLine();

                for (int j = 0; j < N; j++) {
                    arr[i][j] = Character.getNumericValue(line.charAt(j));
                }
            }

            // 최소 경로를 저장할 배열 생성
            int[][] map = new int[N][N];

            // 끝 부분 저장 arr[0][0] ~ arr[0][N-1] && arr[N-1][0]
            for (int i = 0; i < N; i++) {
                if (i == 0)
                    map[0][0] = arr[0][0];
                else {
                    map[0][i] = map[0][i - 1] + arr[0][i];
                    map[i][0] = map[i - 1][0] + arr[i][0];
                }

            }

            // Dijkstra Algorithm
            for (int i = 1; i < N; i++) {
                for (int j = i; j < N; j++) {
                    if (i == j) {
                        map[i][j] = Math.min(map[i - 1][j], map[i][j - 1]) + arr[i][j];
                    } else {
                        map[i][j] = Math.min(map[i - 1][j], map[i][j - 1]) + arr[i][j];
                        map[j][i] = Math.min(map[j - 1][i], map[j][i - 1]) + arr[j][i];
                    }

                }

            }

            // print
            System.out.println(String.format("#%d %d", test_case, map[N - 1][N - 1]));

        }


    }

}
