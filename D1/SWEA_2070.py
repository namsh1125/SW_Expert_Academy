'''
    SW Expert Academy 2070. 큰 놈, 작은 놈, 같은 놈
    https://swexpertacademy.com/main/code/problem/problemDetail.do?problemLevel=1&contestProbId=AV5QQ6qqA40DFAUq&categoryId=AV5QQ6qqA40DFAUq&categoryType=CODE&problemTitle=&orderBy=FIRST_REG_DATETIME&selectCodeLang=ALL&select-1=1&pageSize=10&pageIndex=1
    python 사용 방법에 대해 알 수 있었던 문제 (특히 print)
 '''

T = int(input())
for test_case in range(1, T + 1):
  a, b = map(int, input().split())
    
  if a > b:
    print('#' + str(test_case) + ' >')
  elif a == b:
    print('#' + str(test_case) + ' =')
  else:
    print('#' + str(test_case) + ' <')
