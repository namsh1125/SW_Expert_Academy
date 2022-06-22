// Math.log10()를 통해 몇자리 정수인지 구하는 방법을 알 수 있었음
// 숫자를 String으로 변환 후 Character.getNumericValue method를 통해 한자리씩 쪼개 배열에 저장하는 방법을 알 수 있었음
// int -> int[] (외워둘것)
// numpad = Integer.toString(number).chars().map(c -> c - '0').toArray();

// 10개 중 3개 오답
// Todo: 완전탐색 공부 필요

import java.util.Scanner;

public class SWEA_1244 {
    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);
        int T;
        T = sc.nextInt();

        for (int test_case = 1; test_case <= T; test_case++) {
            int number, length, change;
            boolean overlap = false; // 입력받은 숫자가 중복되는 숫자가 있는지 확인할 때 사용
            int numpad[];

            number = sc.nextInt();

            // 숫자를 한 자리씩 쪼개서 배열에 저장하기
            // int -> int[] (외워둘것)
            numpad = Integer.toString(number).chars().map(c -> c - '0').toArray();

            // 교환 횟수 입력받기
            change = sc.nextInt();

            // 결과 구하기
            for (int i = 0; i < numpad.length; i++) {

                // 본인보다 큰 값이 있는지 확인
                int max = i;
                for (int j = numpad.length-1; j >= i; j--) {
                    if (numpad[max] < numpad[j])
                        max = j;
                    else if(numpad[max] == numpad[j])
                        overlap = true;
                }

                // 본인보다 큰 값이 있다면 변경하고 변경횟수 차감
                if (max != i) {
                    int temp = numpad[max];
                    numpad[max] = numpad[i];
                    numpad[i] = temp;

                    change--;

                    // 교환 횟수가 없을 경우 종료
                    if (change == 0)
                        break;
                }

            }


            // 바꿀 횟수가 남아있다면, 십의 자리와 일의 자리 바꿈 (=변경횟수가 짝수면 패스)
            // 중복되는 숫자가 있다면 패스
            if (change % 2 != 0 && overlap == false) {
                int temp = numpad[numpad.length - 1];
                numpad[numpad.length - 1] = numpad[numpad.length - 2];
                numpad[numpad.length - 2] = temp;
            }

            // 결과 출력
            String value = "";
            for (int i = 0; i < numpad.length; i++)
                value = value + numpad[i];

            System.out.println(String.format("#%d %s", test_case, value));

        }
    }
}
