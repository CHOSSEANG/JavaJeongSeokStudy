package ch3;

public class OperatorEx27 {
    public static void main(String[] args) {
        int x = 10;
        int y = -10;

        int absX = (x >= 0) ? x : -x;
        int absY = (y >= 0) ? y : -y;

        System.out.println("x= 10일 때, x의 절대값은 " + absX);
        System.out.println("y= -10일 때, y의 절대값은 " + absY);
    }
}
