import sys
sys.stdin = open("2-3 카드 역배치/input.txt", "rt")

a = list(range(21))
for _ in range(10):
    s, e = map(int, input().split())

    # (e - s + 1) // 2
    for i in range((e - s + 1) // 2):
        a[s + i], a[e - i] = a[e - i], a[s + i]

# 첫 번째 인덱스 제거
a.pop(0)
for x in a:
    print(x, end=" ")
