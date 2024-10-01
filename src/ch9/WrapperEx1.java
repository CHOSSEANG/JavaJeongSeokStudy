package ch9;

class WrapperEx1 {
    public static void main(String[] args) {
        Integer i = new Integer(100);
        Integer i2 = new Integer(100);
        // Integer i3 = 200; // 오토 박싱, 오토 언박싱으로 바뀌어서 이렇게 써도 됨

        System.out.println("i==i2?" + (i == i2));
        System.out.println("i.equals(i2)?" + (i.equals(i2)));
        System.out.println("i.toString()=" + i.toString());

        System.out.println("MAX_VALUE=" + Integer.MAX_VALUE);
        System.out.println("MIN_VALUE=" + Integer.MIN_VALUE);
        System.out.println("SIZE=" + Integer.SIZE + " bits");
        System.out.println("TYPE=" + Integer.TYPE);
    }
}
