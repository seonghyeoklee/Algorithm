import sys
sys.stdin = open("2-1 회문 문자열 검사/input.txt", "rt")

n = int(input())
a = []

for i in range(n):
    a.append(input())

for idx, word in enumerate(a):
    word = word.lower()
    for i in range(len(word) // 2):
        if word[i] != word[-1 - i]:
            print("#%d NO" % (idx+1))
            break
    else:
        print("#%d YES" % (idx+1))

# if s == s[::-1]
