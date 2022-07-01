import java.util.Scanner;

public class SWEA_2805 {
    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);

        for (int test_case = 1; test_case <= 10; test_case++) {
            int tc = sc.nextInt();
            int N = sc.nextInt();
            int[][] farm = new int[N][N];

            // get farm data
            // Todo: 값이 int로 받기 크기 때문에, String으로 변환해서 한 글자씩 받아 저장
            for (int i = 0; i < N; i++) {
                String number = sc.nextLine();

                for (int j = 0; j < N; j++) {
                    farm[i][j] = Character.getNumericValue(number.charAt(j));
                }
            }

            // 수익 구하기
            // i + j < 2 : 좌측 상단 / i + j > 6 우측 하단
            // j - i < - 2 : 좌측 하단 / j - i > 2 : 우측 상단
            int revenue = 0;
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    if ((i + j >= N / 2 && i + j <= 3 * (N / 2)) && (j - i >= -N / 2 && j - i <= N / 2))
                        revenue = revenue + farm[i][j];
                }
            }
            System.out.println(String.format("#%d %d", test_case, revenue));

        }
    }
}
