package programmers.introduction;
//  짝수는 싫어요

import java.util.ArrayList;
import java.util.Arrays;

/**
    문제 설명
    정수 n이 매개변수로 주어질 때, n 이하의 홀수가 오름차순으로 담긴 배열을 return하도록 solution 함수를 완성해주세요.

    제한사항
    1 ≤ n ≤ 100
    입출력 예
    n	result
    10	[1, 3, 5, 7, 9]
    15	[1, 3, 5, 7, 9, 11, 13, 15]
    입출력 예 설명
    입출력 #1

    10 이하의 홀수가 담긴 배열 [1, 3, 5, 7, 9]를 return합니다.
    입출력 #1

    15 이하의 홀수가 담긴 배열 [1, 3, 5, 7, 9, 11, 13, 15]를 return합니다.
*/
public class No035 {
    public int[] solution(int n) {

        int[] answer = new int[(int) Math.round((double) n/2)]; // 반올림 하여 크기 할당 ex) n = 11, 11/2 = 5.5 -> 6으로 반올림

        for (int i = 0, j = 0; i <= n; i++){
            if (i%2 != 0) {
                answer[j] = i;
                j++;
            }
        }

        return answer;
    }

    public ArrayList solution2(int n) { // 방법2. ArrayList
        ArrayList<Integer> answer = new ArrayList<Integer>();

        for(int i=1; i<=n; i++){
            if(i%2 != 0) {
                answer.add(i);
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        No035 no035 = new No035();
        System.out.println(Arrays.toString(no035.solution(11)));
    }
}
