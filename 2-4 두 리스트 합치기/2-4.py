import sys
sys.stdin = open("2-4 두 리스트 합치기/input.txt", "rt")

n = int(input())
a = list(map(int, input().split()))

m = int(input())
b = list(map(int, input().split()))

p1 = 0
p2 = 0

c = []

# p1이나 p2가 마지막 인덱스에 접근했을 경우
while p1 < n and p2 < m:
    if a[p1] <= b[p2]:
        c.append(a[p1])
        p1 += 1
    else:
        c.append(b[p2])
        p2 += 1

if p1 < n:
    c = c + a[p1:]

if p2 < m:
    c = c + b[p2:]

print(c)
