package ch10;

class InnerEx2 {
    class InstanceInner {    }
    static class StaticInner { }

    InstanceInner iv = new InstanceInner();
    static StaticInner cv = new StaticInner();

    static void staticMethod() {
//        InstanceInner obj1 = new InstanceInner(); static멤버는 인스턴스 멤버에 직접 접근 불가
        StaticInner obj2 = new StaticInner();

        InnerEx2 outer = new InnerEx2();
        InstanceInner obj1 = outer.new InstanceInner();
    }

    void instanceMethod() {
        InstanceInner obj1 = new InstanceInner();
        StaticInner obj2 = new StaticInner();

//        LocalInner lv = new LocalInner();  // 메서드 내에 지역적으로 선언된 내부 클래스는 외부에서 접ㄱ느 불가
    }

    void myMethod() {
        class LocalInner{}
        LocalInner lv = new LocalInner();
    }
}
