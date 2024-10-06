package ch11.Ex;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

// 정답이 틀림 나중에 복습
class Exercise11_15 {
    static int paycheckCount(Calendar from, Calendar to) {
        if (from == null || to == null) {
            return 0;
        }

        if (from == to && from.get(Calendar.DATE) == 20) {
            return 1;
        }

        Date d1 = new Date(from.getTimeInMillis());
        Date d2 = new Date(to.getTimeInMillis());

        int m1 = d1.getYear()*12 + d1.getMonth();
        int m2 = d2.getYear()*12 + d2.getMonth();

        int monDiff = m2 - m1;

        System.out.println(monDiff);

        if (monDiff < 0) {
            return 0;
        } else if (from.get(Calendar.DAY_OF_MONTH) >= 21) {
            ++monDiff;
        } else if (from.get(Calendar.DAY_OF_MONTH) > 21 && to.get(Calendar.DAY_OF_MONTH) < 21) {
            --monDiff;
        }

        return monDiff;
    }

    static void printResult(Calendar from, Calendar to) {
        Date fromDate = from.getTime();
        Date toDate = to.getTime();

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

        System.out.print(sdf.format(fromDate) + "~"+ sdf.format(toDate) + ":");
        System.out.println(paycheckCount(from, to));
    }

    public static void main(String[] args) {
        Calendar fromCal = Calendar.getInstance();
        Calendar toCal = Calendar.getInstance();

        fromCal.set(2010, 0, 1);
        toCal.set(2010, 0, 1);
        printResult(fromCal, toCal);

        fromCal.set(2010, 0, 21);
        toCal.set(2010, 0, 21);
        printResult(fromCal, toCal);

        fromCal.set(2010, 0, 1);
        toCal.set(2010, 2, 1);
        printResult(fromCal, toCal);

        fromCal.set(2010, 0, 1);
        toCal.set(2010, 2, 23);
        printResult(fromCal, toCal);

        fromCal.set(2010, 0, 23);
        toCal.set(2010, 2, 21);
        printResult(fromCal, toCal);

        fromCal.set(2010, 0, 22);
        toCal.set(2010, 2, 21);
        printResult(fromCal, toCal);
    }
}
