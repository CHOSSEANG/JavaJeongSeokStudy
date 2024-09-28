package ch5;

public class ArrayEx8 {
    public static void main(String[] args) {
        //ChartAt 사용 예제
        String src = "ABCDE";

        for (int i = 0; i < src.length(); i++) {
            System.out.println("src.chartAt(" + i + "):" + src.charAt(i));
        }
    }
}
