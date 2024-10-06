package ch11.Ex;

import java.util.*;

// 문제 어려움
// 복습 필수
class Student5 implements Comparable {
    String name;
    int ban;
    int no;
    int kor;
    int eng;
    int math;

    int total;
    int schoolRank;
    int classRank;

    public Student5(String name, int ban, int no, int kor, int eng, int math) {
        this.name = name;
        this.ban = ban;
        this.no = no;
        this.kor = kor;
        this.eng = eng;
        this.math = math;

        total = kor + eng + math;
    }

    int getTotal() {
        return total;
    }

    float getAverage() {
        return (int)((getTotal()/3f)*10+0.5)/10f;
    }

    public int compareTo(Object o) {
        if (o instanceof Student5) {
            Student5 tmp = (Student5) o;

            return tmp.total - getTotal();
        } else {
            return -1;
        }
    }

    public String toString() {
        return name + ", " + ban + ", " + no + ", " + kor
                + ", " + eng + ", " + math + "," + getTotal() + "," + getAverage() + "," + schoolRank+","+classRank;
    }
}

class ClassTotalComparator2 implements Comparator {
    public int compare(Object o1, Object o2) {

            Student5 s1 = (Student5) o1;
            Student5 s2 = (Student5) o2;

            int result = s1.ban - s2.ban;

            if (result == 0) {
                result = s2.total - s1.total;
            }

            return result;
    }
}

public class Exercise11_9 {
    public static void calculateClassRank(List list) {

        Collections.sort(list,new ClassTotalComparator2());

        int prevBan = -1;
        int prevRank = -1;
        int prevTotal = -1;
        int length = list.size();

        for(int i = 0, n=0; i < length; i++,n++) {
            Student5 s1 = (Student5) list.get(i);

            if(s1.ban != prevBan) {
                prevRank = -1;
                prevTotal = -1;
                n = 0;
            }
            if (s1.total == prevTotal) {
                s1.classRank = prevRank;
            } else {
                s1.classRank = n + 1;
            }

            prevBan = s1.ban;
            prevTotal = s1.total;
            prevRank = s1.schoolRank;
        }
    }

    public static void calculateSchoolRank(List list) {
        Collections.sort(list);

        int prevRank = -1;
        int prevTotal = -1;
        int length = list.size();

        for(int i = 0; i < length; i++) {
            Student5 s = (Student5)list.get(i);
            if (s.total == prevTotal) {
                s.schoolRank = prevRank;
            } else {
                s.schoolRank = i +1;
            }

            prevRank = s.schoolRank;
            prevTotal = s.total;
        }
    }

    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add(new Student5("이자바", 2, 1, 70, 90, 70));
        list.add(new Student5("안자바", 2, 2, 60, 100, 80));
        list.add(new Student5("홍길동", 1, 3, 100, 100, 100));
        list.add(new Student5("남궁성", 1, 1, 90, 70, 80));
        list.add(new Student5("김자바", 1, 2, 80, 80, 90));


        calculateSchoolRank(list);
        calculateClassRank(list);

        Iterator it = list.iterator();

        while(it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
