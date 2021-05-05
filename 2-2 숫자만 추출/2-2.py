import sys
sys.stdin = open("2-2 숫자만 추출/input.txt", "rt")

n = input()
res = 0
for i in n:
    # isdecimal : 0 ~ 9 문자열이 int 타입으로 변환 가능한 문자로 구성됐을 때 true 리턴
    if i.isdecimal():
        res = res * 10 + int(i)

print(res)
cnt = 0
for i in range(1, res + 1):
    if res % i == 0:
        cnt += 1

print(cnt)
