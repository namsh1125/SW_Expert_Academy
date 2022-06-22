// 몇자리 정수인지 구하는 방법을 알 수 있었음
// 숫자를 쪼개서 배열에 저장하는 방법을 알 수 있었음

// Todo: 757148 1 -> 877541 (답: 857147)
//  436659 2 -> 966543 (답: 966354)
//  456789 10 -> 987654 (답: 987645) 확인필요
// 10개 중 4개 오답

import java.util.Scanner;

public class SWEA_1244 {
    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);
        int T;
        T = sc.nextInt();

        for (int test_case = 1; test_case <= T; test_case++) {
            int number, length, change;
            number = sc.nextInt();

            // 숫자를 한 자리씩 쪼개서 배열에 저장하기
            length = (int) Math.log10(number) + 1; // 받은 숫자가 몇자리인지 구하기
            int numpad[] = new int[length];

            String num = Integer.toString(number);
            for(int i=0;i<length;i++){
                numpad[i] = Character.getNumericValue(num.charAt(i));
            }

            // 교환 횟수 입력받기
            change = sc.nextInt();
            while (change != 0) {

                // 큰 값은 앞으로, 작은 값은 뒤로 보내기
                for (int i = 0; i < length; i++) {
                    int max = i;

                    // 본인보다 큰 값이 있는지 확인
                    for (int j = i; j < length; j++) {
                        if (numpad[max] < numpad[j])
                            max = j;
                    }

                    // 본인보다 큰 값이 있다면 변경
                    if(max!=i){
                        int temp = numpad[max];
                        numpad[max] = numpad[i];
                        numpad[i] = temp;
                    }
                }

                // 변경횟수 감소
                change--;
            }

            // 바꿀 횟수가 남아있다면, 십의 자리와 일의 자리 바꾸기
            if(change!=0){
                while(change!=0){
                    int temp = numpad[length-1];
                    numpad[length-1] = numpad[length-2];
                    numpad[length-2] = temp;
                }
            }

            String value="";
            for(int i=0;i<length;i++)
                value = value+numpad[i];

            System.out.println(String.format("#%d %s", test_case, value));

        }
    }
}
