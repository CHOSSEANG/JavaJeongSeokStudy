package ch7;

class InterfaceTest3 {
    public static void main(String[] args) {
        A2 a = new A2();
        a.methodA();
    }
}

class A2 {
    void methodA() {
        I1 i = InstanceManager.getInstance();
        i.methodB();
    }
}

interface I1 {
    public abstract void methodB();
}

class B2 implements I1 {
    public void methodB() {
        System.out.println("methodB in B class");
    }
}

class InstanceManager {
    public static I1 getInstance() {
        return new B2();
    }
}