package ch3;

public class OperatorEx6 {
    public static void main(String[] args) {
        byte b = 10;
        // byte result = ~b;
        byte result = (byte) ~b;

        System.out.println("b = " + b);
        System.out.println("~b = " + result);

    }
}
