package ch13;

import java.awt.*;

class ButtonTest2 {
    public static void main(String[] args) {
        Frame f = new Frame("Login");
        f.setSize(300, 200);
        f.setLayout(null);

        Button b = new Button("확 인");
        b.setSize(100, 50);
        b.setLocation(100, 75);

        f.add(b);
        f.setVisible(true);
    }
}
