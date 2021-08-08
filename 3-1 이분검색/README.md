### 🥉 이분검색

> #### 내용
>
> - 이분검색(Binary Search)은 오름차순으로 정렬된 리스트에서 특정한 값의 위치를 찾는 알고리즘이다.
> - 처음 중간의 값을 임의의 값으로 선택하여, 그 값과 찾고자 하는 값의 크고 작음을 비교하는 방식을 채택하고 있다. 처음 선택한 중앙값이 만약 찾는 값보다 크면 그 값은 새로운 최댓값이 되며, 작으면 그 값은 새로운 최솟값이 된다. 검색 원리상 정렬된 리스트에만 사용할 수 있다는 단점이 있지만, 검색이 반복될 때마다 목표값을 찾을 확률은 두 배가 되므로 속도가 빠르다는 장점이 있다.

###### 문제출처 : https://www.inflearn.com/course/%ED%8C%8C%EC%9D%B4%EC%8D%AC-%EC%95%8C%EA%B3%A0%EB%A6%AC%EC%A6%98-%EB%AC%B8%EC%A0%9C%ED%92%80%EC%9D%B4-%EC%BD%94%EB%94%A9%ED%85%8C%EC%8A%A4%ED%8A%B8

### 🔌 Code

```python
import sys
sys.stdin = open("3-1 이분검색/input.txt", "rt")

n, m = map(int, input().split())
a = list(map(int, input().split()))
a.sort()

lt = 0
rt = n-1

while lt <= rt:
    mid = (lt + rt) // 2    # 중간값

    if a[mid] == m:     # 값이 일치하면 종료
        print(mid+1)
        break
    elif a[mid] > m:    # 중간값이 크면 오른쪽 값들은 버린다
        rt = mid - 1
    else:               # 중간값이 작으면 왼쪽 값들은 버린다
        lt = mid + 1

```
