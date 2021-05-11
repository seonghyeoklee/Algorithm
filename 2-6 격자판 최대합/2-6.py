import sys
sys.stdin = open("2-6 격자판 최대합/input.txt", "rt")

n = int(input())
max = 0
total2 = 0

for i in range(n):
    a = list(map(int, input().split()))

    total1 = 0

    for j in a:
        total1 += j

    if max <= total1:
        max = total1

    for j in range(len(a)):
        total2 += a[i]
        break

    if max <= total2:
        max = total2

print(max)
