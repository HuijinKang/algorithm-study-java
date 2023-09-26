package programmers.test;

public class TestObject {
    String name;
    int age;

    public TestObject() {
    }

    public TestObject(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println(name+age);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
