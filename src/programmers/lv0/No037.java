package programmers.lv0;
//  문자 반복 출력하기

/**
    문제 설명
    문자열 my_string과 정수 n이 매개변수로 주어질 때, my_string에 들어있는 각 문자를 n만큼 반복한 문자열을 return 하도록 solution 함수를 완성해보세요.

    제한사항
    2 ≤ my_string 길이 ≤ 5
    2 ≤ n ≤ 10
    "my_string"은 영어 대소문자로 이루어져 있습니다.

    입출력 예
    my_string	n	result
    "hello"	3	"hhheeellllllooo"

    입출력 예 설명
    입출력 예 #1
    "hello"의 각 문자를 세 번씩 반복한 "hhheeellllllooo"를 return 합니다.
*/
public class No037 {
    public String solution(String my_string, int n) {
        String answer = "";

        for (int i = 0; i < my_string.length(); i++){
            for (int j = 0; j < n; j++){
                answer += my_string.charAt(i); //TODO 다시 볼 것
            }
        }
        return answer;
    }

    public String solution2(String my_string, int n) { // StringBuilder 예시
        StringBuilder sb = new StringBuilder();
        for(char c : my_string.toCharArray()){
            sb.append((c + "").repeat(n));
        }
        return sb.toString();
    }

    public String solution3(String my_string, int n) { // Array 예시
        String answer = "";
        String[] str = my_string.split("");
        for(int i=0; i<my_string.length(); i++){
            answer += str[i].repeat(n);
        }
        return answer;
    }

    public static void main(String[] args) {
        No037 no037 = new No037();

        System.out.println(no037.solution("hello",3));
    }
}
