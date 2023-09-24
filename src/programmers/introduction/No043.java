package programmers.introduction;
//  구슬을 나누는 경우의 수

import java.math.BigInteger;

/**
    문제 설명
    머쓱이는 구슬을 친구들에게 나누어주려고 합니다. 구슬은 모두 다르게 생겼습니다. 머쓱이가 갖고 있는 구슬의 개수 balls와 친구들에게 나누어 줄 구슬 개수 share이 매개변수로 주어질 때, balls개의 구슬 중 share개의 구슬을 고르는 가능한 모든 경우의 수를 return 하는 solution 함수를 완성해주세요.

    제한사항
    1 ≤ balls ≤ 30
    1 ≤ share ≤ 30
    구슬을 고르는 순서는 고려하지 않습니다.
    share ≤ balls

    입출력 예
    balls	share	result
    3	2	3
    5	3	10

    입출력 예 설명
    입출력 예 #1
    서로 다른 구슬 3개 중 2개를 고르는 경우의 수는 3입니다.
    입출력 예 #2
    서로 다른 구슬 5개 중 3개를 고르는 경우의 수는 10입니다.
    Hint
    서로 다른 n개 중 m개를 뽑는 경우의 수 공식은 다음과 같습니다.
*/
public class No043 { //TODO 이해될 때까지 볼 것

    public static void main(String[] args) {
        No043 no043 = new No043();
        System.out.println(no043.solution4(100 ,30));
    }

    public int solution(int balls, int share) { // 큰 수가 매개변수로 담길 경우 연산 오류
        long answer = 0;
        long n = balls; // 87178291200
        long nm = balls-share; // 3628800
        long m = share; // 24, 87091200

        for (long j = nm-1; j >= 1; j--){
            nm *= j;
        }
        for (long x = m-1; x >= 1; x--){
            m *= x;
        }
        for(long i = n-1; i >= 1; i--){
            n *= i;
        }System.out.println(n);
        answer = n/(nm*m);
        return (int) answer;
    }

    public static int solution2(int balls, int share) { // 재귀 함수
        if (balls == share || share == 0) return 1;
        return solution2((balls - 1), (share - 1)) + solution2(balls - 1, share);
    }

    public int solution3(int balls, int share) {
        long answer = 1;
        int shareIndex = 1;
        for(int i = share+1; i <= balls; i++){
            answer *= i;
            answer /= shareIndex;
            shareIndex++;
        }

        return (int)answer;
    }

    //////////////////////////////////////////
    public BigInteger factorial(long n) {
        BigInteger one = BigInteger.valueOf(1);
        BigInteger num = BigInteger.valueOf(n);
        if (n == 1)
            return one;
        else
            return num.multiply(factorial(n - 1));
    }

    public BigInteger solution4(long balls, long share) {
        if (balls == share) {
            return BigInteger.valueOf(1);
        }
        return  factorial(balls).divide((factorial(balls - share).multiply(factorial(share))));
    }
    //////////////////////////////////////////











































}
