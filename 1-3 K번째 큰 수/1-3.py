import sys
sys.stdin = open("1-3 K번째 큰 수/input.txt", "rt")

n, k = map(int, input().split())
a = list(map(int, input().split()))

# set 중복 제거를 위하여
res = set()

for i in range(n):
    for j in range(i + 1, n):
        for m in range(j + 1, n):
            res.add(a[i]+a[j]+a[m])

a = sorted(res, reverse=True)
print(a[k-1])

# 리스트 변환 후 정렬
# res = list(res)
# res.sort(reverse=True)
# print(res[k-1])
