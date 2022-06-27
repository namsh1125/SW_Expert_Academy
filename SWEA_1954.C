#include<stdio.h>
#include<stdlib.h>
int main(int argc, char** argv) {
  
	int T;
	scanf("%d", &T);
  
	for (int test_case = 1; test_case <= T; ++test_case) {
    
		// N 값 받기
		int N;
		scanf("%d", &N);
    
		// 이차원 배열 만들기
		int **arr;
		arr = (int**) malloc ( sizeof(int*) * N );
		for (int i=0; i<N; i++) {
			arr[i] = (int*) malloc ( sizeof(int) * N );
		}
    
		// 배열 초기화
		for (int i=0;i< i<N;i++) {
			for (int j=0;j<N;j++) {
				arr[i][j]=0;
			}
		}
    
		// 배열에 값을 넣기
		int num=1;
		int vector = 0; // 0: 우측으로, 1: 아래로, 2: 왼쪽으로, 3: 위로
		int i=0, j=0;
    
		while(num <= N * N) {
      
			// 값 넣기
			arr[i][j] = num;
			if(vector == 0) // 우측으로 이동
			  j++; 
      else if(vector ==1) // 아래로 이동
			  i++;
      else if(vector ==2) // 왼쪽으로 이동
			  j--;
      else if(vector ==3) // 위로 이동
			  i--;
      
			// 저장할 값 증가
			num++;
      
			// 이동하기
			if(i == N || j == N || arr[i][j] != 0)
			  vector = (vector+1)%4;
		}
    
		// 출력
		printf("#%d\n", test_case);
		for (int i=0;i< i<N;i++) {
			for (int j=0;j<N;j++) {
				printf("%d ", arr[i][j]);
			}
			printf("\n");
		}
    
    // free
		for (int i=0;i< i<N;i++) {
			free(arr[i]);
		}
		free(arr);
    
	}
  
	return 0;
}
