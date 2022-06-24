/*
    SW Expert Academy 1926. 간단한 369게임
    https://swexpertacademy.com/main/code/problem/problemDetail.do?problemLevel=2&contestProbId=AV5PTeo6AHUDFAUq&categoryId=AV5PTeo6AHUDFAUq&categoryType=CODE&problemTitle=&orderBy=FIRST_REG_DATETIME&selectCodeLang=ALL&select-1=2&pageSize=10&pageIndex=1
    정수를 String으로 바꿔서 하는 거 구현해봤는데 시간 복잡도가 같고, 구현하는데 복잡했음
    문자열 처리는 역시 Java가 최고라는 것을 다시 생각하게 된 문제
 */

#include<stdio.h>
int main(int argc, char** argv)
{
    int N;

    scanf("%d", &N);

    for (int i = 1; i <= N; i++) {
        int number = i;

        // 해당 숫자에 3, 6, 9가 얼마나 들어있는지 구하기
        int ThreeSixNine = 0;
        do {
            int compare = number % 10;
            if (compare == 3 || compare == 6 || compare == 9)
                ThreeSixNine++;

            number = number / 10;

        } while (number != 0);


        // 출력
        if (ThreeSixNine == 0) {
            printf("%d", i);
        }
        else {
            for (int j = 0; j < ThreeSixNine; j++)
                printf("-");
        }

        printf(" ");
    }
    return 0;
}
