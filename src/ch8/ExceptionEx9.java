package ch8;

class ExceptionEx9 {
    public static void main(String[] args) {
        // 컴파일에는 문제가 없는 RuntimeException클래스
        // 실행할 떄 에러가 발생
        throw new RuntimeException();
    }
}
