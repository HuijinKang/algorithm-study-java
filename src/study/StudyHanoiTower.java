package study;
//  하노이 탑 재귀 함수 예제
/**
    문제
*/
public class StudyHanoiTower {
    public static void hanoiTower(int n, char from, char mid, char to) { // 원반 개수, 어느 탑에서 어느 탑을 이용해서 어느 탑으로 가는 지
        if (n == 1) {
            System.out.printf("원반 %d를 %c에서 %c로 이동\n", n, from, to);
            return;
        }
        hanoiTower(n - 1, from, to, mid);
        System.out.printf("원반 %d를 %c에서 %c로 이동\n", n, from, to);
        hanoiTower(n - 1, mid, from, to);
    }

    public static void main(String[] args) {
        hanoiTower(3,'A', 'B', 'C');
    }
}

