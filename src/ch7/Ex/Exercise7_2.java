package ch7.Ex;

class SutdaDeck2 {
    final int CARD_NUM = 20;
    SutdaCard3[] cards = new SutdaCard3[CARD_NUM];

    SutdaDeck2() {
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
    public void shuffle() {
        for(int i = 0; i < cards.length; i++) {
            SutdaCard3 temp = cards[i];
            int randNum = (int) (Math.random() * cards.length);
            cards[i] = cards[randNum];
            cards[randNum] = temp;
        }
    }

    public SutdaCard3 pick(int index) {
        return cards[index];
    }

    public SutdaCard3 pick() {
        int randNum = (int) (Math.random() * cards.length);
        return cards[randNum];
    }
}

class SutdaCard2 {
    int num;
    boolean isKwang;

    SutdaCard2() {
        this(1,true);
    }

    SutdaCard2(int num, boolean isKwang) {
        this.num = num;
        this.isKwang = isKwang;
    }

    public String toString() {
        return num + (isKwang ? "K" : "");
    }
}
public class Exercise7_2 {
    public static void main(String[] args) {
        SutdaDeck2 deck = new SutdaDeck2();

        System.out.println(deck.pick(0));
        System.out.println(deck.pick());
        deck.shuffle();

        for(int i =0; i<deck.cards.length; i++) {
            System.out.print(deck.cards[i] + ",");
        }

        System.out.println();
        System.out.println(deck.pick(0));
    }
}
