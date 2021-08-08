### 🥉 정다면체

> #### 문제
>
> 두 개의 주사위를 던져서 나올 수 있는 눈의 합 중 가장 확률이 높은 숫자를 출력하는 프로그램을 작성

### 📌 문제분석

- 주사위 눈의 합을 배열의 인덱스로 설정! 눈의 합을 인덱스로 가지고 있는 배열의 값을 1씩 증가하여 완성된 배열의 최대값의 인덱스를 출력한다.

###### 문제출처 : https://www.inflearn.com/course/%ED%8C%8C%EC%9D%B4%EC%8D%AC-%EC%95%8C%EA%B3%A0%EB%A6%AC%EC%A6%98-%EB%AC%B8%EC%A0%9C%ED%92%80%EC%9D%B4-%EC%BD%94%EB%94%A9%ED%85%8C%EC%8A%A4%ED%8A%B8

> #### 🔑 KeyPoint!
>
> 눈의 합만큼 cnt 배열을 초기화! cnt = [0] \* (n + m)

### 🔌 Code

```python
import sys
sys.stdin = open("1-5 정다면체/input.txt", "rt")

n, m = map(int, input().split())
cnt = [0] * (n + m + 1)
max = -2147000000

for i in range(1, n + 1):
    for j in range(1, m + 1):
        cnt[i + j] += 1

for i in range(n + m + 1):
    if cnt[i] > max:
        max = cnt[i]

for i in range(n + m + 1):
    if cnt[i] == max:
        print(i, end=' ')
```

### 📃 내용정리

- #### 문제를 요구사항을 이해하고 배열의 인덱스를 활용하여 문제를 해결
