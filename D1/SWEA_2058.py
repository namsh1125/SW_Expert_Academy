'''
    SW Expert Academy 2058. 자릿수 더하기
    https://swexpertacademy.com/main/code/problem/problemDetail.do?problemLevel=1&contestProbId=AV5QPRjqA10DFAUq&categoryId=AV5QPRjqA10DFAUq&categoryType=CODE&problemTitle=&orderBy=FIRST_REG_DATETIME&selectCodeLang=ALL&select-1=1&pageSize=10&pageIndex=1
    Python에서 while문 사용법에 대해 알 수 있었던 문제
'''

N = int(input())
sum = 0

while N != 0:
    sum = sum + N % 10
    N = N // 10
    
print(sum)
