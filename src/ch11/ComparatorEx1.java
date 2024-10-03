package ch11;

import java.util.Comparator;
import java.util.TreeSet;

class ComparatorEx1 {
    public static void main(String[] args) {
        TreeSet set1 = new TreeSet();
        TreeSet set2 = new TreeSet(new Descending());

        int[] score = {30, 50, 10, 20, 40};

        for (int i = 0; i < score.length; i++) {
            set1.add(new Integer(score[i]));
            set2.add(new Integer(score[i]));
        }

        System.out.println("set1 : " + set1);
        System.out.println("set2 : " + set2);
    }
}

class Descending implements Comparator {
    public int compare(Object o1, Object o2) {
        if(o1 instanceof Comparable && o2 instanceof Comparable) {
            Comparable c1 = (Comparable) o1;
            Comparable c2 = (Comparable) o2;
            return c1.compareTo(c2)*-1;
        }

        return -1;
    }
}