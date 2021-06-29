import sys
sys.stdin = open("3-2 랜선자르기/input.txt", "rt")
# 802cm 랜선에서 4개, 743cm 랜선에서 3개, 457cm 랜선에서 2개, 539cm 랜선에서 2개를 잘라내 모두 11개를 만들 수 있다.


def Count(len):
    cnt = 0
    for x in Line:
        cnt += (x//len)
    return cnt


k, n = map(int, input().split())
Line = []
res = 0
largest = 0
for i in range(k):
    tmp = int(input())
    Line.append(tmp)
    largest = max(largest, tmp)

lt = 1
rt = largest

while lt <= rt:
    mid = (lt + rt) // 2
    if Count(mid) >= n:
        res = mid
        lt = mid + 1
    else:
        rt = mid - 1
print(res)
