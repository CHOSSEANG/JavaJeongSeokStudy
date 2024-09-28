package ch5;

public class Exercise5_10 {
    public static void main(String[] args) {
        char[] abcCode =
                {'`', '~', '!', '@', '#', '$', '%', '^', '&', '*',
                        '(', ')', '-', '_', '+', '+', '|', '[', ']', '{',
                        '}', ';', ':', ',', '.', '/'
                };
                        // 0    1   2     3    4    5    6    7    8    9
        char[] numCode = {'q', 'w', 'e', 'r', 't', 'y', 'u', 'i', 'o', 'p'};

        String src = "abc123";
        String result = "";

        for (int i = 0; i < src.length(); i++) {
            char ch= src.charAt(i);
            if(ch>='a' && ch<='z'){
                result += abcCode[(int)ch-97];
            }
            if(ch>='0' && ch<='9'){
                result += numCode[(int)ch-48];
            }
        }

        System.out.println("src:" + src);
        System.out.println("result:" + result);
    }
}
