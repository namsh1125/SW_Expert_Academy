/*
    SW Expert Academy 1936. 1대1 가위바위보
    https://swexpertacademy.com/main/code/problem/problemDetail.do?problemLevel=1&contestProbId=AV5PjKXKALcDFAUq&categoryId=AV5PjKXKALcDFAUq&categoryType=CODE&problemTitle=&orderBy=FIRST_REG_DATETIME&selectCodeLang=ALL&select-1=1&pageSize=10&pageIndex=2

    이번 문제를 통해 얻은 게 없음.
 */

import java.util.Scanner;

class Solution {

    public static void main(String args[]) throws Exception {

        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();

        if ((A - B) % 3 == 1)
            System.out.println("A");
        else if ((A - B) % 3 == 2)
            System.out.println("B");

    }
}
