#include <stdio.h>
#include <stdlib.h>
int main(int argc, char **argv)
{

    int T;
    scanf("%d", &T);

    for (int test_case = 1; test_case <= T; ++test_case)
    {
        // N 값 받기
        int N;
        scanf("%d", &N);

        // 달팽이 숫자를 저장할 공간 생성
        int **arr;
        arr = (int **)malloc(sizeof(int *) * N);
        for (int i = 0; i < N; i++)
            arr[i] = (int *)malloc(sizeof(int) * N);

        // 움직이는 횟수를 저장할 공간 생성
        // N - 1, N - 1, N - 1, N - 2, N - 2, N - 3, N - 3, ... , 1, 1로 값을 저장하고 방향 전환
        int *move = (int *)malloc(sizeof(int *) * (N * 2 - 1));

        // 배열 초기화
        move[0] = N - 1;

        for (int i = 1; i < N; i++)
            move[i * 2] = N - i;

        for (int i = 1; i < N; i++)
            move[i * 2 - 1] = N - i;

        // 배열에 값을 넣기
        int vector = 0; // 0: 우측으로, 1: 아래로, 2: 왼쪽으로, 3: 위로
        int i = 0, j = 0, k = 0;
        int moved = 0; // 움직인 횟수

        for (int num = 1; num <= N * N; num++)
        {
            arr[i][j] = num;

            // 움직여야 하는 경우 다음 움직여야 하는 횟수를 받아오고 지금까지 움직인 횟수 초기화
            if (moved == move[k])
            {
                k++;
                moved = 0;
                vector = (vector + 1) % 4;
            }

            // 다음 숫자를 저장할 위치로 이동
            if (vector == 0) // 우측으로 이동
                j++;
            else if (vector == 1) // 아래로 이동
                i++;
            else if (vector == 2) // 왼쪽으로 이동
                j--;
            else if (vector == 3) // 위로 이동
                i--;

            moved++;
        }

        // 출력
        printf("#%d\n", test_case);
        for (int i = 0; i < i < N; i++)
        {
            for (int j = 0; j < N; j++)
            {
                printf("%d ", arr[i][j]);
            }
            printf("\n");
        }

        // free
        free(move);
        for (int i = 0; i < i < N; i++)
            free(arr[i]);
        free(arr);
    }

    return 0;
}
