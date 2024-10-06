package ch12;

// 왜 계속 사이클이 돌아야하는데 2사이클만 돌고 멈추는거지??
class ThreadEx17 {
    public static void main(String[] args) {
        RunImplEx17 r1 = new RunImplEx17();
        RunImplEx17 r2 = new RunImplEx17();
        RunImplEx17 r3 = new RunImplEx17();

        Thread th1 = new Thread(r1, "*");
        Thread th2 = new Thread(r2, "**");
        Thread th3 = new Thread(r3, "***");

        th1.start();
        th2.start();
        th3.start();

        try {
            Thread.sleep(2000);
            r1.suspend();
            Thread.sleep(2000);
            r2.suspend();
            Thread.sleep(3000);
            r1.resume();
            Thread.sleep(3000);
            r1.stop();
            r2.stop();
            Thread.sleep(2000);
            r3.stop();
        }catch(InterruptedException e) {}
    }
}

class RunImplEx17 implements Runnable {
    boolean suspended = false;
    boolean stopped = false;

    public void run() {
        while (!stopped) {
            if (!suspended) {
                System.out.println(Thread.currentThread().getName());
                try {
                    Thread.sleep(1000);
                } catch(InterruptedException e) {}
            }
        }
        System.out.println(Thread.currentThread().getName() + " -stopped");
    }

    public void suspend() {
        suspended = true;
    }

    public void resume() {
        suspended = false;
    }

    public void stop() {
        stopped = true;
    }
}
