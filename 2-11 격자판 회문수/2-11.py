import sys
sys.stdin = open("2-11 격자판 회문수/input.txt", "rt")


def check(a):
    cnt = 0
    for i in range(7):
        for j in range(3):
            ch1 = []
            ch2 = []
            for k in range(5):
                ch1.append(a[i][j+k])
                ch2.append(a[j+k][i])

            # ch1 검사
            if ch1[0] == ch1[4]:
                if ch1[1] == ch1[3]:
                    cnt += 1
            # ch2 검사
            if ch2[0] == ch2[4]:
                if ch2[1] == ch2[3]:
                    cnt += 1

    return cnt


a = [list(map(int, input().split())) for _ in range(7)]
print(check(a))
