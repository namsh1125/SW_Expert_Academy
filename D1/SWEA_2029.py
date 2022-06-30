'''
    SW Expert Academy 2029. 몫과 나머지 출력하기
    https://swexpertacademy.com/main/code/problem/problemDetail.do?problemLevel=1&contestProbId=AV5QGNvKAtEDFAUq&categoryId=AV5QGNvKAtEDFAUq&categoryType=CODE&problemTitle=&orderBy=FIRST_REG_DATETIME&selectCodeLang=ALL&select-1=1&pageSize=10&pageIndex=2
    이번 문제를 통해 얻은 게 없음.
'''

T = int(input())

for test_case in range(1, T + 1):
    a, b = map(int, input().split())
    print ("#" +  str(test_case), a//b, a%b)
