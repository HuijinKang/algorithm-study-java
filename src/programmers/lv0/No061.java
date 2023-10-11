package programmers.lv0;
//  한 번만 등장한 문자

import java.util.Arrays;

/**
    문제 설명
    문자열 s가 매개변수로 주어집니다. s에서 한 번만 등장하는 문자를 사전 순으로 정렬한 문자열을 return 하도록 solution 함수를 완성해보세요. 한 번만 등장하는 문자가 없을 경우 빈 문자열을 return 합니다.

    제한사항
    0 < s의 길이 < 1,000
    s는 소문자로만 이루어져 있습니다.

    입출력 예
    s	result
    "abcabcadc"	"d"
    "abdc"	"abcd"
    "hello"	"eho"

    입출력 예 설명
    입출력 예 #1
    "abcabcadc"에서 하나만 등장하는 문자는 "d"입니다.
    입출력 예 #2
    "abdc"에서 모든 문자가 한 번씩 등장하므로 사전 순으로 정렬한 "abcd"를 return 합니다.
    입출력 예 #3
    "hello"에서 한 번씩 등장한 문자는 "heo"이고 이를 사전 순으로 정렬한 "eho"를 return 합니다.
*/
public class No061 {
    public String solution(String s) {
        String answer = "";
        String[] sArr = s.split("");
        Arrays.sort(sArr);
        int[] iArr = new int[s.length()];

        for (int i = 0; i < iArr.length; i++) {
            for (int j = 0; j < iArr.length; j++) {
                if (sArr[i].equals(sArr[j])) {
                    iArr[i]++;
                }
            }
        }
        for (int x = 0; x < iArr.length; x++) {
            if (iArr[x] == 1) {
                answer += sArr[x];
            }
        }
        return answer;
    }

    public String solution2(String s) { // TODO toCharArray 다시 볼 것
        int[] alpha = new int[26];
        for(char c : s.toCharArray()){
            alpha[c - 'a']++;
        }

        StringBuilder answer = new StringBuilder();
        for(int i = 0; i < 26; i++){
            if(alpha[i] == 1){
                answer.append((char)(i + 'a'));
            }
        }
        return answer.toString();
    }

    public static void main(String[] args) {
        No061 no061 = new No061();
        System.out.println(no061.solution("hello"));
    }
}
