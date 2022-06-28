'''
    SW Expert Academy 2050. 알파벳을 숫자로 변환
    https://swexpertacademy.com/main/code/problem/problemDetail.do?problemLevel=1&contestProbId=AV5QLGxKAzQDFAUq&categoryId=AV5QLGxKAzQDFAUq&categoryType=CODE&problemTitle=&orderBy=FIRST_REG_DATETIME&selectCodeLang=ALL&select-1=1&pageSize=10&pageIndex=1
    Python에서 String을 한 글자씩 분리하는 방법과 문자를 아스키코드값으로 변환하는 방법에 대해 알 수 있었던 문제
'''

string = input()
value = list(string)

for i in value:
    print(ord(i) - ord('A') + 1, end=' ')
