package ch2;

public class ByteOverflow {
    public static void main(String[] args) {
        byte b = 0; // byte형 변수 b 를 선언하고 0으로 초기화
        int i = 0;

        // 반복문을 이용해서 b의 값을 1씩 증가
        for(int x=0;x<=270;x++){
            System.out.print(b++);
            System.out.print('\t'); // tab 을 출력
            System.out.println(i++);
        }
        // 결과를 보다보면 byte의 범위를 초과해서 over flow 가 발생하는 것 확인할 수 있음
    }
}
