def solution(scores):
    answer = ''

    for i in range(len(scores)):
        avg = 0
        scoreList = []

        # i 학생이 받은 점수 리스트
        for j in range(len(scores[i])):
            scoreList.append(scores[j][i])

        # 자기 자신을 평가한 점수가 유일한 최고점 또는 유일한 최저점이라면
        if scoreList[i] == max(scoreList) or scoreList[i] == min(scoreList):

            # 중복이 존재한다면
            if scoreList.count(scoreList[i]) > 1:
                avg = sum(scoreList) / len(scoreList)

            # 중복이 존재하지 않는다면 제거
            else:
                scoreList.remove(scoreList[i])
                avg = sum(scoreList) / len(scoreList)

        # 제외할 점수는 제외하고 평균
        else:
            avg = sum(scoreList) / len(scoreList)

        # 최종 학점 부여
        if avg >= 90:
            answer += 'A'
        elif avg >= 80:
            answer += 'B'
        elif avg >= 70:
            answer += 'C'
        elif avg >= 50:
            answer += 'D'
        else:
            answer += 'F'

    return answer


solution([[100, 90, 98, 88, 65], [50, 45, 99, 85, 77], [
         47, 88, 95, 80, 67], [61, 57, 100, 80, 65], [24, 90, 94, 75, 65]])
