package ch5;

public class ArrayEx9 {
    public static void main(String[] args) {
        //문자열 모스부호 변환 예제
        String source = "SOSHELP";
        String[] morse = {
                ".-", "-...", "-.-.", "-..", ".",
                "..-.", "--.", "....", "..", ".---",
                "-.-", ".-..", "--", "-.", "---",
                ".--.", "--.-", ".-.", "...", "-"
                , "..-", "...-", ".--", "-..-", "-.--"
                , "--.."
        };
        String result = "";

        for (int i = 0; i < source.length(); i++) {
            result += morse[source.charAt(i) - 'A'];
        }
        System.out.println("source:" + source);
        System.out.println("morse:" + result);
    }
}
