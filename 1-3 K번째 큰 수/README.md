### 🥉 K번째 큰 수

> #### 문제
>
> N장의 카드에서 3장을 뽑아 각 카드에 적힌 수의 합에서 K번째로 큰 수를 출력하는 프로그램을 작성

### 📌 문제분석

- 입력된 수의 모든 경우의 수를 생각하며 3장을 뽑은 뒤 합계를 저장한다. 중복된 경우는 제거하고 합계를 내림차순 정렬하여 원하는 결과를 출력한다.

###### 문제출처 : https://www.inflearn.com/course/%ED%8C%8C%EC%9D%B4%EC%8D%AC-%EC%95%8C%EA%B3%A0%EB%A6%AC%EC%A6%98-%EB%AC%B8%EC%A0%9C%ED%92%80%EC%9D%B4-%EC%BD%94%EB%94%A9%ED%85%8C%EC%8A%A4%ED%8A%B8

> #### 🔑 KeyPoint!
>
> 합계를 저장하고 중복된 합계를 제거하기 위하여 `set` 집합 자료형을 사용한다. 비어있는 집합 자료형을 생성한 뒤 `add()` 함수를 통하여 합계를 저장한다.

### 🔌 Code

```
import sys
sys.stdin = open("1-3 K번째 큰 수/input.txt", "rt")

n, k = map(int, input().split())
a = list(map(int, input().split()))

# set 중복 제거를 위하여
res = set()

for i in range(n):
    for j in range(i + 1, n):
        for m in range(j + 1, n):
            res.add(a[i]+a[j]+a[m])

a = sorted(res, reverse=True)
print(a[k-1])

# 리스트 변환 후 정렬
# res = list(res)
# res.sort(reverse=True)
# print(res[k-1])

```

### 📃 내용정리

- #### `set`
  - 집합 `set`은 파이썬 2.3부터 지원하기 시작한 자료형으로, 집합에 관련된 것을 쉽게 처리하기 위해 만든 자료형이다. 중복을 허용하지 않고 순서가 없기 때문에 인덱스를 통하여 접근할 수 없다. 만약 set 자료형에 저장된 값을 인덱싱으로 접근하려면 `list`나 `tuple`로 변환 해야한다.
- #### `sort(reverse=True)`
  - 내림차순 정렬하기
- #### 다중 `for`문
  - 중복되지 않고 모든 경우의 수를 탐색하기 위해 3중 `for`문을 사용
