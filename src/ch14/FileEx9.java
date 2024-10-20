package ch14;

import java.io.File;

class FileEx9 {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("USAGE : java FileEx9 pattern");
            System.exit(0);
        }

        File dir = new File(args[0]);

        if(!dir.exists() || !dir.isDirectory()) {
            System.out.println("유효하지 않은 디렉토리입니다.");
            System.exit(0);
        }
    }
}
