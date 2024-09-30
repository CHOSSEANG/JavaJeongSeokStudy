package ch8;

class FinallyTest2 {
    public static void main(String[] args) {
        try {
            startInstall();
            copyFiles();
            deleteTempFiles();
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            deleteTempFiles();
        }
    }

    static void startInstall() {

    }
    static void copyFiles() {}
    static void deleteTempFiles() {}
}
