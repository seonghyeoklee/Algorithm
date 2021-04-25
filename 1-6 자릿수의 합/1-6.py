import sys
sys.stdin = open("1-6 자릿수의 합/input.txt", "rt")

n = int(input())
a = list(map(int, input().split()))


def digit_sum(x):
    sum = 0

    # 1. type(int) 의 경우
    # while x > 0:
    #     sum += x % 10
    #     x = x // 10

    # 2. type(str) 의 경우
    for i in str(x):
        sum += int(i)

    return sum


max = -2147000000

for x in a:
    tot = digit_sum(x)

    if tot > max:
        max = tot
        result = x

print(result)
