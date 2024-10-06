package ch13;

import java.awt.*;

class FontList {
    public static void main(String[] args) {
        GraphicsEnvironment ge = null;
        ge= GraphicsEnvironment.getLocalGraphicsEnvironment();
        Font[] fonts = ge.getAllFonts();

        for (int i = 0; i < fonts.length; i++) {
            System.out.println(fonts[i].getFontName());
        }
    }
}
