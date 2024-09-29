package ch7;

import java.util.zip.Adler32;

class Product2 {
    int price;
    int bonusPoint;

    Product2(int price) {
        this.price = price;
        bonusPoint = (int) (price / 10.0);
    }

    Product2() {
        price = 0;
        bonusPoint = 0;
    }
}

class Tv3 extends Product2 {
    //super의 용도가 이해가 잘 안된다. 추후 복습
    Tv3() {
        super(100);
    }

    public String toString() {
        return "Tv";
    }
}

class Computer2 extends Product2 {
    Computer2() {
        super(200);
    }

    public String toString() {
        return "Computer";
    }
}

class Audio extends Product2 {
    Audio() {
        super(50);
    }

    public String toString() {
        return "Audio";
    }
}

class Buyer2{
    int money = 1000;
    int bonusPoint = 0;
    Product2[] item = new Product2[10];
    int i = 0;

    void buy(Product2 p) {
        if (money < p.price) {
            System.out.println("잔액이 부족하여 물건을 살 수 없습니다.");
            return;
        }

        money -= p.price;
        bonusPoint += p.bonusPoint;
        item[i++] = p;
        System.out.println(p + "을/를 구입하셨습니다.");
    }

    void summary() {
        int sum = 0;
        String itemList = "";

        for(int i=0;i<item.length;i++) {
            if(item[i]==null) break;
            sum += item[i].price;
            itemList += (i == 0) ? "" + item[i] : ", " + item[i];
        }
        System.out.println("구입하신 물품의 총금액은 " + sum + "만원입니다.");
        System.out.println("구입하신 제품은 " + itemList + "입니다.");
    }
}

class PolyArgumentTest2 {
    public static void main(String[] args) {
        Buyer2 b = new Buyer2();
        Tv3 tv = new Tv3();
        Computer2 com = new Computer2();
        Audio audio = new Audio();

        b.buy(tv);
        b.buy(com);
        b.buy(audio);
        b.summary();
    }
}
