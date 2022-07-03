/*
    SW Expert Academy 1215. [S/W 문제해결 기본] 3일차 - 회문1
    https://swexpertacademy.com/main/code/problem/problemDetail.do?problemLevel=3&contestProbId=AV14QpAaAAwCFAYi&categoryId=AV14QpAaAAwCFAYi&categoryType=CODE&problemTitle=&orderBy=INQUERY_COUNT&selectCodeLang=ALL&select-1=3&pageSize=10&pageIndex=1
    
    nextInt() 후에 개행 문자가 있어 문자열 data를 받기 위해선 nextLine()을 이용해 개행 문자를 제거해줘야 한다.
    
    < comment >
    개수가 짝수인 경우와 홀수일 때 분리해서 비교할 수 있지만, 조건문이 2개 작성되어야 하고 이는 곧 코드가 이쁘지 않게 됨.
    본인 코드도 문자열을 추출하고 같은지 비교하는 코드를 중복해서 작성하였기에, 함수를 사용하여 작성하는 것보다 이쁘지 못한데, 앞으로 깔끔하게 작성해보겠음.
    
 */

import java.util.Scanner;

public class Solution {
    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);

        for (int test_case = 1; test_case <= 10; test_case++) {
            int length, palindrome = 0; // 회문의 길이, 개수
            char[][] arr = new char[8][8];

            // 구하고자 하는 회문의 길이 받기
            length = sc.nextInt();

            // 개행 문자 제거
            sc.nextLine();

            // 배열에 값 채우기
            for (int i = 0; i < 8; i++) {
                String sentence = sc.nextLine();

                for (int j = 0; j < 8; j++) {
                    arr[i][j] = sentence.charAt(j);
                }
            }

            // 배열 안에 있는 값을 보면서 회문의 개수 구하기 (가로)
            for (int i = 0; i < 8; i++) {
                for (int j = 0; j + length - 1 < 8; j++) {

                    // 배열에서 data 추출하기
                    String extract = ""; // 추출된 문자열
                    String change = ""; // 앞뒤로 바꾼 문자열

                    for (int k = 0; k < length; k++) {
                        extract = extract + arr[i][j + k];
                        change = arr[i][j + k] + change;
                    }

                    // 앞뒤로 바꾼 문자열이 같다면 회문
                    if (extract.equals(change))
                        palindrome++;

                }
            }

            // 배열 안에 있는 값을 보면서 회문의 개수 구하기 (세로)
            for (int j = 0; j < 8; j++) {
                for (int i = 0; i + length - 1 < 8; i++) {

                    // 배열에서 data 추출하기
                    String extract = ""; // 추출된 문자열
                    String change = ""; // 앞뒤로 바꾼 문자열

                    for (int k = 0; k < length; k++) {
                        extract = extract + arr[i + k][j];
                        change = arr[i + k][j] + change;
                    }

                    // 앞뒤로 바꾼 문자열이 같다면 회문
                    if (extract.equals(change))
                        palindrome++;

                }
            }

            // 출력
            System.out.println(String.format("#%d %d", test_case, palindrome));

        }
    }
}
