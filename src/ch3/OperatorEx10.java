package ch3;

public class OperatorEx10 {
    public static void main(String[] args) {
        int a = 1000000; // 백만
        int b = 2000000; // 이백만
        long c = a * b; //2,000,000,000,000
        System.out.println(c); // int 타입 범위 초과로 인한 변수 오버 플로
    }
}
