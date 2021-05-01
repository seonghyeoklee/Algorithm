### 🥉 뒤집은 소수

> #### 문제
>
> 뒤집은 수가 소수이면 그 수를 출력하는 프로그램을 작성

### 📌 문제분석

- 자연수의 나머지를 구하고 나머지와 10을 곱한 값을 더하여 뒤집은 형태의 자연수를 출력한다.

###### 문제출처 : https://www.inflearn.com/course/%ED%8C%8C%EC%9D%B4%EC%8D%AC-%EC%95%8C%EA%B3%A0%EB%A6%AC%EC%A6%98-%EB%AC%B8%EC%A0%9C%ED%92%80%EC%9D%B4-%EC%BD%94%EB%94%A9%ED%85%8C%EC%8A%A4%ED%8A%B8

> #### 🔑 KeyPoint!
>
> 자연수를 뒤집는 함수와 소수여부를 판단하는 함수를 작성

### 🔌 Code

```
import sys
sys.stdin = open("1-8 뒤집은 소수/input.txt", "rt")

n = int(input())
a = list(map(int, input().split()))


def reverse(x):
    res = 0

    while x > 0:
        t = x % 10
        res = res * 10 + t
        x = x // 10

    return res


def isPrime(x):
    if x == 1:
        return False

    for i in range(2, x // 2 + 1):
        if x % i == 0:
            return False
    else:
        return True


for i in a:
    rev = reverse(i)
    if isPrime(rev):
        print(rev, end=" ")
```

### 📃 내용정리

- #### `for i in range(2, x // 2 + 1)`

  - 소수 여부를 판단하는 경우 2를 나눈 몫의 더하기 1만큼만 범위를 지정

- #### `res = res * 10 + (x % 10)`
  - x를 뒤집는 과정이며 x를 10으로 나누어 주며 0보다 큰 경우까지만 실행
