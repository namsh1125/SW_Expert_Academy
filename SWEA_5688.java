import java.util.Scanner;
// Todo: timeout해결하기
// 해결하기 위해 dynamic programming사용 -> 100개의 test case중 1개 통과

public class SWEA_5688 {

    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);
        int T;
        T = sc.nextInt();

        // 세제곱한 값 저장
        long[] cubic = new long[1000000];
        for (int i = 1; i <= 1000000; i++) {
            cubic[i - 1] = i * i * i;
        }

        for (int test_case = 1; test_case <= T; test_case++) {
            long N;
            N = sc.nextLong();

            // 값 비교
            for(int i=0;i<cubic.length;i++){
                if(cubic[i]==N){
                    System.out.println(String.format("#%d %d", test_case, i+1));
                    break;
                }
                else if(cubic[i] > N){
                    System.out.println(String.format("#%d -1", test_case));
                    break;
                }
            }

        }

    }
}
