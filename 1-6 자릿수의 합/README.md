### 🥉 자릿수의 합

> #### 문제
>
> 자연수가 입력되면 각 자연수의 자릿수의 합을 구하고, 그 합이 최대인 자연수를 출력 하는 프로그램을 작성

### 📌 문제분석

- 입력 된 값의 type에 따라서 2가지(str/int) 방법으로 구현할 것!

###### 문제출처 : https://www.inflearn.com/course/%ED%8C%8C%EC%9D%B4%EC%8D%AC-%EC%95%8C%EA%B3%A0%EB%A6%AC%EC%A6%98-%EB%AC%B8%EC%A0%9C%ED%92%80%EC%9D%B4-%EC%BD%94%EB%94%A9%ED%85%8C%EC%8A%A4%ED%8A%B8

> #### 🔑 KeyPoint!
>
> 각 자연수의 자릿수의 합을 구하는 함수를 def digit_sum(x)를 사용하여 코드 작성!

### 🔌 Code

```python
import sys
sys.stdin = open("1-6 자릿수의 합/input.txt", "rt")

n = int(input())
a = list(map(int, input().split()))


def digit_sum(x):
    sum = 0

    # 1. type(int) 의 경우
    # while x > 0:
    #     sum += x % 10
    #     x = x // 10

    # 2. type(str) 의 경우
    for i in str(x):
        sum += int(i)

    return sum


max = -2147000000

for x in a:
    tot = digit_sum(x)

    if tot > max:
        max = tot
        result = x

print(result)
```

### 📃 내용정리

- #### `type(x) == int`
  - 입력된 `x` 를 `%` 연산을 통해 1의 자리수를 구하고 `//` 연산으로 1의 자리수 삭제
  - `while` 조건으로 x의 값이 0보다 클 경우 계속 실행
- #### `type(x) == string`
  - 입력된 `x` 의 자리수를 순서대로 조회하고 `sum` 변수에 정수형으로 변환하여 합산
