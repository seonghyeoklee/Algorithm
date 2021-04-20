import sys
sys.stdin = open("1-2 K번째 수/input.txt", "rt")

# 케이스 개수
T = int(input())

for t in range(T):
    n, s, e, k = map(int, input().split())
    a = list(map(int, input().split()))

    # CASE 1
    a = sorted(a[s-1:e])
    print("#%d %d" % ((t+1), a[k-1]))

    # CASE 2
    #a = a[s-1:e]
    # a.sort()
    # print("#%d %d" % ((t+1), a[k-1]))
