import sys
sys.stdin = open("1-4 대표값/input.txt", "rt")

n = int(input())
a = list(map(int, input().split()))

# avg = round(sum(a) / n)
# python의 round는 round_half_even 방식!
# 예를들면 round(4.500) = 4 / round(5.500) = 6
# 따라서  a = a + 0.5 >> a = int(a) 이러한 방식으로 해결!
avg = int((sum(a) / n) + 0.5)

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
