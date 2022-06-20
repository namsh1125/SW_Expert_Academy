import java.util.Scanner;

public class SWEA_1859 {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int T;
        T = sc.nextInt(); // Test case

        for (int i = 0; i < T; i++) {
            int N; // Day
            N = sc.nextInt();

            // 변수 선언
            int[] price = new int[N]; // 매매가를 저장할 N개의 공간 생성
            int benefit = 0; // 이익
            int max = 0, nextMax = 0; // 최대 값의 위치와 그 다음 최대 값의 위치를 저장할 변수 생성

            for (int j = 0; j < N; j++) {
                price[j] = sc.nextInt();
            }

            while (max - nextMax != 1) { // End condition

                // 가장 비싼 날과 다음으로 비싼 날 찾기
                for (int j = max; j < price.length; j++) {
                    if (price[j] > price[max]) {

                        // 가장 비싼 날에 팔기
                        for (int k = j; j < max; j++) {
                            benefit = benefit + (price[max] - price[j]);
                        }

                        nextMax = max;
                        max = j;

                    }
                }



                System.out.println(benefit);
            }

        }

    }

}