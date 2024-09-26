package ch4;

public class Exercised4_5 {
    public static void main(String[] args) {
        int i = 0;
        int j = 0;
        while(true) {
            while(true){
                j++;
                System.out.print("*");
                if(j>i)
                    break;
            }
            j=0;
            i++;
            System.out.println();
            if (i > 10) {
                break;
            }
        }
    }
}
