package ch13;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class DialogTest2 {
    public static void main(String[] args) {
        Frame f = new Frame("Parent");
        f.setSize(300, 200);

        final Dialog info = new Dialog(f, "Infomation", true);
        info.setSize(140, 90);
        info.setLocation(50, 50);
        info.setLayout(new FlowLayout());

        Label msg = new Label("This is modal Dialog", Label.CENTER);
        Button ok = new Button("OK");

        ok.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
//                info.setVisible(false);
                info.dispose();
            }
        });

        info.add(msg);
        info.add(ok);

        f.setVisible(true);
        info.setVisible(true);
    }
}
