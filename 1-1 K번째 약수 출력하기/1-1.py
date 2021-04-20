import sys
sys.stdin = open("1-1 K번째 약수 출력하기/input.txt", "rt")

# 두 자연수 입력
n, k = map(int, input().split())

# 카운트 초기화
cnt = 0

for i in range(1, n+1):

    # 약수 일 경우
    if n % i == 0:
        cnt += 1

    # k번째 해당하는 경우
    if cnt == k:
        print(i)
        break
else:
    print(-1)
