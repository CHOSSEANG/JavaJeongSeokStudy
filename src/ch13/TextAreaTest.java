package ch13;

import java.awt.*;

class TextAreaTest {
    public static void main(String[] args) {
        Frame f = new Frame("Comments");
        f.setSize(400, 200);
        f.setLayout(new FlowLayout());

        TextArea comments = new TextArea("하고 싶은 말을 적으세요.", 10, 50);

        f.add(comments);
        comments.selectAll();
        f.setVisible(true);
    }
}
