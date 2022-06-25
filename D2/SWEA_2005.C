/*
    SW Expert Academy 2005. 파스칼의 삼각형
    https://swexpertacademy.com/main/code/problem/problemDetail.do?problemLevel=2&contestProbId=AV5P0-h6Ak4DFAUq&categoryId=AV5P0-h6Ak4DFAUq&categoryType=CODE&problemTitle=&orderBy=FIRST_REG_DATETIME&selectCodeLang=ALL&select-1=2&pageSize=10&pageIndex=1
    동적할당에 대해 다시 한번 공부해볼 수 있었던 문제.
    역시 Java가 최고다.
 */

#include<stdio.h>
#include<stdlib.h>

int main() {
	int T;
	scanf("%d", &T);

	for (int test_case = 1; test_case <= T; ++test_case) {
		int max_line;
		scanf("%d", &max_line);

		// test case 출력
		printf("#%d\n", test_case);

		// 값을 저장할 배열 생성 및 초기화
		int pascal[10] = { 0, };

		for (int line = 1; line <= max_line; line++) {
			
			// 파스칼 삼각형의 가장 왼쪽과 우측의 값을 1로 초기화
			pascal[0] = 1;
			pascal[line - 1] = 1;

			// 3번째 줄부터, 즉 더하는 경우가 있는 경우
			if (line >= 3) {
				
				// 참고할 앞에 줄을 저장하고
				int* temp = (int*)malloc(sizeof(int) * (line - 1));
				for (int k = 0; k < line - 1; k++)
					temp[k] = pascal[k];


				// 앞줄을 참고해 더하기
				for (int j = 1; j < line - 1; j++) 
					pascal[j] = temp[j - 1] + temp[j];
				
				// 다 사용했으면 놓아주기
				free(temp);

			}

			// 출력
			for (int j = 0; j < line; j++)
				printf("%d ", pascal[j]);

			printf("\n");
		}

	}

	return 0;

}
