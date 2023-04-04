package LeetCode.PrintinOrder_1114;

class Foo {
    private int flag;

    public Foo() {
        this.flag = 1;
    }

    public void first(Runnable printFirst) throws InterruptedException {
        synchronized (this) {
            while (flag != 1) {
                wait();
            }
            printFirst.run();
            flag++;
            notifyAll();
        }
    }

    public void second(Runnable printSecond) throws InterruptedException {
        synchronized (this) {
            while (flag != 2) {
                wait();
            }
            printSecond.run();           
            flag++;
            notifyAll();
        }
    }

    public void third(Runnable printThird) throws InterruptedException {
         synchronized (this) {
            while (flag != 3) {
                wait();
            }
            printThird.run();
            flag = 1;
            notifyAll();
        }
    }
}