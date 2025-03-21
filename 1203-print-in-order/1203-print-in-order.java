class Foo {
    private final Semaphore fst=new Semaphore(0),sec=new Semaphore(0);
    public Foo() {
        
    }

    public void first(Runnable printFirst) throws InterruptedException {
        printFirst.run();
        fst.release();
    }

    public void second(Runnable printSecond) throws InterruptedException {
        fst.acquire();
        printSecond.run();
        sec.release();
    }

    public void third(Runnable printThird) throws InterruptedException {
        sec.acquire();
        printThird.run();
    }
}