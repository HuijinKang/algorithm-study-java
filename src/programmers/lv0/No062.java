package programmers.lv0;
//  약수 구하기

import java.util.ArrayList;
import java.util.Arrays;

/**
    문제 설명
    정수 n이 매개변수로 주어질 때, n의 약수를 오름차순으로 담은 배열을 return하도록 solution 함수를 완성해주세요.

    제한사항
    1 ≤ n ≤ 10,000

    입출력 예
    n	result
    24	[1, 2, 3, 4, 6, 8, 12, 24]
    29	[1, 29]

    입출력 예 설명
    입출력 예 #1
    24의 약수를 오름차순으로 담은 배열 [1, 2, 3, 4, 6, 8, 12, 24]를 return합니다.
    입출력 예 #2
    29의 약수를 오름차순으로 담은 배열 [1, 29]를 return합니다.
*/
public class No062 {
    public int[] solution(int n) {
        ArrayList list = new ArrayList();
        for (int i = 1; i <= n; i++) {
            if(n % i == 0) {
                list.add(i);
            }
        }
        int[] answer = list.stream().mapToInt(i-> (int) i).toArray(); // TODO int 기본형(primitive) 변환 - Stream API (Java8 이상)
        return answer;
    }

    public static void main(String[] args) {
        No062 no062 = new No062();
        System.out.println(Arrays.toString(no062.solution(24)));
    }
}
