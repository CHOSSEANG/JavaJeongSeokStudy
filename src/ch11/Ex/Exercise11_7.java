package ch11.Ex;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

class Student3 {
    String name;
    int ban;
    int no;
    int kor;
    int eng;
    int math;

    public Student3(String name, int ban, int no, int kor, int eng, int math) {
        this.name = name;
        this.ban = ban;
        this.no = no;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
    }

    int getTotal() {
        return kor + eng + math;
    }

    float getAverage() {
        return (int)((getTotal()/3f)*10+0.5)/10f;
    }

    public String toString() {
        return name + ", " + ban + ", " + no + ", " + kor + ", " + eng + ", " + math + "," + getTotal() + "," + getAverage();
    }
}

class BanNoAscending implements Comparator {
    public int compare(Object o1, Object o2) {
        if (o1 instanceof Student3 && o2 instanceof Student3) {
            Student3 s = (Student3) o1;
            Student3 s2 = (Student3) o2;

            return (s.ban > s2.ban) ? 1 : ((s.ban == s2.ban) ? (s.no > s2.no) ? 1 : -1 : -1);
        }
        return -1;
    }
}

class Exercise11_7 {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add(new Student3("이자바", 2, 1, 70, 90, 70));
        list.add(new Student3("안자바", 2, 2, 60, 100, 80));
        list.add(new Student3("홍길동", 1, 3, 100, 100, 100));
        list.add(new Student3("남궁성", 1, 1, 90, 70, 80));
        list.add(new Student3("김자바", 1, 2, 80, 80, 90));

        Collections.sort(list, new BanNoAscending());

        Iterator it = list.iterator();

        while(it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
