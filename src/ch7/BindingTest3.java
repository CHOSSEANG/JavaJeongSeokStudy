package ch7;

public class BindingTest3 {
    // 복습 필요
    public static void main(String[] args) {
        Parent5 p = new Child5();
        Child5 c = new Child5();
        Child5 d = (Child5) p;

        System.out.println("p.x = " + p.x);
        System.out.println("d.x = " + d.x);
        p.method();
        d.method();
//        System.out.println();
//        System.out.println("c.x = " + c.x);
//        c.method();
    }
}

class Parent5 {
    int x = 100;

    void method() {
        System.out.println("Parent Method");
    }

    public Parent5() {
        super();
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }
}

class Child5 extends Parent5 {
    int x = 200;

    void method() {
        System.out.println("x=" + x);
        System.out.println("super.x = " + super.x);
        System.out.println("this.x=" + this.x);
    }
}
