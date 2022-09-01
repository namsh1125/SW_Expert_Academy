import java.util.Scanner;

class Solution {

    public static void main(String args[]) throws Exception {

        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for (int test_case = 1; test_case <= T; test_case++) {

            int N = sc.nextInt();
            int cut = 0;

            while (N % 2 == 0) {
                cut++;
                N = N / 2;
            }

            // 출력
            if (cut % 2 == 0) {
                System.out.println(String.format("#%d Bob", test_case));
            }
            else
                System.out.println(String.format("#%d Alice", test_case));



        }
    }
}
