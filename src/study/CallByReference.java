package study;

import java.util.HashMap;
import java.util.Map;

public class CallByReference {

    static class User {
        private int age;

        public User(int age) {
            this.age = age;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        @Override
        public String toString() {
            return "User{" +
                    "age=" + age +
                    '}';
        }
    }

    public static void main(String[] args) {

        //////////referenceType//////////
        User user1 = new User(10);
        User user2 = new User(30);
        Map<String, Integer> testMap = new HashMap<>();

        System.out.println("user1 before : "+user1.toString());
        testReferenceType(user1);
        System.out.println("user1 after : "+user1.toString());

        System.out.println("user2 before : "+user2.toString());
        testReferenceType(user2);
        System.out.println("user2 after : "+user2.toString());

        testMap.put("test1", 1);
        System.out.println("map before : "+testMap);
        testReferenceTypeMap(testMap);
        System.out.println("map after : "+testMap);

        //////////primitiveType//////////
        int number = 5;

        testPrimitiveType(number);
        System.out.println("number after : "+number);

    }

    public static void testReferenceType(User user) {
        user.setAge(20);
    }

    public static void testReferenceTypeMap(Map map) {
        map.put("test2", 10);
    }

    public static void testPrimitiveType(int number) {
        number++;
    }

}
