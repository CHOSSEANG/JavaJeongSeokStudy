package ch4;

public class FlowEx19 {
    public static void main(String[] args) {
        // 컴퓨터 성능에 따라 다른 속도가 나옴
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < 1000000000; i++) {
            ;
        }
        long endTime = System.currentTimeMillis();

        System.out.println("시작시간 : " + startTime);
        System.out.println("종료시간 : " + endTime);
        System.out.println("소요시간 : " + (endTime - startTime));
    }
}
