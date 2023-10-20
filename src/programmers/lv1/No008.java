package programmers.lv1;
//  자연수 뒤집어 배열로 만들기

import java.util.Arrays;

/**
    문제 설명
    자연수 n을 뒤집어 각 자리 숫자를 원소로 가지는 배열 형태로 리턴해주세요. 예를들어 n이 12345이면 [5,4,3,2,1]을 리턴합니다.

    제한 조건
    n은 10,000,000,000이하인 자연수입니다.

    입출력 예
    n	return
    12345	[5,4,3,2,1]
*/
public class No008 {
    public int[] solution(long n) {
        String[] arr = Long.toString(n).split("");
        //String s = "" + n; //TODO 스트링 + int를 할경우 스트링으로 인식
        int[] answer = new int[arr.length];

        for (int i = arr.length-1, j = 0; i >= 0; i--) {
            answer[j] = Integer.valueOf(arr[i]);
            j++;
        }
        return answer;
    }
}
