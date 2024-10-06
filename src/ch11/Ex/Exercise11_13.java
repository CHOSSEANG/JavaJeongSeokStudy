package ch11.Ex;

import java.util.Comparator;
import java.util.HashMap;
import java.util.TreeMap;

class Exercise11_13 {
    public static void main(String[] args) throws Exception {
        SutdaDeck2 deck = new SutdaDeck2();

        deck.shuffle();
        Player3[] pArr ={
                new Player3("타짜", deck.pick(), deck.pick()),
        new Player3("고수", deck.pick(), deck.pick()),
        new Player3("물주", deck.pick(), deck.pick()),
        new Player3("중수", deck.pick(), deck.pick()),
        new Player3("하수", deck.pick(), deck.pick()),
        };


        TreeMap rank = new TreeMap(new Comparator(){
            public int compare(Object o1, Object o2) {
                    Player3 p1 = (Player3) o1;
                    Player3 p2 = (Player3) o2;

                    return p2.point - p1.point;
            }
        });

        for (int i = 0; i<pArr.length; i++) {
            Player3 p = pArr[i];
            rank.put(p, deck.getPoint(p));
            System.out.println(p+" "+deck.getPoint(p));
        }

        System.out.println();
        System.out.println("1위는 "+rank.firstKey()+"입니다.");
    }
}

class SutdaDeck2 {
    final int CARD_NUM = 20;
    SutdaCard3[] cards = new SutdaCard3[CARD_NUM];

    int pos = 0;
    HashMap jokbo = new HashMap();

    SutdaDeck2() {
        for (int i = 0; i < cards.length; i++) {
            int num = i % 10 + 1;
            boolean isKwang = i < 10 && (num == 1 || num == 3 || num == 8);

            cards[i] = new SutdaCard3(num, isKwang);
        }
        registerJokbo();
    }

    void registerJokbo() {
        jokbo.put("KK", 4000);
        jokbo.put("1010", 3100);
        jokbo.put("99", 3090);
        jokbo.put("88", 3080);
        jokbo.put("77", 3070);
        jokbo.put("66", 3060);
        jokbo.put("55", 3050);
        jokbo.put("44", 3040);
        jokbo.put("33", 3030);
        jokbo.put("22", 3020);
        jokbo.put("11", 3010);

        jokbo.put("12", 2060);
        jokbo.put("21", 2060);
        jokbo.put("14", 2050);
        jokbo.put("41", 2050);
        jokbo.put("19", 2040);
        jokbo.put("91", 2040);
        jokbo.put("110", 2030);
        jokbo.put("101", 2030);
        jokbo.put("104", 2020);
        jokbo.put("410", 2020);
        jokbo.put("46", 2010);
        jokbo.put("64", 2010);
    }

    int getPoint(Player3 p) {
        if(p==null) return 0;

        SutdaCard3 c1 = p.c1;
        SutdaCard3 c2 = p.c2;

        Integer result = 0;

        if (c1.isKwang == true && c2.isKwang == true) {
            result = (Integer) jokbo.get("KK");
        } else {
            result = (Integer) jokbo.get("" + c1.num + c2.num);

            if (result == null) {
                result = new Integer((c1.num + c2.num) % 10 + 1000);
            }
        }

        p.point = result.intValue();

        return result.intValue();
    }

    SutdaCard3 pick() throws Exception {
        SutdaCard3 c = null;

        if (0 <= pos && pos < CARD_NUM) {
            c = cards[pos];
            cards[pos++] = null;
        } else {
            throw new Exception("남아있는 카드가 없습니다.");
        }

        return c;
    }

    void shuffle() {
        for (int x = 0; x < CARD_NUM * 2; x++) {
            int i = (int) (Math.random() * CARD_NUM);
            int j = (int) (Math.random() * CARD_NUM);

            SutdaCard3 tmp = cards[i];
            cards[i] = cards[j];
            cards[j] = tmp;
        }
    }
}

class Player3 {
    String name;
    SutdaCard3 c1;
    SutdaCard3 c2;

    int point;

    Player3(String name, SutdaCard3 c1, SutdaCard3 c2) {
        this.name = name;
        this.c1 = c1;
        this.c2 = c2;
    }

    public String toString() {
        return "[" + name + "]" + c1.toString() + "," + c2.toString();
    }
}

class SutdaCard3 {
    int num;
    boolean isKwang;

    SutdaCard3() {
        this(1, true);
    }

    public SutdaCard3(int num, boolean isKwang) {
        this.num = num;
        this.isKwang = isKwang;
    }

    public String toString() {
        return num + (isKwang ? "K" : "");
    }
}
