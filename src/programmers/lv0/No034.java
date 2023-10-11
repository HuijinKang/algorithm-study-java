package programmers.lv0;
//  최빈값 구하기

import java.util.Arrays;

/**
    문제 설명
    최빈값은 주어진 값 중에서 가장 자주 나오는 값을 의미합니다. 정수 배열 array가 매개변수로 주어질 때, 최빈값을 return 하도록 solution 함수를 완성해보세요. 최빈값이 여러 개면 -1을 return 합니다.

    제한사항
    0 < array의 길이 < 100
    0 ≤ array의 원소 < 1000
    입출력 예
    array	result
    [1, 2, 3, 3, 3, 4]	3
    [1, 1, 2, 2]	-1
    [1]	1
    입출력 예 설명
    입출력 예 #1

    [1, 2, 3, 3, 3, 4]에서 1은 1개 2는 1개 3은 3개 4는 1개로 최빈값은 3입니다.
    입출력 예 #2

    [1, 1, 2, 2]에서 1은 2개 2는 2개로 최빈값이 1, 2입니다. 최빈값이 여러 개이므로 -1을 return 합니다.
    입출력 예 #3

    [1]에는 1만 있으므로 최빈값은 1입니다.
*/
public class No034 {
    public int solution(int[] array) {
        int answer = 0;
        Arrays.sort(array);
        int k = array.length + 1; // 배열 중 가장 높은 숫자를 담는 변수
        if(array.length < array[array.length-1]){ // 만약 배열의 개수보다 마지막 인덱스의 숫자가 더 크면 마지막 인덱스를 변수 k에 담는다
            k = array[array.length-1]+1;
        }
        int[] count = new int[k]; // 데이터의 개수를 새서 넣어줄 배열 선언
        int max = 0; // 가장 많은 개수 담는 변수
        int maxCount = 0; // 최빈값의 중첩 횟수를 담는 변수

        for (int i = 0; i < array.length; i++){ // 데이터를 자리에 맞게 넣어주고 개수를 센다.
            count[array[i]]++;
        }
        for (int j = 0; j < count.length; j++){ // 가장 높은 숫자의 자릿수를 max에 담는다
            if (max < count[j]) {
                max = count[j];
            }
        }
        for (int z = 0; z < count.length; z++){ // 최빈값이 같은 배열의 자릿수를 담는다
            if(max == count[z]){
                answer = z;
                maxCount++;
                if(maxCount >= 2) answer = -1; // 만약 최빈값이 2개 이상이면 -1 리턴
            }
        }
        System.out.println(Arrays.toString(count)+"//"+max+"//"+answer+"//"+maxCount);

        return answer;
    }

    public static void main(String[] args) {
        No034 no034 = new No034();
        int[] i = {1,1,1,1,2,2,2,10};

        System.out.println(no034.solution(i));
    }
}
