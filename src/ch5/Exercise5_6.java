package ch5;

public class Exercise5_6 {
    public static void main(String[] args) {
        int[] coinUnit = {500, 100, 50, 10};

        int money = 2680;
        System.out.println("money=" + money);

        for(int i =0;i<coinUnit.length;i++){
            int coin =0;
            coin=money/coinUnit[i];
            money = money%coinUnit[i];
            System.out.println(coinUnit[i]+"원: "+coin);
        }
    }
}
