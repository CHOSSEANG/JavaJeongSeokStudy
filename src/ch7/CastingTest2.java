package ch7;

class CastingTest2 {
    public static void main(String[] args) {
        Car car = new Car();
        Car car2 = null;
        FireEngine fe = null;

        car.drive();
        fe = (FireEngine) car; // 실행 에러 => 이 부분 이해 필요
        fe.drive();
        car2 = fe;
        car2.drive();
    }
}
