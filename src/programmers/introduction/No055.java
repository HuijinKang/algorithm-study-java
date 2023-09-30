package programmers.introduction;
//  가까운 수

import java.util.Arrays;

/**
    문제 설명
    정수 배열 array와 정수 n이 매개변수로 주어질 때, array에 들어있는 정수 중 n과 가장 가까운 수를 return 하도록 solution 함수를 완성해주세요.

    제한사항
    1 ≤ array의 길이 ≤ 100
    1 ≤ array의 원소 ≤ 100
    1 ≤ n ≤ 100
    가장 가까운 수가 여러 개일 경우 더 작은 수를 return 합니다.

    입출력 예
    array	n	result
    [3, 10, 28]	20	28
    [10, 11, 12]	13	12

    입출력 예 설명
    입출력 예 #1
    3, 10, 28 중 20과 가장 가까운 수는 28입니다.
    입출력 예 #2
    10, 11, 12 중 13과 가장 가까운 수는 12입니다.
*/
public class No055 {
    public int solution(int[] array, int n) {
        int answer = array[0];
        int abs = 0;
        abs = Math.abs(n - array[0]);
        Arrays.sort(array);

        for (int i = 0; i < array.length; i++) {
            if (abs >= Math.abs(n - array[i])) {
                if (abs == Math.abs(n - array[i]) && answer < array[i]){
                    continue;
                }
                abs = Math.abs(n - array[i]);
                answer = array[i];
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        No055 no055 = new No055();
        int[] arr = {10,12,14};
        System.out.println(no055.solution(arr, 13));
    }
}
