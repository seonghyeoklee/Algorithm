### 🥉 두 리스트 합치기

> #### 문제
>
> 두 리스트 합치기

###### 문제출처 : https://www.inflearn.com/course/%ED%8C%8C%EC%9D%B4%EC%8D%AC-%EC%95%8C%EA%B3%A0%EB%A6%AC%EC%A6%98-%EB%AC%B8%EC%A0%9C%ED%92%80%EC%9D%B4-%EC%BD%94%EB%94%A9%ED%85%8C%EC%8A%A4%ED%8A%B8

### 🔌 Code

```python
import sys
sys.stdin = open("2-4 두 리스트 합치기/input.txt", "rt")

n = int(input())
a = list(map(int, input().split()))

m = int(input())
b = list(map(int, input().split()))

p1 = 0
p2 = 0

c = []

# p1이나 p2가 마지막 인덱스에 접근했을 경우
while p1 < n and p2 < m:
    if a[p1] <= b[p2]:
        c.append(a[p1])
        p1 += 1
    else:
        c.append(b[p2])
        p2 += 1

if p1 < n:
    c = c + a[p1:]

if p2 < m:
    c = c + b[p2:]

print(c)

```

### 📃 내용정리

- #### 단순하게 리스트를 더하는 것이 아니라 인덱스를 이용하여 리스트를 추가
