package programmers.introduction;
//  합성수 찾기

import programmers.test.TestLamda;
import programmers.test.TestObject;

/**
    문제 설명
    약수의 개수가 세 개 이상인 수를 합성수라고 합니다. 자연수 n이 매개변수로 주어질 때 n이하의 합성수의 개수를 return하도록 solution 함수를 완성해주세요.

    제한사항
    1 ≤ n ≤ 100
    입출력 예
    n	result
    10	5
    15	8
    입출력 예 설명
    입출력 예 #1

    10 이하 합성수는 4, 6, 8, 9, 10 로 5개입니다. 따라서 5를 return합니다.
    입출력 예 #1

    15 이하 합성수는 4, 6, 8, 9, 10, 12, 14, 15 로 8개입니다. 따라서 8을 return합니다.
*/
public class No048 {
    public int solution(int n) {
        int answer = 0;
        int count = 0; // 합성수의 개수
        for (int i = 1; i <= n; i++){
            for (int j = 1; j <= i; j++){
                if (i%j == 0){
                    count++; // 합성수 개수 세기
                }
            }
            if (count >= 3) { // 합성수 3개 이상이면 ++
                answer++;
            }
            count = 0; // 0으로 초기화
        }
        return answer;
    }

    public static void main(String[] args) {
        No048 no048 = new No048();
        System.out.println(no048.solution(10));
    }
}
