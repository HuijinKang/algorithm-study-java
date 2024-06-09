package study;
//  팩토리얼 재귀 함수 예제
/**
    문제
*/
public class Factorial {

    // for
    public int factorial(int number) {
        int sum = 1;
        for (int i = 2; i <= number; i++){
            sum *= i;
        }
        return sum;
    }

    // recursive function
    public int factorial2(int number) {
        if (number == 1)
            return 1;
        else
            return number * factorial2(number - 1);
    }

    public static void main(String[] args) {
        Factorial factorial = new Factorial();
        System.out.println(factorial.factorial2(15));
    }
}
