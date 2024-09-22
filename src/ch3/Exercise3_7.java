package ch3;

public class Exercise3_7 {
    public static void main(String[] args) {
        int fahrenheit = 100;
        float celcius=(float)5/9*((float)fahrenheit-32);

        celcius =  ((int)((celcius+0.0005f) * 1000)) / 1000f; // 셋째 자리 반올림을 위해 넷째 자리에 0.0005f를 더해서 반올림(5이상일 경우 반올림 됨)

        System.out.println("Fahrenheit: " + fahrenheit);
        System.out.println("Celcius: " + celcius);
    }
}
