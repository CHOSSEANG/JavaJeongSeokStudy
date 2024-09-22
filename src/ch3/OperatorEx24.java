package ch3;

public class OperatorEx24 {
    public static void main(String[] args) {
        // 실수형 비교 예제
        // 실수형이 근사값으로 저장되는 것 떄문에 비교 연산자가 제대로 동작하지 않음
        float f = 0.1f;
        double d = 0.1;
        double d2 = (double) f;

        System.out.println("10.0==10.0f ? " + (10.0 == 10.0f));
        System.out.println("0.1==0.1f ? " + (0.1 == 0.1f));
        System.out.println("f=" + f);
        System.out.println("d=" + d);
        System.out.println("d2=" + d2);
        System.out.println("d==f ? " + (d == f));
        System.out.println("d==d2 ? " + (d == d2));
        System.out.println("d2==f ? " + (d2 == f));
    }
}
