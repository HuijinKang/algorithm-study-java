package study;

public class StudyThread {

    public static class Calc {
        private int a = 0;

        public int getA() {
            return this.a;
        }

        public void setA(int number) {
            this.a = number;
        }

        public void plus(int n) {
            this.a = n + a;
        }
    }

    public static class TestThread extends Thread {
        private Calc clac;

        public TestThread(Calc clac) {
            this.clac = clac;
        }

        public void run() {
            long beforeTime = System.currentTimeMillis();
            for (int i = 0; i < 10; i++) {
                //clac.plus(3);
                synchronized (clac) {
                    int plus = clac.getA() + 1;
                    clac.setA(plus);
                }
                try {
                    sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println(clac.a);
            }
            interrupt();
            long afterTime = System.currentTimeMillis();
            System.out.println(afterTime - beforeTime); // 시간 측정
        }
    }

    public static void main(String[] args) {
        Calc calc = new Calc();
        TestThread thread1 = new TestThread(calc);
        TestThread thread2 = new TestThread(calc);
        TestThread thread3 = new TestThread(calc);

        thread1.start();
        thread2.start();
        thread3.start();
        System.out.println();
    }
}
