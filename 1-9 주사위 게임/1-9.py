import sys
sys.stdin = open("1-9 주사위 게임/input.txt", "rt")

n = int(input())
a = list(map(int, input().split()))

result = 0

for i in a:
    ch = [0] * 6
    for j in str(i):
        ch[int(j) - 1] += 1

    for idx, k in enumerate(ch):
        if k == 3:
            total = 10000+(idx+1)*1000
            if result < total:
                result = total
            break
        elif k == 2:
            total = 1000+(idx+1)*100
            if result < total:
                result = total
            break
    else:
        max = 0
        for idx, k in enumerate(ch):
            if k == 1:
                max = idx + 1

        total = max*100
        if result < total:
            result = total

print(result)
