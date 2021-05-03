import sys
sys.stdin = open("2-2 숫자만 추출/input.txt", "rt")

n = input()
x = ''

for i in range(len(n)):
    if (ord(n[i]) >= 97 and ord(n[i]) <= 122) or (ord(n[i]) >= 65 and ord(n[i]) <= 90):
        continue
    else:
        x += n[i]

x = int(x)
cnt = 1

for i in range(1, (x + 1) // 2 + 1):
    if x % i == 0:
        cnt += 1

print(x)
print(cnt)
