### 🥉 점수계산

> #### 문제
>
> 채점 1 0 1 1 1 0 0 1 1 0  
> 점수 1 0 1 2 3 0 0 1 2 0  
> 시험문제의 채점 결과가 주어졌을 때, 총 점수를 계산하는 프로그램을 작성

### 📌 문제분석

- 연속으로 문제의 답이 맞는 경우 점수가 가산된다. 따라서 정답일 경우 이전문항의 결과에 점수를 가산한다.

###### 문제출처 : https://www.inflearn.com/course/%ED%8C%8C%EC%9D%B4%EC%8D%AC-%EC%95%8C%EA%B3%A0%EB%A6%AC%EC%A6%98-%EB%AC%B8%EC%A0%9C%ED%92%80%EC%9D%B4-%EC%BD%94%EB%94%A9%ED%85%8C%EC%8A%A4%ED%8A%B8

### 🔌 Code

```python
import sys
sys.stdin = open("1-10 점수계산/input.txt", "rt")

n = int(input())
a = list(map(int, input().split()))

ch = [0] * n


for idx, value in enumerate(a):
    if value != 0:
        ch[idx] = ch[idx-1] + 1


print(sum(ch))
```
