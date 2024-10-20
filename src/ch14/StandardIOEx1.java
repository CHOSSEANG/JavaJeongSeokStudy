package ch14;

import java.io.IOException;

class StandardIOEx1 {
    public static void main(String[] args) {
        try {
            int input = 0;

            while ((input = System.in.read()) != -1) {
                System.out.println("input :" + input + ", (char)input :" + (char) input);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
