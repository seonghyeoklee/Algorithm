### 🥉 대표값

> #### 문제
>
> N명의 학생 중 평균에 가장 가까운 학생은 몇 번째 학생인지 출력하는 프로그램을 작성

### 📌 문제분석

- 평균을 산정하고 평균에 가장 가까운 값의 위치를 출력한다.

###### 문제출처 : https://www.inflearn.com/course/%ED%8C%8C%EC%9D%B4%EC%8D%AC-%EC%95%8C%EA%B3%A0%EB%A6%AC%EC%A6%98-%EB%AC%B8%EC%A0%9C%ED%92%80%EC%9D%B4-%EC%BD%94%EB%94%A9%ED%85%8C%EC%8A%A4%ED%8A%B8

> #### 🔑 KeyPoint!
>
> `round` 함수를 이용하여 소수점을 처리하고 `enumerate` 함수를 사용하여 인덱스 값을 포함하는 enumerate 객체를 리턴받아 문제해결

### 🔌 Code

```
import sys
sys.stdin = open("1-4 대표값/input.txt", "rt")

n = int(input())
a = list(map(int, input().split()))

# avg = round(sum(a) / n)

# 내용추가
# python의 round는 round_half_even 방식!
# 예를들면 round(4.500) = 4 / round(5.500) = 6
# 따라서  a = a + 0.5 >> a = int(a) 이러한 방식으로 해결!
avg = int((sum(a) / n) + 0.5)

# 첫번째 풀이
# min = 100
# val = 0

# for i in a:
#     if abs(avg - i) <= min:
#         min = abs(avg - i)

# for i in range(len(a)):
#     if abs(avg - a[i]) == min:
#         if val <= a[i]:
#             val = a[i]

# for i in range(len(a)):
#     if a[i] == val:
#         print(avg, i+1)
#         break

# 두번째 풀이
min = float('inf')
for idx, x in enumerate(a):
    tmp = abs(x-avg)

    if tmp < min:
        min = tmp
        score = x
        res = idx + 1
    elif tmp == min:
        if x > score:
            score = x
            res = idx + 1
print(avg, res)
```

### 📃 내용정리

- #### `round`
  - round(number[, ndigits]) 함수는 숫자를 입력받아 반올림해 주는 함수이다.
  - 참고 : [점프 투 파이썬 내장함수(round)](https://wikidocs.net/32#round)
- #### `enumerate`

  - 순서가 있는 자료형(list, set, tuple, dictionary, string)을 입력으로 받아 인덱스 값을 포함하는 enumerate 객체를 리턴
  - 보통 enumerate 함수는 for문과 함께 자주 사용
  - 참고 : [Python 계단밟기 enumerate 함수](https://wikidocs.net/20792)

- #### ❗ **내용추가** (2021.4.22)
  - python의 round는 round_half_even 방식이다. 예를들면 round(4.500) = 4 / round(5.500) = 6
  - 값이 정확하게 절반일 경우 짝수로 반올림 하게 된다. 이러한 경우를 해결하기 위하여 0.5를 더해준 뒤 `int`로 변환하는 방식으로 반올림한다.
