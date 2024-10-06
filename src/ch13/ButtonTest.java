package ch13;

import java.awt.*;

class ButtonTest {
    public static void main(String[] args) {
        Frame f = new Frame("Login");
        f.setSize(300, 200);

        Button b = new Button("확 인");
        b.setSize(100, 50);

        f.add(b);
        f.setVisible(true);
    }
}
