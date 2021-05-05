### 🥉 숫자만 추출

> #### 문제
>
> 숫자만 추출하여 그 순서대로 자연수를 만들고 약수의 개수를 출력하는 프로그램 작성

### 📌 문제분석

- 문자열에서 숫자인지 판별하는 함수를 사용하여 숫자를 판별

###### 문제출처 : https://www.inflearn.com/course/%ED%8C%8C%EC%9D%B4%EC%8D%AC-%EC%95%8C%EA%B3%A0%EB%A6%AC%EC%A6%98-%EB%AC%B8%EC%A0%9C%ED%92%80%EC%9D%B4-%EC%BD%94%EB%94%A9%ED%85%8C%EC%8A%A4%ED%8A%B8

### 🔌 Code

```
import sys
sys.stdin = open("2-2 숫자만 추출/input.txt", "rt")

n = input()
res = 0
for i in n:
    # isdecimal : 0 ~ 9 문자열이 int 타입으로 변환 가능한 문자로 구성됐을 때 true 리턴
    if i.isdecimal():
        res = res * 10 + int(i)

print(res)
cnt = 0
for i in range(1, res + 1):
    if res % i == 0:
        cnt += 1

print(cnt)
```

### 📃 내용정리

- #### isdecimal()

  - 문자열이 int 타입으로 변환 가능한 문자로 구성됐을 때 true 리턴한다. 즉, 특수문자 중 숫자모양을 숫자로 취급하지 않음

- #### isdigit()

  - 특수문자가 포함된 문자열이 숫자인지 확인 후 True, False로 리턴, 3²

- #### isnumeric()
  - 숫자값 표현에 해당하는 텍스트까지 인정, ½
