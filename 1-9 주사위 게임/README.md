### 🥉 주사위 게임

> #### 문제
>
> N명이 주사위 게임에 참여하였을 때, 가장 많은 상금을 받은 사람의 상금을 출력하는 프로그램을 작성

### 📌 문제분석

- 같은 눈의 개수에 따라서 경우의 수를 나눈다. 눈의 개수를 카운트하는 리스트를 생성하고 입력된 값을 카운트하여 해당 인덱스에 +1을 해준다. 해당하는 경우에 따른 상금을 계산한 뒤 최대값을 출력한다.

###### 문제출처 : https://www.inflearn.com/course/%ED%8C%8C%EC%9D%B4%EC%8D%AC-%EC%95%8C%EA%B3%A0%EB%A6%AC%EC%A6%98-%EB%AC%B8%EC%A0%9C%ED%92%80%EC%9D%B4-%EC%BD%94%EB%94%A9%ED%85%8C%EC%8A%A4%ED%8A%B8

### 🔌 Code

```
import sys
sys.stdin = open("1-9 주사위 게임/input.txt", "rt")

n = int(input())
a = list(map(int, input().split()))

result = 0

for i in a:
    ch = [0] * 6
    for j in str(i):
        ch[int(j) - 1] += 1

    for idx, k in enumerate(ch):
        if k == 3:
            total = 10000+(idx+1)*1000
            if result < total:
                result = total
            break
        elif k == 2:
            total = 1000+(idx+1)*100
            if result < total:
                result = total
            break
    else:
        max = 0
        for idx, k in enumerate(ch):
            if k == 1:
                max = idx + 1

        total = max*100
        if result < total:
            result = total

print(result)
```
