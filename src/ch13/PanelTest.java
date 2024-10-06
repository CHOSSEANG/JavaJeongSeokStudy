package ch13;

import java.awt.*;

class PanelTest {
    public static void main(String[] args) {
        Frame f = new Frame("Panel");
        f.setSize(300, 200);
        f.setLayout(null);

        Panel p = new Panel();
        p.setBackground(Color.green);
        p.setSize(100, 100);
        p.setLocation(50, 50);

        Button ok = new Button("OK");

        p.add(ok);
        f.add(p);
        f.setVisible(true);
    }
}
