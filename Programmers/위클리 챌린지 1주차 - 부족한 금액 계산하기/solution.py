def solution(price, money, count):
    answer = -1
    totalPrice = 0

    for i in range(1, count + 1):
        totalPrice += price * i

    if money > totalPrice:
        return 0

    answer = totalPrice - money

    return answer


solution(3, 20, 4)

# 입출력 예시
# 이용금액이 3인 놀이기구를 4번 타고 싶은 고객이 현재 가진 금액이 20이라면, 총 필요한 놀이기구의 이용 금액은 30 (= 3+6+9+12) 이 되어 10만큼 부족하므로 10을 return 합니다.
