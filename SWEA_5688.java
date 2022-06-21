import java.util.Scanner;
//Todo: timeout해결하기

public class SWEA_5688 {

    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);
        int T;
        T = sc.nextInt();

        for (int test_case = 1; test_case <= T; test_case++) {
            long N;
            N = sc.nextLong();

            int i = 1;
            while (true) {
                if (i * i * i == N) { // 세제곱근인 경우
                    System.out.println(String.format("#%d %d", test_case, i));
                    break;
                } else if (i * i * i < N) {
                    i++;
                } else {
                    System.out.println(String.format("#%d -1", test_case));
                    break;
                }

            }

        }

    }
}
