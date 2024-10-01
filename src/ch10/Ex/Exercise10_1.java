package ch10.Ex;

class Outer {
    static class Inner {
        int iv = 100;
    }
}

class Exercise10_1 {
    public static void main(String[] args) {
        Outer ot = new Outer();
        Outer.Inner in = new Outer.Inner();
        System.out.println(in.iv);
    }
}
