package programmers.lv1;
//  문자열 내 마음대로 정렬하기

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 제한 조건
 strings는 길이 1 이상, 50이하인 배열입니다.
 strings의 원소는 소문자 알파벳으로 이루어져 있습니다.
 strings의 원소는 길이 1 이상, 100이하인 문자열입니다.
 모든 strings의 원소의 길이는 n보다 큽니다.
 인덱스 1의 문자가 같은 문자열이 여럿 일 경우, 사전순으로 앞선 문자열이 앞쪽에 위치합니다.

 입출력 예
 strings	                n	return
 ["sun", "bed", "car"]	    1	["car", "bed", "sun"]
 ["abce", "abcd", "cdx"]	2	["abcd", "abce", "cdx"]

 입출력 예 설명
 입출력 예 1
 "sun", "bed", "car"의 1번째 인덱스 값은 각각 "u", "e", "a" 입니다. 이를 기준으로 strings를 정렬하면 ["car", "bed", "sun"] 입니다.
 입출력 예 2
 "abce"와 "abcd", "cdx"의 2번째 인덱스 값은 "c", "c", "x"입니다. 따라서 정렬 후에는 "cdx"가 가장 뒤에 위치합니다.
 "abce"와 "abcd"는 사전순으로 정렬하면 "abcd"가 우선하므로, 답은 ["abcd", "abce", "cdx"] 입니다.
*/
public class No042 {
    public String[] solution(String[] strings, int n) {
        String[] answer = new String[strings.length];
        List<String> wordList = new ArrayList<>();

        for (String word : strings) {
            wordList.add(word.charAt(n)+word);
        }
        Collections.sort(wordList);
        System.out.println(wordList);

        for (int i = 0; i < wordList.size(); i++) {
            answer[i] = wordList.get(i).substring(1);
        }

        return answer;
    }

    public static void main(String[] args) {
        No042 no042 = new No042();
        String[] arr = {"sun", "bed", "car"};

        System.out.println(Arrays.toString(no042.solution(arr, 1)));
    }
}
