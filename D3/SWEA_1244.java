/*
    SW Expert Academy 1244. [S/W 문제해결 응용] 2일차 - 최대 상금
    https://swexpertacademy.com/main/code/problem/problemDetail.do?problemLevel=3&contestProbId=AV15Khn6AN0CFAYD&categoryId=AV15Khn6AN0CFAYD&categoryType=CODE&problemTitle=&orderBy=INQUERY_COUNT&selectCodeLang=ALL&select-1=3&pageSize=10&pageIndex=1

    입력받은 숫자가 몇 자리 정수인지 구하는 방법에 대해 알 수 있었던 문제
      - 자릿수 = (int) Math.log10(숫자) + 1
    입력 받은 숫자를 한 자리씩 쪼개 배열에 저장하는 방법에 대해 알 수 있었던 문제 (int -> int[])
      - 숫자를 String으로 바꾸고, Character.getNumericValue method를 사용하여 저장
      - 배열 = Integer.toString(숫자).chars().map(c -> c - '0').toArray();
    DFS에 관해 공부해 볼 수 있었던 문제
      - https://better-tomorrow.tistory.com/entry/DFS-BFS-%EC%9D%B4%ED%95%B4%ED%95%98%EA%B8%B0
    StringBuffer에 대해 다시한번 알 수 있었던 문제

    코드 참고
      - https://c3epmos.tistory.com/136
      - https://unie2.tistory.com/1186
 */

// Todo: 나머지 변경 횟수 처리

import java.util.Scanner;

public class SWEA_1244 {
    public static int[] num;
    public static int max;

    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);
        int T;
        T = sc.nextInt();

        for (int test_case = 1; test_case <= T; test_case++) {
            int number, change;
            max = 0;

            // 숫자를 받아 배열에 쪼개서 저장하기
            number = sc.nextInt(); // 숫자 받기
            num = Integer.toString(number).chars().map(c -> c - '0').toArray(); // int -> int[]

            // 교환 횟수 입력받기
            change = sc.nextInt();

            // 최댓값 구하기
            dfs(0, 0, change);

            // 출력하기
            System.out.println(String.format("#%d %d", test_case, max));
        }
    }

    // dfs 함수 (인덱스, 깊이, 변경 가능 흿수)
    public static void dfs(int index, int cnt, int change) {
        // 다 움직였다면
        if (change == cnt) {

            // 현재 배열에 저장되어 있는 값을 합치고 저장되어 있는 최댓값과 비교
            StringBuffer sb = new StringBuffer();
            for (int i : num)
                sb.append(i);

            max = Math.max(max, Integer.parseInt(sb.toString()));
            return;
        }

        //전 범위 탐색 (시작 인덱스 ~ 끝)
        for (int i = index; i < num.length; i++) {

            // 전 범위 탐색(시작 + 1 ~ 끝)
            for (int j = i + 1; j < num.length; j++) {

                // 뒤에 큰 수가 있다면 (순서를 바꾸는 경우)
                if (num[i] <= num[j]) {

                    // swap
                    int temp = num[i];
                    num[i] = num[j];
                    num[j] = temp;

                    // dfs 함수를 재귀 호출하여 더 바꿀수 있는지 확인 (깊이 1 추가)
                    dfs(i, cnt + 1, change);

                    // 처음에 받았던 값으로 되돌리기
                    temp = num[i];
                    num[i] = num[j];
                    num[j] = temp;
                }
            }
        }

        // 다 움직이고도 교환 횟수가 남아있는 경우
        if (max == 0 && cnt < change) {
            int extra = change - cnt;

            // 남아있는 횟수가 홀수라면 일의 자리와 십의 자리와 변경
            if (extra % 2 == 1) {
                int temp = num[num.length - 2];
                num[num.length - 2] = num[num.length - 1];
                num[num.length - 1] = temp;
            }

            // 결과값을 출력하기 위해 dfs 함수를 한번 더 돌리기
            dfs(index, change, change);

        }

    }
}
