'''
    SW Expert Academy 2068. 최대수 구하기
    https://swexpertacademy.com/main/code/problem/problemDetail.do?contestProbId=AV5QQhbqA4QDFAUq
    한 줄에 받은 여러 개의 값을 배열에 나눠서 저장하는 방법과 배열에 있는 값을 비교하는 방법에 대해 알 수 있었던 문제
'''

T = int(input())

for test_case in range(1, T + 1):
    max = 0
    num = list(map(int, input().split()))
        
    for i in num:        
        if max < i:
            max = i
        
    print('#' + str(test_case) + ' ' + str(max))
