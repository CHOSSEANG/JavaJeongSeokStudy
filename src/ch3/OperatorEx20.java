package ch3;

public class OperatorEx20 {
    public static void main(String[] args) {
        // i 가 1부터 10이 될때까지 반복
        for (int i = 1; i <= 10; i++) {
            if (i % 3 == 0) { // 3의 배수면 출력
                System.out.println(i);
            }
        }
    }
}
