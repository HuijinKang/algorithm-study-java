package programmers.introduction;
//  제목
/*
    문제
* */
public class test001 {
    // 분수의 덧셈
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {

        int numerator = 0; // 분자
        int denom = 0; // 분모

        int numerator1 = 0; // 첫번째 분수의 분자
        int numerator2 = 0; // 두번째 분수의 분자

        if(denom1 != denom2){
            denom = denom1 * denom2;
            numerator = (numer1 * denom2) + (numer2 * denom1);
        } else if (denom1 == denom2) {
            denom = denom1;
            numerator = numer1 + numer2;
        }

        for (;denom % 2 == 0 && numerator % 2 == 0;) {
            numerator = numerator / 2;
            denom = denom / 2;
        }
        int x = denom % numerator;
        if (numerator % denom == 0){
            numerator = numerator / denom;
            denom = 1;
        } else if (denom % numerator== 0) {
            denom = numerator / denom;
            numerator = 1;
        }

        int[] answer = {numerator, denom};

        return answer;
    }
}
