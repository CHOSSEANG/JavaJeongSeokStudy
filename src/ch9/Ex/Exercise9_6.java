package ch9.Ex;

public class Exercise9_6 {
    public static String fillZero(String src, int length) {
        if (src == null || src.length() == length) {
            return src;
        }

        if (length <= 0) {
            return "";
        }

        if (src.length() > length) {
            src = src.substring(0, length);
            return src;
        }

        char[] charArr = new char[length];
        for (int i = 0; i < src.length(); i++) {
            charArr[i] = '0';
        }
        for (int i = 0; i < src.length(); i++) {
            charArr[length-i-1] = src.charAt(src.length()-i-1);
        }
        return new String(charArr);
    }

    public static void main(String[] args) {
        String src = "12345";
        System.out.println(fillZero(src, 10));
        System.out.println(fillZero(src, -1));
        System.out.println(fillZero(src, 3));
    }
}
