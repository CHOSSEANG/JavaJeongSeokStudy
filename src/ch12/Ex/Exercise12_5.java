package ch12.Ex;

class Exercise12_5 {
    public static void main(String[] args) throws Exception{
        Thread3 th1 = new Thread3();
        th1.start();

        try {
            Thread.sleep(5 * 1000);
        }catch (Exception e) {}

        throw new Exception("꽝~!!!");
    }
}

class Thread3 extends Thread {
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
1부터 10까지의 숫자가 1초에 1번씩 출력된다

그다음 5초 뒤에 꽝 하는 에러와 함꼐 프로그램이 종료된다.
* */

//실행결과
/*
0부터 9까지의 숫자가 1초에 1번씩 출력된다

4에서 5사이에 꽝 하는 메세지와 함께 에러가 발생

그리고 나머지 9까지의 숫자가 출력된 뒤에 프로그램이 종료된다.
* */
