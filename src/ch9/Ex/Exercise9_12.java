package ch9.Ex;

class Exercise9_12 {

    static int getRand(int from, int to) {
        int minNum= Math.min(from, to);
        int diff = minNum==from ? to - from : from - minNum;
        int num = (int)(Math.random()*diff)+minNum;

        return num;

//        return (int)(Math.random() * (Math.abs(to-from)+1) + Math.min(from,to)); 정답!! 엄청 간단하게 해서 참조 후 추후 복습
    }

    public static void main(String[] args) {
        for (int i = 0; i < 20; i++) {
            System.out.print(getRand(1,-3)+",");
        }
    }
}
