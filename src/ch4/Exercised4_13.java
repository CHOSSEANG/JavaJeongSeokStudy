package ch4;

public class Exercised4_13 {
    public static void main(String[] args) {
        String value = "12o34";
        char ch = ' ';
        boolean isNumber = true;

        for (int i = 0; i < value.length(); i++) {
            ch = value.charAt(i);
            if(ch>='0' && ch<='9'){

            } else{
                isNumber = false;
                break;
            }
        }

        if (isNumber) {
            System.out.println(value + "는 숫자입니다.");
        } else {
            System.out.println(value + "는 숫자가 아닙니다.");
        }
    }
}
