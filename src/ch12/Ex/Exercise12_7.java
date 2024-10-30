package ch12.Ex;

class Exercise12_7 {
    static boolean stopped = false;

    public static void main(String[] args) {
        Thread5 th1 = new Thread5();
        th1.start();

        try {
            Thread.sleep(6 * 1000);
        } catch (Exception e) {

        }

        stopped = true;
        th1.interrupt(); // 일시정지 상태의 쓰레드를 깨우는 코드
        System.out.println("stopped");
    }
}

class Thread5 extends Thread {
    public void run() {
        for (int i = 0; !Exercise12_7.stopped; i++) {
            System.out.println(i);

            try {
                Thread.sleep(3 * 1000);
            } catch (Exception e) {

            }
        }
    }
}

//바로 종료되지 않는 이유
/*
.... 나는 stopped 이 나온다음 바로 프로그램이 종료된다.
* */

//코드 변경 후
/*
크게 달라진게 없다.
아마 예전과 지금의 해당 쓰레드 코드가 다르게 동작한다고 추측이 가능하다.
* */