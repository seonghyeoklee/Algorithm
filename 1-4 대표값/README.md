### 🥉 대표값

> #### 문제
>
> N명의 학생 중 평균에 가장 가까운 학생은 몇 번째 학생인지 출력하는 프로그램을 작성

### 📌 문제분석

- 평균을 산정하고 평균에 가장 가까운 값의 위치를 출력한다.

###### 문제출처 : https://www.inflearn.com/course/%ED%8C%8C%EC%9D%B4%EC%8D%AC-%EC%95%8C%EA%B3%A0%EB%A6%AC%EC%A6%98-%EB%AC%B8%EC%A0%9C%ED%92%80%EC%9D%B4-%EC%BD%94%EB%94%A9%ED%85%8C%EC%8A%A4%ED%8A%B8

> #### 🔑 KeyPoint!

### 🔌 Code

```
import sys
sys.stdin = open("1-4 대표값/input.txt", "rt")

n = int(input())
a = list(map(int, input().split()))

avg = round(sum(a) / n)

min = 100
val = 0

for i in a:
    if abs(avg - i) <= min:
        min = abs(avg - i)

for i in range(len(a)):
    if abs(avg - a[i]) == min:
        if val <= a[i]:
            val = a[i]

for i in range(len(a)):
    if a[i] == val:
        print(avg, i+1)
        break
```

### 📃 내용정리
