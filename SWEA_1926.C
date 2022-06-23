// itoa(변환할정수, 변환된 정수가 들어갈 문자열, 표현할진수)
#include<stdio.h>
int howMany(char *, char);

int main(int argc, char** argv)
{
	int N;
    char *num;
    
	scanf("%d", &N);
          
	for(int number = 1; number <= N; number++){
		// 정수를 문자로 변환
        itoa(number, num, 10); 
        
        // 해당 숫자에 3, 6, 9가 얼마나 들어있는지 구하기
        int ThreeSixNine = 0;
        ThreeSixNine = howMany(num, '3') + howMany(num, '6') + howMany(num, '9');
        
        // 출력
        if(ThreeSixNine ==0){
            printf("%d", number);
        }
        else{
        	for(int i=0;i<ThreeSixNine;i++)
                printf("-");
        }
        
		printf(" ");
	}
	return 0;
}


// value값이 해당 문자열에 얼마나 있는지 확인해서 반환해주는 코드
int howMany(char *num, char value){
    int ThreeSixNine = 0;
    char *ptr = strchr(num, value);
        
    // 입력받은 값이 존재한다면
    if(ptr!=null){ 
        ThreeSixNine++;
                     
        // 추가로 있는 지 확인
        while(ptr != NULL){
        	ptr = strchr(ptr + 1, value);
            ThreeSixNine++;
       	}
    }
    
}
