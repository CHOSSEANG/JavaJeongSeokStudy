package ch13;

import java.awt.*;

class MenuTest {
    public static void main(String[] args) {
        Frame f = new Frame("Frame with Menu");
        f.setSize(300, 200);

        MenuBar mb = new MenuBar();
        Menu mFile = new Menu("File");

        MenuItem miNew = new MenuItem("New");
        MenuItem miOpen = new MenuItem("Open");
        Menu mOthers = new Menu("Others");
        MenuItem miExit = new MenuItem("Exit");

        mFile.add(miNew);
        mFile.add(miOpen);
        mFile.add(mOthers);
        mFile.addSeparator();

        mFile.add(miExit);

        MenuItem miPrint = new MenuItem("Print ...");
        MenuItem miPreview = new MenuItem("Print Preview");
        MenuItem miSetup = new MenuItem("Print Setup ...");
        mOthers.add(miPrint);
        mOthers.add(miPreview);
        mOthers.add(miSetup);

        Menu mEdit = new Menu("Edit");
        Menu mView = new Menu("View");
        Menu mHelp = new Menu("Help");
        CheckboxMenuItem miStatusbar = new CheckboxMenuItem("Statusbar");
        mView.add(miStatusbar);

        mb.add(mFile);
        mb.add(mEdit);
        mb.add(mView);
        mb.setHelpMenu(mHelp);

        f.setMenuBar(mb);
        f.setVisible(true);
    }
}
