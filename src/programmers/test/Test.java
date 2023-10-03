package programmers.test;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public class Test {
    public static void main(String[] args){
        char[] charArr = {'a','b','c'};
        String s = new String(charArr,0,2);
        System.out.println(s);

        String ss = "한글";
        String gg = new String("힌글");
        String gg2 = gg;
        String sss = null;
        ss = ss.replace("한글", "ab"); // 기존 문자열 값이 바뀌진 않음.
        System.out.println(Arrays.toString(ss.getBytes()));
        try {
            System.out.println(System.identityHashCode(gg2));
            System.out.println("글자 수 : "+ss.length());
            byte[] byteArr = ss.getBytes("EUC-KR");
            System.out.println(Arrays.toString(byteArr));
            System.out.println(sss.length()); // NullPointerException 발생 시키기
            sss = new String(byteArr, "UTF-16");
        } catch (UnsupportedEncodingException u) { // 존재하지 않는 캐릭터 셋의 이름을 지정할 경우 예외 발생
            System.out.println(u.toString());
        } catch (NullPointerException ne) {
            System.out.println(ne.toString());
        }
        System.out.println(sss);

    }
}
