/*
	SW Expert Academy 2072. 홀수만 더하기
	https://swexpertacademy.com/main/code/problem/problemDetail.do?problemLevel=1&contestProbId=AV5QSEhaA5sDFAUq&categoryId=AV5QSEhaA5sDFAUq&categoryType=CODE&problemTitle=&orderBy=FIRST_REG_DATETIME&selectCodeLang=ALL&select-1=1&pageSize=10&pageIndex=1
	
	C언어 워밍업
 */

#include<stdio.h>

int main()
{
	int T;
	scanf("%d", &T);
	
	for (int test_case = 1; test_case <= T; ++test_case)
	{
		int num, sum = 0;

		for (int i = 0; i < 10; i++) {
			scanf("%d", &num);

			if (num % 2 == 1)
				sum = sum + num;
		}

		printf("#%d %d", test_case, sum);

	}

	return 0;
}
