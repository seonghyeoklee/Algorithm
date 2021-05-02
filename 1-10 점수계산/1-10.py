import sys
sys.stdin = open("1-10 점수계산/input.txt", "rt")

n = int(input())
a = list(map(int, input().split()))

ch = [0] * n


for idx, value in enumerate(a):
    if value != 0:
        ch[idx] = ch[idx-1] + 1


print(sum(ch))
