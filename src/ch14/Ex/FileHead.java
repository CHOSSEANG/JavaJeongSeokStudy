package ch14.Ex;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileHead {
    public static void main(String[] args) {
        if(args.length != 2) {
            System.out.println("USAGE : java FileHead " + args[0] + " FILENAME");
            System.exit(0);
        }

        try {
            int num = Integer.parseInt(args[0]);
            String fileName = args[1];
            File file = new File(args[1]);

            if(!file.exists() || file.isDirectory()) {
                System.out.println(fileName +"은/는 디렉토리이거나, 존재하지 않는 파일입니다.");
            }
            FileReader fr = new FileReader(fileName);

            BufferedReader br = new BufferedReader(fr);

            String line = "";
            for (int i = 1; i < num+1; i++) {
                line=br.readLine();
                System.out.println(i+":"+line);

            }
            br.close();
        } catch(IOException e) {}

    }
}
