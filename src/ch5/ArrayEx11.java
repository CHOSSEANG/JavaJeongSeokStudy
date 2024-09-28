package ch5;

public class ArrayEx11 {
    public static void main(String[] args) {
        // 배열 생성시 값 초기화 예제 => 추후 복습 필요
        int[] number = {1, 2, 3, 4, 5};
        int[] newNumber = new int[10];

        for (int i = 0; i < number.length; i++) {
            newNumber[i] = number[i];
        }
        for (int i = 0; i < newNumber.length; i++) {
            System.out.print(newNumber[i]);
        }
    }
}
