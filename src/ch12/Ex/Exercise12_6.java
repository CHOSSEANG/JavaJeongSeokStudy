package ch12.Ex;

class Exercise12_6 {
    public static void main(String[] args) throws Exception{
        Thread4 th1 = new Thread4();
        th1.setDaemon(true);
        th1.start();

        try {
            th1.sleep(5 * 1000);
        } catch (Exception e) {

        }

        throw new Exception("꽝~~!!!");
    }
}

class Thread4 extends Thread {
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(i);

            try {
                Thread.sleep(1000);
            } catch (Exception e) {

            }
        }
    }
}

//실행결과 예측
/*
0부터 9까지의 숫자가 1초에 1번씩 출력된다

그다음 5초 뒤에 꽝 하는 에러가 출력된다..

그 다음 나머지 숫자가 다시 1초에 1번씩 출력되어 종료된다.
* */

//실행결과 예측
/*
0부터 9까지의 숫자가 1초에 1번씩 출력된다

그다음 5초 뒤에 꽝 하는 에러와 함꼐 프로그램이 종료된다.
* */

// 실행결과 다른 이유
/*
* th1 쓰레드를 데몬 쓰레드로 설정한 것.
* 데몬 쓰레드의 경우 일반 쓰레드가 모두 종료되면
* 자동 종료되기 떄문에 에러가 나서 main 쓰레드가 종료되면서 같이 종료되어 프로그램이 종료된것
*
*
* */
