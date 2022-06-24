/*
    SW Expert Academy 1244. [S/W 문제해결 응용] 2일차 - 최대 상금
    https://swexpertacademy.com/main/code/problem/problemDetail.do?contestProbId=AV15Khn6AN0CFAYD&

    입력받은 숫자가 몇 자리 정수인지 구하는 방법에 대해 알 수 있었던 문제
      - 자릿수 = (int) Math.log10(숫자) + 1
    입력 받은 숫자를 한 자리씩 쪼개 배열에 저장하는 방법에 대해 알 수 있었던 문제 (int -> int[])
      - 숫자를 String으로 바꾸고, Character.getNumericValue method를 사용하여 저장
      - 배열 = Integer.toString(숫자).chars().map(c -> c - '0').toArray();
    DFS에 관해 공부해 볼 수 있었던 문제

 */

// Todo: DFS 코드 읽고 작성

import java.util.Scanner;

public class SWEA_1244 {
    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);
        int T;
        T = sc.nextInt();

        for (int test_case = 1; test_case <= T; test_case++) {
            int number, change, repeat = -1;
            int[] num;

            // 숫자를 받아 배열에 쪼개서 저장하기
            number = sc.nextInt(); // 숫자 받기
            num = new int[(int) Math.log10(number) + 1]; // 숫자를 나눠 저장할 공간 생성

            num = Integer.toString(number).chars().map(c -> c - '0').toArray(); // int -> int[]

            // 교환 횟수 입력받기
            change = sc.nextInt();

            // 자리 바꾸기
            // 큰 값은 앞으로, 작은 값은 뒤로
            // 같은 숫자를 가지고 있는 경우 가장 뒤에 있는 숫자를 가져오기

            // Todo: 88823, 88832 전부 2번의 교환을 통해 이뤄짐. 같은 교환 내에서 최대를 구하는 방법을 찾아야 함
            for (int i = 0; i < num.length && change > 0; i++) { // 범위 내에서, 교환 횟수가 있을 때
                int max = i;

                // 가장 큰 값 찾기
                for (int j = i; j < num.length; j++) {
                    if (num[max] < num[j]) {
                        max = j;
                        System.out.println("we found max number" + max);
                    }
                    else if (max!=i && num[max] == num[j]) {
                        repeat = j;
                        System.out.println("we found repeat number");
                    }

                }

                // 자리 바꾸기
                // 근데 중복되는 숫자가 있다면, 마지막 숫자와 바꾸기
                if (i != max) {

                    if (repeat != -1) { // 중복되는 숫자가 있는 경우, 가장 뒤에 있는 숫자와 바꾸기
                        swap(num, i, repeat);
                    } else { // 중복되는 숫자가 없는 경우
                        swap(num, i, max);
                    }

                    // 교환 횟수 감소
                    change--;
                }
            }


            // 교환 횟수가 남은 경우
            // 횟수가 짝수면 그대로 홀수면 십의 자리와 일의 자리 교환
            // 반복하는 값이 있는 경우 패스
            if (change > 0 && repeat == -1) {
                change = change % 2;

                // 남은 교환 횟수가 홀수인 경우
                if (change == 1) {
                    swap(num, num.length - 2, num.length - 1);
                }

            }

            // 배열 안에 저장된 값을 하나로 모으기
            String value = "";
            for (int i = 0; i < num.length; i++)
                value = value + Integer.toString(num[i]);

            // 출력하기
            System.out.println(String.format("#%d %s", test_case, value));

        }
    }

    private static void swap(int[] num, int a, int b) {
        int temp;
        temp = num[a];
        num[a] = num[b];
        num[b] = temp;
    }
}
