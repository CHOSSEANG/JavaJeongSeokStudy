package ch7.Ex;

// 배열일 때가 아니라 여기서 어떻게 중복되는 문제를 해결할 수 있을까??
// 이건 추후 해결!!
class SutdaCard3 {
    int num;
    boolean isKwang;

    SutdaCard3() {
        this(1, true);
    }

    SutdaCard3(int num, boolean isKwang) {
        this.num = num;
        this.isKwang = isKwang;
    }

    public String toString() {
        return num + (isKwang ? "K" : "");
    }
}

public class Exercise7_14 {
    public static void main(String[] args) {
        SutdaCard3 card = new SutdaCard3(1, true);
    }
}
