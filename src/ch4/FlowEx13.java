package ch4;

public class FlowEx13 {
    public static void main(String[] args) {
        int sum = 0;

        for (int i = 1; i <= 10; i++) {
            sum += i;
        }
       // System.out.println(i - 1 + " 까지의 합: " + sum);// 에러가 발생하는 구문
    }
}
