### 🥉 회문 문자열 검사

> #### 문제
>
> 회문 문자열이면 YES를 출력하고 회문 문자열이 아니면 NO를 출력하는 프로그램을 작성

### 📌 문제분석

- 회문(palindrome)은 앞에서 읽는 철자와 뒤에서 읽는 철자가 똑같은 단어이다.

###### 문제출처 : https://www.inflearn.com/course/%ED%8C%8C%EC%9D%B4%EC%8D%AC-%EC%95%8C%EA%B3%A0%EB%A6%AC%EC%A6%98-%EB%AC%B8%EC%A0%9C%ED%92%80%EC%9D%B4-%EC%BD%94%EB%94%A9%ED%85%8C%EC%8A%A4%ED%8A%B8

> #### 🔑 KeyPoint!
>
> 단어의 첫번째 철자(word[0]), 단어의 마지막 철자(word[-1])을 비교하여 결과 반환

### 🔌 Code

```
import sys
sys.stdin = open("2-1 회문 문자열 검사/input.txt", "rt")

n = int(input())
a = []

for i in range(n):
    a.append(input())

for idx, word in enumerate(a):
    word = word.lower()
    for i in range(len(word) // 2):
        if word[i] != word[-1 - i]:
            print("#%d NO" % (idx+1))
            break
    else:
        print("#%d YES" % (idx+1))
```

### 📃 내용정리

- #### if s == s[::-1]:
  - 파이썬을 사용하면 문자열을 리버스 하기 굉장히 간편하지만 권장하지 않는다.
