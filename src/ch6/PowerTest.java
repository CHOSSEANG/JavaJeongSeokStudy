package ch6;

class PowerTest {
    // 재귀 함수 클래스 테스트 다시 한번 복습해볼것!!
    public static void main(String[] args) {
        int x = 2;
        int n = 5;
        long result = 0;

        for (int i = 1; i <= n; i++) {
            result += power(x, i);
        }
        System.out.println(result);
    }

    static long power(int x, int n) {
        if(n==1) return x;
        return x * power(x, n - 1);
    }
}
