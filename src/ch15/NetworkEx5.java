package ch15;

import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.URL;

class NetworkEx5 {
    public static void main(String[] args) {
        URL url = null;
        InputStream in = null;
        FileOutputStream out = null;
        String address = "https://www.naver.com";

        int ch = 0;
        try {
            url = new URL(address);
            in = url.openStream();
            out = new FileOutputStream("flashjav2_src.zip");

            while ((ch = in.read()) != -1) {
                out.write(ch);
            }
            in.close();
            out.close();
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}
