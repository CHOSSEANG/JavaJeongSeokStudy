package ch12;

// 질문
// 책에서는 Thread가 1이 추가되는 걸로 나오는데
// 시간이 흐름에 따라서 컴퓨터 성능이 달라져서 발생한 문제일 수 있음!!!
// 왜 여기서는 Thread가 2가 추가되는 걸로 나오는가??
class ThreadEx1 {
    public static void main(String[] args) {
        ThreadEx1_1 t1 = new ThreadEx1_1();

        Runnable r = new ThreadEx1_2();
        Thread t2 = new Thread(r);

        t1.start();
        t2.start();
    }
}

class ThreadEx1_1 extends Thread {
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(getName());
        }
    }
}

class ThreadEx1_2 extends Thread {
    public void run() {
        for (int i = 0; i < 5; i++) {
            // Thread.currentThread()
            System.out.println(Thread.currentThread().getName());
        }
    }
}
