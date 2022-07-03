'''
    SW Expert Academy 2025. N줄덧셈
    https://swexpertacademy.com/main/code/problem/problemDetail.do?problemLevel=1&contestProbId=AV5QFZtaAscDFAUq&categoryId=AV5QFZtaAscDFAUq&categoryType=CODE&problemTitle=&orderBy=FIRST_REG_DATETIME&selectCodeLang=ALL&select-1=1&pageSize=10&pageIndex=2
    
    python의 '/'는 고등학교 때까지 사용한 나누기라는 것을 다시 한번 깨닫게 된 문제.
    
    < comment >
    실제론 '/'를 사용하여 형 변환을 진행하는 방식으로 푸는 게 맞긴 하는데, 어차피 나누어떨어지기 때문에 그냥 '//'을 이용해 풀었음.
    
'''

value = int(input())
print(value * (value + 1) // 2)
