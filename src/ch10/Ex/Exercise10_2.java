package ch10.Ex;

class Outer2 {
    static class Inner {
        int iv = 200;
    }
}

class Exercise10_2 {
    public static void main(String[] args) {
        Outer2 oc = new Outer2();
        Outer2.Inner inner = new Outer2.Inner();
        System.out.println(inner.iv);
    }
}
