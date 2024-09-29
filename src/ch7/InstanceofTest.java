package ch7;

class InstanceofTest {
    public static void main(String[] args) {
        FireEngine2 fe = new FireEngine2();

        if(fe instanceof FireEngine2) {
            System.out.println("This is a FireEngine instance");
        }

        if (fe instanceof Car3) {
            System.out.println("This is a Car instance");
        }

        if (fe instanceof Object) {
            System.out.println("This is a Object instance");
        }
    }
}

class Car3 {}
class FireEngine2 extends Car3 {}