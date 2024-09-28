package ch6;

class MyPoint {
    int x;
    int y;

    MyPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    double getDistance(int p1, int p2) {
        int dx = x - p1;
        int dy = y - p2;
        return Math.sqrt(dx * dx + dy * dy);
    }
}

class Exercise6_7 {
    public static void main(String[] args) {
        MyPoint p = new MyPoint(1, 1);

        System.out.println(p.getDistance(2, 2));
    }
}
