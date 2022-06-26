'''
    SW Expert Academy 2063. 중간값 찾기
    https://swexpertacademy.com/main/code/problem/problemDetail.do?problemLevel=1&contestProbId=AV5QPsXKA2UDFAUq&categoryId=AV5QPsXKA2UDFAUq&categoryType=CODE&problemTitle=&orderBy=FIRST_REG_DATETIME&selectCodeLang=ALL&select-1=1&pageSize=10&pageIndex=1
    Python에서 sort 하는 방식과 나누기에 대해 알 수 있었던 문제 ('/'는 나눗셈, '//'는 나눗셈의 몫, '%'는 나눗셈의 나머지)
'''

max = int(input())
mid = max//2 +1

# 값을 받고 sorting
arr = list(map(int, input().split()))
arr.sort()

# 배열은 0부터 시작하기 때문에 1 빼주기
print(arr[mid -1])
