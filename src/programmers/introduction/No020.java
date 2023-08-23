package programmers.introduction;

import java.util.Arrays;

//  배열 자르기
/*
    문제 설명
    정수 배열 numbers와 정수 num1, num2가 매개변수로 주어질 때, numbers의 num1번 째 인덱스부터 num2번째 인덱스까지 자른 정수 배열을 return 하도록 solution 함수를 완성해보세요.

    제한사항
    2 ≤ numbers의 길이 ≤ 30
    0 ≤ numbers의 원소 ≤ 1,000
    0 ≤num1 < num2 < numbers의 길이

    입출력 예
    numbers	num1	num2	result
    [1, 2, 3, 4, 5]	1	3	[2, 3, 4]
    [1, 3, 5]	1	2	[3, 5]

    입출력 예 설명
    입출력 예 #1
    [1, 2, 3, 4, 5]의 1번째 인덱스 2부터 3번째 인덱스 4 까지 자른 [2, 3, 4]를 return 합니다.
    입출력 예 #2
    [1, 3, 5]의 1번째 인덱스 3부터 2번째 인덱스 5까지 자른 [3, 5]를 return 합니다.
* */
public class No020 {
    public int[] solution(int[] numbers, int num1, int num2) {

        int[] answer = new int[num2 - num1 + 1];

        for (int i = num1, j = 0; i < num2 + 1; i++, j++){
            answer[j] = numbers[i];
        }

        return answer;
    }

    // Arrays.copyOfRange 예시
    public int[] solution2(int[] numbers, int num1, int num2) {

        return Arrays.copyOfRange(numbers, num1, num2 + 1);
        // Arrays.copyOf(복사할 배열, 복사할 배열의 크기)
        // Arrays.copyOfrange(복사할 배열, 시작 위치, 배열 크기)
    }

}
