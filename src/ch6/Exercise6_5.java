package ch6;

class Exercise6_5 {
    public static void main(String[] args) {
        Student s = new Student("홍길동", 1, 1, 100, 60, 76);

        System.out.println(s.info());
    }
}

class Student {
    String name;
    int ban;
    int no;
    int kor;
    int eng;
    int math;

    public Student(){}


    public Student(String name, int ban, int no, int kor, int eng, int math) {
        this.name = name;
        this.ban = ban;
        this.no = no;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
    }

    public int getTotal() {
        int total = 0;
        total = this.kor + this.eng + this.math;

        return total;
    }

    public float getAverage() {
        int total = getTotal();
        float aver = (float) total / 3;

        float average = Math.round(aver*10f)/10f;
        return average;
    }

    public String info() {
        String result = this.name + ","+this.ban + ","+this.no + ","+this.kor + ","+this.eng + ","+this.math+","+getTotal()+","+getAverage();
        return result;
    }
}
