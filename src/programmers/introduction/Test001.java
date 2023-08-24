package programmers.introduction;
//  제목
/*
    문제
* */
public class Test001 {
    // 분수의 덧셈
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {

        int numerator = 0; // 분자
        int denom = 0; // 분모
        int max = 1; // 최대공약수

        if(denom1 != denom2){
            denom = denom1 * denom2;
            numerator = (numer1 * denom2) + (numer2 * denom1);
        } else if (denom1 == denom2) {
            denom = denom1;
            numerator = numer1 + numer2;
        }

        for (int i = 1; i <= numerator && i <= denom; i++) {
            if (numerator % i == 0 && denom % i == 0) {
                max = i;
            }
        }

        int[] answer = {numerator / max, denom / max};

        return answer;
    }
}
