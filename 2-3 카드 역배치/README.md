### 🥉 카드 역배치

> #### 문제
>
> 카드의 인덱스를 역으로 바꾸어 출력하는 프로그램 작성

###### 문제출처 : https://www.inflearn.com/course/%ED%8C%8C%EC%9D%B4%EC%8D%AC-%EC%95%8C%EA%B3%A0%EB%A6%AC%EC%A6%98-%EB%AC%B8%EC%A0%9C%ED%92%80%EC%9D%B4-%EC%BD%94%EB%94%A9%ED%85%8C%EC%8A%A4%ED%8A%B8

### 🔌 Code

```python
import sys
sys.stdin = open("2-3 카드 역배치/input.txt", "rt")

a = list(range(21))
for _ in range(10):
    s, e = map(int, input().split())

    # (e - s + 1) // 2
    for i in range((e - s + 1) // 2):
        a[s + i], a[e - i] = a[e - i], a[s + i]

# 첫 번째 인덱스 제거
a.pop(0)
for x in a:
    print(x, end=" ")
```

### 📃 내용정리

- #### a[s + i], a[e - i] = a[e - i], a[s + i]

  - 파이썬에서 값을 교환하기 위하여 임시 변수를 선언할 필요가 없음
