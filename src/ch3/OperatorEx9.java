package ch3;

public class OperatorEx9 {
    public static void main(String[] args) {
        byte a = 10;
        byte b = 30;
        byte c = (byte) (a * b); // 형변환에 의한 데이터 손실 발생
        System.out.println(c);
    }
}
