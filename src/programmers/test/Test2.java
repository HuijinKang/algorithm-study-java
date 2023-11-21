package programmers.test;

public class Test2 {
    public String test(String id) {
        StringBuilder result = new StringBuilder();
        final String ENC = "암호화";

        if (id.contains(",")) {
            String[] arr = id.split(",");
            for (int i = 0; i < arr.length; i++) {
                if (arr.length > 1) {
                    if (i == arr.length - 1) {
                        result.append(arr[i]).append(ENC).append(i);
                    } else {
                        result.append(arr[i]).append(ENC).append(i).append(","); // 암호화
                    }
                } else {
                    result.append(arr[i]).append(ENC).append(i); // 암호화
                }
            }
        } else {
            result.append(id).append(ENC); // 암호화
        }
        return result.toString();
    }

    public static void main(String[] args) {
        Test2 test2 = new Test2();
        System.out.println(test2.test("아이디, 아이디, 아이디"));
    }
}
