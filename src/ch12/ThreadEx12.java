package ch12;

import java.util.Iterator;
import java.util.Map;


// 개인적으로 실행하고 있는 프로그램들 때문에 실제 예제보다 더 많은 데몬 쓰레드가 생성된 듯함
class ThreadEx12 {
    public static void main(String[] args) throws Exception{
        ThreadEx12_1 t1 = new ThreadEx12_1("Thread1");
        ThreadEx12_2 t2 = new ThreadEx12_2("Thread2");
        t1.start();
        t2.start();
    }
}

class ThreadEx12_1 extends Thread{
    ThreadEx12_1(String name) {
        super(name);
    }

    public void run() {
        try {
            sleep(5 * 1000);
        } catch (InterruptedException e) {}
    }
}

class ThreadEx12_2 extends Thread{
    ThreadEx12_2(String name) {
        super(name);
    }

    public void run() {
        Map map = getAllStackTraces();
        Iterator it = map.keySet().iterator();

        int x = 0;
        while(it.hasNext()) {
            Object obj = it.next();
            Thread t = (Thread)(obj);
            StackTraceElement[] ste = (StackTraceElement[])(map.get(obj));

            System.out.println("[" + ++x + "] name : " + t.getName()
                    + ", group : " + t.getThreadGroup().getName()
                    + ", daemon : " + t.isDaemon());

            for (int i = 0; i < ste.length; i++) {
                System.out.println(ste[i]);
            }
            System.out.println();
        }
    }
}
