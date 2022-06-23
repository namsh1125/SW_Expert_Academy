/*
    SW Expert Academy 2071. 평균값 구하기
    https://swexpertacademy.com/main/code/problem/problemDetail.do?problemLevel=1&contestProbId=AV5QRnJqA5cDFAUq&categoryId=AV5QRnJqA5cDFAUq&categoryType=CODE&problemTitle=&orderBy=INQUERY_COUNT&selectCodeLang=ALL&select-1=1&pageSize=10&pageIndex=1
    나누기(/)하면 소수점은 버려진다는 것을 상기시켜준 문제
 */

#include<stdio.h>
#include<math.h>

int main(int argc,char**argv){
    int test_case;
    int T;

    scanf("%d",&T);

    for(test_case=1; test_case<=T; ++test_case){
        int num,sum=0;
        float avg;

        for(int i=0; i<10; i++){
            scanf("%d\n",&num);

            sum=sum+num;
        }

        avg=(float)sum/10;

        printf("#%d %d\n",test_case,(int)round(avg));
    }
    
    return 0;
}
