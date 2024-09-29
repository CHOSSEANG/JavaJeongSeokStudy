package ch7.Ex;

class SutdaDeck {
    final int CARD_NUM = 20;
    SutdaCard3[] cards = new SutdaCard3[CARD_NUM];

    SutdaDeck() {
        int count= 0;
        for(int i = 0; i < cards.length; i++) {
            int num = i%10+1;
            boolean kwang;
            if ((num == 1 || num == 3 || num == 8) && (count == 0)) {
                kwang = true;
                if(num == 8 & count == 0){
                    count =1;
                }
            } else  {
                kwang = false;
            }
            cards[i] = new SutdaCard3(num,kwang);
        }
    }
}

class SutdaCard {
    int num;
    boolean isKwang;

    SutdaCard() {
        this(1,true);
    }

    SutdaCard(int num, boolean isKwang) {
        this.num = num;
        this.isKwang = isKwang;
    }

    public String toString() {
        return num + (isKwang ? "K" : "");
    }
}
public class Exercise7_1 {
    public static void main(String[] args) {
        SutdaDeck2 deck = new SutdaDeck2();

        for(int i =0; i<deck.cards.length; i++) {
            System.out.print(deck.cards[i] + ",");
        }
    }
}
