package ch13;

import java.awt.*;

// 색깔이 표시가 안됨
// 추후 복습 필요
class ColorTest {
    public static void main(String[] args) {
        Frame f = new Frame("ColorTest");
        f.setLayout(new GridLayout(14, 2));

        Panel p1 = new Panel();
        Panel p2 = new Panel();
        Panel p3 = new Panel();
        Panel p4 = new Panel();
        Panel p5 = new Panel();
        Panel p6 = new Panel();
        Panel p7 = new Panel();
        Panel p8 = new Panel();
        Panel p9 = new Panel();
        Panel p10 = new Panel();
        Panel p11 = new Panel();
        Panel p12 = new Panel();
        Panel p13 = new Panel();
        Panel p14 = new Panel();
        f.add(new Label("Color.black"));
        f.add(new Label("Color.blue"));
        f.add(new Label("Color.cyan"));
        f.add(new Label("Color.darkGray"));
        f.add(new Label("Color.green"));
        f.add(new Label("Color.lightGray"));
        f.add(new Label("Color.magenta"));
        f.add(new Label("Color.orange"));
        f.add(new Label("Color.pink"));
        f.add(new Label("Color.red"));
        f.add(new Label("Color.white"));
        f.add(new Label("Color.yellow"));
        f.add(new Label("Color(50, 100, 100)"));
        f.setSize(250, 300);
        f.setVisible(true);
    }
}
