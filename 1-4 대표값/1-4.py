import sys
sys.stdin = open("1-4 대표값/input.txt", "rt")

n = int(input())
a = list(map(int, input().split()))

avg = round(sum(a) / n)

# 첫번째 풀이
# min = 100
# val = 0

# for i in a:
#     if abs(avg - i) <= min:
#         min = abs(avg - i)

# for i in range(len(a)):
#     if abs(avg - a[i]) == min:
#         if val <= a[i]:
#             val = a[i]

# for i in range(len(a)):
#     if a[i] == val:
#         print(avg, i+1)
#         break

# 두번째 풀이
min = float('inf')
for idx, x in enumerate(a):
    tmp = abs(x-avg)

    if tmp < min:
        min = tmp
        score = x
        res = idx + 1
    elif tmp == min:
        if x > score:
            score = x
            res = idx + 1
print(avg, res)
