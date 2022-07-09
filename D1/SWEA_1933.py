'''
    SW Expert Academy 1933. 간단한 N 의 약수
    https://swexpertacademy.com/main/code/problem/problemDetail.do?problemLevel=1&contestProbId=AV5PhcWaAKIDFAUq&categoryId=AV5PhcWaAKIDFAUq&categoryType=CODE&problemTitle=&orderBy=INQUERY_COUNT&selectCodeLang=ALL&select-1=1&pageSize=10&pageIndex=2
    이번 문제를 통해 얻은 게 없음.
'''

num = int(input())
    
for i in range(1, num+1):
    if num % i == 0:
        print(i, end=' ')
