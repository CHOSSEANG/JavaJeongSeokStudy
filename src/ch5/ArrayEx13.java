package ch5;

public class ArrayEx13 {
    public static void main(String[] args) {
        // 터미널로 매개변수 전달시 매개변수 값 확인 예제
        System.out.println("매개변수의 개수 : " + args.length);
        for(int i=0;i<args.length;i++) {
            System.out.println("args[" + i + "] = \"" + args[i] + "\"");
        }
    }
}
