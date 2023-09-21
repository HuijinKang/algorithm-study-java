package programmers.introduction;
//  진료 순서 정하기

import java.util.*;

/**
    문제 설명
    외과의사 머쓱이는 응급실에 온 환자의 응급도를 기준으로 진료 순서를 정하려고 합니다. 정수 배열 emergency가 매개변수로 주어질 때 응급도가 높은 순서대로 진료 순서를 정한 배열을 return하도록 solution 함수를 완성해주세요.

    제한사항
    중복된 원소는 없습니다.
    1 ≤ emergency의 길이 ≤ 10
    1 ≤ emergency의 원소 ≤ 100
    입출력 예
    emergency	result
    [3, 76, 24]	[3, 1, 2]
    [1, 2, 3, 4, 5, 6, 7]	[7, 6, 5, 4, 3, 2, 1]
    [30, 10, 23, 6, 100]	[2, 4, 3, 5, 1]
    입출력 예 설명
    입출력 예 #1

    emergency가 [3, 76, 24]이므로 응급도의 크기 순서대로 번호를 매긴 [3, 1, 2]를 return합니다.
    입출력 예 #2

    emergency가 [1, 2, 3, 4, 5, 6, 7]이므로 응급도의 크기 순서대로 번호를 매긴 [7, 6, 5, 4, 3, 2, 1]를 return합니다.
    입출력 예 #3

    emergency가 [30, 10, 23, 6, 100]이므로 응급도의 크기 순서대로 번호를 매긴 [2, 4, 3, 5, 1]를 return합니다.
*/
public class No039 {
    public int[] solution(int[] emergency) { //TODO 나중에 Map으로 풀어보기
        int[] answer = new int[emergency.length];
        Integer[] emergency2 = Arrays.stream(emergency).boxed().toArray(Integer[]::new);

        Map<Integer, Integer> map = new HashMap<Integer, Integer>() ;
        Arrays.sort(emergency2, Collections.reverseOrder());

        System.out.println(map);

        int i = 1;
        for (int hashMap : emergency2){
            map.put(i, hashMap);
            i++;
        }
        System.out.println(map);

        return answer;
    }

    public int[] solution2(int[] emergency) {
        int[] answer = new int[emergency.length]; //배열 emergency와 같은 길이로 설정

        //배열 값 비교, 자신보다 응급도가 높은 값이 있으면 순서 배열에 +1해줌
        for (int i = 0; i < emergency.length; i++){
            for (int j = 0; j < emergency.length; j++){
                if(emergency[i] <= emergency[j])
                answer[i]++;
            }
        }
        return answer;
    }

    public static void main(String[] args) {

        No039 no039 = new No039();

        int[] arr = {3,76,24};

        System.out.println(Arrays.toString(no039.solution2(arr)));
    }
}
