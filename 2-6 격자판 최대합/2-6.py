import sys
sys.stdin = open("2-6 격자판 최대합/input.txt", "rt")

n = int(input())
a = [list(map(int, input().split())) for _ in range(n)]
largest = -2147000000

for i in range(n):
    sum1 = sum2 = 0
    for j in range(n):
        sum1 += a[i][j]
        sum2 += a[j][i]

    if sum1 > largest:
        largest = sum1
    if sum2 > largest:
        largest = sum2

sum1 = sum2 = 0

for i in range(n):
    sum1 += a[i][i]
    sum2 += a[i][n - i - 1]

if sum1 > largest:
    largest = sum1
if sum2 > largest:
    largest = sum2

print(largest)

# n = int(input())
# max = 0
# total2 = 0

# for i in range(n):
#     a = list(map(int, input().split()))

#     total1 = 0

#     for j in a:
#         total1 += j

#     if max <= total1:
#         max = total1

#     for j in range(len(a)):
#         total2 += a[i]
#         break

#     if max <= total2:
#         max = total2

# print(max)
