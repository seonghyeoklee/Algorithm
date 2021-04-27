import sys
sys.stdin = open("1-7 에라토스테네스 체/input.txt")

n = int(input())

result = []

for i in range(2, n + 1):
    cnt = 0
    for j in range(2, i):
        if (i % j) == 0:
            cnt += 1
    if cnt == 0:
        result.append(i)

print(len(result))
