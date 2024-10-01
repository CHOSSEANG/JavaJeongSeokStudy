package ch9.Ex;

class Exercise9_11 {

    static void gugudan(String first, String second) {
        int firstNum = Integer.parseInt(first);
        int secondNum = Integer.parseInt(second);

        for (int i = firstNum; i <= secondNum; i++) {
            for (int j = 1; j < 10; j++) {
                System.out.println(i + "*" + j + "=" + i*j);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        gugudan(args[0],args[1]);
    }
}
