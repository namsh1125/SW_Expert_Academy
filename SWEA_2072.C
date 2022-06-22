#include<stdio.h>

int main(int argc, char** argv)
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

		printf("#%d %d\n", test_case, sum);

	}

	return 0;
}
