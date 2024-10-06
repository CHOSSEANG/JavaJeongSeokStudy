package ch13;

import java.awt.*;

class BorderLayoutTest {
    public static void main(String[] args) {
        Frame f = new Frame("BorderLayoutTest");
        f.setSize(200, 200);

        f.setLayout(new BorderLayout());
        Button north = new Button("North");
        Button south = new Button("South");
        Button east = new Button("East");
        Button west = new Button("West");
        Button center = new Button("Center");

        f.add(north, "North");
        f.add(south, "South");
        f.add(east, "East");
        f.add(west, "West");
        f.add(center, "Center");

        f.setVisible(true);
    }
}
