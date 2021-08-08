### 🥉 에라토스테네스 체

> #### 문제
>
> 소수의 개수를 출력하는 프로그램을 작성

### 📌 문제분석

- 소수는 1과 자기 자신만을 약수로 가지는 수

###### 문제출처 : https://www.inflearn.com/course/%ED%8C%8C%EC%9D%B4%EC%8D%AC-%EC%95%8C%EA%B3%A0%EB%A6%AC%EC%A6%98-%EB%AC%B8%EC%A0%9C%ED%92%80%EC%9D%B4-%EC%BD%94%EB%94%A9%ED%85%8C%EC%8A%A4%ED%8A%B8

> #### 🔑 KeyPoint!
>
> 소수인 경우 0, 그 소수의 배수는 모두 값을 1로 변경시켜 준다.

### 🔌 Code

```python
import sys
sys.stdin = open("1-7 에라토스테네스 체/input.txt")

n = int(input())

ch = [0] * (n + 1)

cnt = 0

for i in range(2, n + 1):
    if ch[i] == 0:
        cnt += 1
        for j in range(i, n + 1, i):
            ch[j] = 1

print(cnt)
```

### 📃 내용정리

- #### `[0] * (n + 1)`
  - 0으로 초기화된 길이 (n + 1) 리스트를 생성
