package study;
//  피보나치 수열 재귀 함수 예제
/**
    1 + 1 = 2
    1 + 2 = 3
    2 + 3 = 5
    3 + 5 = 8
*/
public class Fibonacci {

    // for
    public int fibonacci (int number) {
        int one = 1;
        int two = 1;
        int result = -1;

        if (number == 1)
            return one;
        else if (number == 2)
            return two;
        else {
            for (int i = 2; i < number; i++){
                result = one + two;
                one = two;
                two = result;
            }
        }
        return result;
    }

    // recursive function
    public int fibonacci2 (int number) {
        if (number == 1)
            return 1;
        else if (number == 2)
            return 1;
        else {
            return fibonacci2(number - 1) + fibonacci2( number - 2);
        }
    }

    // Dynamic Programming(동적 계획법)
    public int fibonacci3(int n) {
        int[] answer = new int[n+1];
        answer[0] = 0;
        answer[1] = 1;

        for (int i = 2; i <= n; i++) {
            answer[i] = answer[i - 1] + answer[i - 2];
        }

        return answer[n];
    }

    public static void main(String[] args) {
        Fibonacci fibonacci = new Fibonacci();
        System.out.println(fibonacci.fibonacci(40));
    }
}
