package ch13;

import java.awt.*;

class TextFieldTest {
    public static void main(String[] args) {
        Frame f = new Frame("Login");
        f.setSize(400, 65);
        f.setLayout(new FlowLayout());

        Label lid = new Label("ID :", Label.RIGHT);
        Label ipwd = new Label("Password :", Label.RIGHT);

        TextField id = new TextField(10);
        TextField pwd = new TextField(10);
        pwd.setEchoChar('*');

        f.add(lid);
        f.add(id);
        f.add(ipwd);
        f.add(pwd);
        f.setVisible(true);
    }
}
