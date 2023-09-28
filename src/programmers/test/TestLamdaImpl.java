package programmers.test;

public class TestLamdaImpl implements TestLamda{
    @Override
    public TestObject testObject(String name, int age) {
        System.out.println(name+age+"impl 출력");
        return new TestObject();
    }
}
