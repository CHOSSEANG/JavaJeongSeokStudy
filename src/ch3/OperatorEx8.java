package ch3;

public class OperatorEx8 {
    public static void main(String[] args) {
        byte a = 10;
        byte b = 20;
        byte c = (byte)(a + b); // byte형 변수 2개를 + 연산자로 더할 경우 int형으로 형변환이 일어남
        System.out.println(c);
    }
}
