package ch9.Ex;

class Exercise9_7 {

    public static boolean contains(String src, String target) {
        int count = 0;
        while (true) {
            int index = src.indexOf(target, count);

            if (index == -1) {
                return false;
            } else {
                return true;
            }
        }
    }

    public static void main(String[] args) {
        System.out.println(contains("12345", "23"));
        System.out.println(contains("12345","67"));
    }
}
