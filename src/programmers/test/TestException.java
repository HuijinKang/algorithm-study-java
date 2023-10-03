package programmers.test;

public class TestException {
    public static void main(String[] args) {

        try {
            // 예외 발생 시뮬레이션 - null 포인터 참조
            String str = null;
            System.out.println(str.length());
        /*} catch (NullPointerException ne) {
            //ne.printStackTrace();
            //System.out.println("ddd"+ne.getMessage());*/
        } catch (Throwable e) {
            // 모든 예외를 처리하는 부분
            //e.printStackTrace();
            System.out.println(e.toString());
            //System.out.println("예외가 발생했습니다: " + e.getMessage());
        }
    }
}
