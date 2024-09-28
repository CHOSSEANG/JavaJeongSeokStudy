package ch6;

class Exercise6_6 {
    static double getDistance(int x, int y, int x1, int y1) {
        int dx = x - x1;
        int dy = y - y1;
        return Math.sqrt(dx * dx + dy * dy);
    }

    public static void main(String[] args) {
        System.out.println(getDistance(1, 1, 2, 2));
    }
}
