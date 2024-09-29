package ch7.Ex;

class Product {
    int price;
    int bonusPoint;

    Product() {

    }

    Product(int price) {
        this.price = price;
        bonusPoint = (int) (price / 10.0);
    }
}

// Product 의 생성자를 생성하지 않아서 발생하는 문제
class Tv extends Product {
    Tv () {
    }

    public String toString() {
        return "Tv";
    }
}

class Exercise7_5 {
    public static void main(String[] args) {
        Tv t = new Tv();
    }
}
